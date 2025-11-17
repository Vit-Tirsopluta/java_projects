package lab9;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.io.IOException;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Random;

public class lab9{

    public static byte[] createAndPrintArray(String name, Random rand) {
        int N = 10;
        int a = 10;
        int b = 40;

        System.out.println("--- " + name + " ---");
        byte[] buffer = new byte[N];
        
        for (int i = 0; i < buffer.length; i++) {
            int randomValue = rand.nextInt(b - a + 1) + a;
            buffer[i] = (byte) randomValue;
            System.out.print(buffer[i] + " ");
        }
        System.out.println("\n");
        return buffer;
    }

    public static void main(String[] args) throws IOException {
        
        Random rand = new Random();

        byte[] buf1 = createAndPrintArray("Перший потік", rand);
        byte[] buf2 = createAndPrintArray("Другий потік", rand);
        byte[] buf3 = createAndPrintArray("Третій потік", rand);

        InputStream in1 = new ByteArrayInputStream(buf1);
        InputStream in2 = new ByteArrayInputStream(buf2);
        InputStream in3 = new ByteArrayInputStream(buf3);

        Vector<InputStream> myVector = new Vector<>();
        myVector.add(in1);
        myVector.add(in2);
        myVector.add(in3);

        Enumeration<InputStream> num = myVector.elements();

        InputStream inAll = new SequenceInputStream(num);

        int countAll = 0;
        System.out.println("--- Послідовний сумарний потік ---");
        int x;
        while ((x = inAll.read()) != -1) {
            System.out.print(x + " ");
            countAll++;
        }

        System.out.println("\n\nЗагальна кількість елементів = " + countAll);

        inAll.close();
        in1.close();
        in2.close();
        in3.close();
    }
}