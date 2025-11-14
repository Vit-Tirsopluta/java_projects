package lab8;

import java.io.*;

public class Example4_Outputchar {
    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab8/f1.txt";

        try {
            FileWriter myFile = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(myFile);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "CP1251"));

            System.out.println("Введіть рядок для запису у файл " + filename + ":");
            String s = br.readLine();

            bw.newLine();
            bw.write(s);

            bw.flush();
            bw.close();

            System.out.println("Рядок успішно додано у " + filename);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}