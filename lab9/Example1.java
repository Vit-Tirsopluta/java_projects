package lab9;

import java.io.*;
import java.util.*;

public class Example1 {
    public static void main(String[] args) throws Exception {
        try {
            byte bufl[] = new byte[10];
            System.out.println("Перший потік");
            for (int i = 0; i < bufl.length; i++) {
                bufl[i] = (byte) (Math.random() * 10);
                System.out.println(bufl[i]);
            }

            byte buf2[] = new byte[10];
            System.out.println("Другий потік");
            for (int i = 0; i < buf2.length; i++) {
                buf2[i] = (byte) (Math.random() * 50);
                System.out.println(buf2[i]);
            }

            byte buf3[] = new byte[10];
            System.out.println("Третій потік");
            for (int i = 0; i < buf3.length; i++) {
                buf3[i] = (byte) (Math.random() * 100);
                System.out.println(buf3[i]);
            }

            InputStream in1 = new ByteArrayInputStream(bufl);
            InputStream in2 = new ByteArrayInputStream(buf2);
            InputStream in3 = new ByteArrayInputStream(buf3);
            Vector myVector = new Vector();
            myVector.add(in1);
            myVector.add(in2);
            myVector.add(in3);
            Enumeration num = myVector.elements();
            InputStream inAll = new SequenceInputStream(num);
            int countAll = 0;
            System.out.println("Послідовний сумарний потік");
            int x;
            while ((x = inAll.read()) != -1) {
                System.out.print(x + " ");
                countAll++;
            }
            System.out.println("Загальна кількість елементів=" + countAll);
            in1.close();
            in2.close();
            in3.close();
            inAll.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}