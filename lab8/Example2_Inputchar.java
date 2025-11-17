package lab8;

import java.io.*;

public class Example2_Inputchar {
    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab8/f1.txt";

        try {
            FileReader myFile = new FileReader(filename);

            System.out.println("--- Вміст файлу " + filename + " ---");
            
            while (myFile.ready()) { //перевірка на вміст
                System.out.print((char) myFile.read()); //зчитування
            }
            
            System.out.println("\n--- Кінець файлу ---");
            
            myFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("ПОМИЛКА: Файл '" + filename + "' не знайдено!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}