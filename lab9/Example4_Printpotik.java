package lab9;

import java.io.*;


public class Example4_Printpotik {

    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab9/fl_print.txt";

        try {
            FileOutputStream out = new FileOutputStream(filename);
            PrintStream ps = new PrintStream(out);

            System.out.println("Записуємо дані у " + filename + " за допомогою .println()...");
            
            ps.print("Запис величини логічного типу: ");
            ps.println(true);
            ps.print("Запис величини цілого типу: ");
            ps.println(576937421);
            ps.print("Запис величини дійсного типу float: ");
            ps.println(78.345f);
            ps.print("Запис величини дійсного типу double: ");
            ps.println(37526.1289);
            ps.print("Запис величини символьного типу: ");
            ps.println('A');

            ps.flush();
            ps.close();
            
            System.out.println("Готово. Перевірте файл " + filename);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}