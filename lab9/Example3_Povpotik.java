package lab9;

import java.io.*;
import java.util.Random;


public class Example3_Povpotik {

    public static void main(String[] args) throws Exception {
        try {
            byte buf[] = new byte[10];
            Random rand = new Random();

            System.out.println("--- Початковий потік ---");
            for (int i = 0; i < buf.length; i++) {
                buf[i] = (byte) (rand.nextInt(20) + 1);
                System.out.print(buf[i] + " ");
            }
            System.out.println();

            ByteArrayInputStream bais = new ByteArrayInputStream(buf);
            PushbackInputStream push = new PushbackInputStream(bais);

            int max = 0;
            int current = 0;

            System.out.println("\n--- Пошук локального максимуму ---");
            while (push.available() > 0) {
                current = push.read();

                if (max <= current) {
                    max = current;
                    System.out.println("Поточний максимум: " + max);
                } else {
                    System.out.println("Знайшли спад (" + current + "). Повертаємо його назад.");
                    push.unread(current);
                    break;
                }
            }
            System.out.println("MAX LOCAL = " + max);

            System.out.println("\n--- Залишковий потік ---");
            while (push.available() > 0) {
                System.out.print(push.read() + " ");
            }
            System.out.println();
            
            push.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}