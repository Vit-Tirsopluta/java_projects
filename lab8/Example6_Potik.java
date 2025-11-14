package lab8;

import java.io.*;

public class Example6_Potik {
    public static void main(String[] args) throws Exception {
        String sourceFile = "java_projects/lab8/f1.txt";
        String destFile = "java_projects/lab8/f2.txt";
        String myKey = "JAVA";

        try {
            Reader input = new FileReader(sourceFile);
            Writer output = new FileWriter(destFile);
            
            int index = 0;
            int x;
            int charCode;

            System.out.println("Кодую " + sourceFile + " у " + destFile + "...");

            while (input.ready()) {
                charCode = input.read();
                x = myKey.charAt(index);

                output.write(charCode ^ x);

                index++;
                if (index == myKey.length()) {
                    index = 0;
                }
            }

            input.close();
            output.flush();
            output.close();
            System.out.println("Кодування завершено.");

        } catch (FileNotFoundException e) {
            System.out.println("ПОМИЛКА: " + sourceFile + " не знайдено!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}