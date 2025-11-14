package lab8;

import java.io.*;

public class Example3_Inputbyte {
    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab8/f1.txt";

        try {
            FileInputStream myFile = new FileInputStream(filename);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(myFile, "CP1251"));

            while (br.ready()) {
                System.out.print((char) br.read());
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ПОМИЛКА: Файл '" + filename + "' не знайдено!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}