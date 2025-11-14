package lab8;

import java.io.*;

public class Example1_Systemin {
    public static void main(String[] args) throws Exception {
        try {
            int myKey;
            System.out.println("Для виходу з програми введіть символ q і натисніть Enter");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "CP1251"));

            while ((myKey = br.read()) != 'q') {
                System.out.println(myKey + ": " + (char) myKey);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}