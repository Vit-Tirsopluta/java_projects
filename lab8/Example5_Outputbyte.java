package lab8;

import java.io.*;

public class Example5_Outputbyte {
    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab8/f2.txt";

        try {
            FileOutputStream myFile = new FileOutputStream(filename, true);

            int myKey;
            System.out.println("Введіть символи для запису у " + filename + " (введіть 'q' для виходу):");
            
            while ((myKey = System.in.read()) != 'q') {
                myFile.write(myKey);
            }
            
            myFile.flush();
            myFile.close();
            System.out.println("Дані записано у " + filename);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}