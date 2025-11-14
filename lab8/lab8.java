package lab8;
import java.io.*;


public class lab8 {
    public static void encodeDecode(String sourceFile, String destFile, String key) throws IOException {
        
        try (Reader input = new FileReader(sourceFile);
            Writer output = new FileWriter(destFile)) {
            
            int keyIndex = 0;
            int charCode;

            while (input.ready()) {
                charCode = input.read();
                
                int keyChar = key.charAt(keyIndex);

                output.write(charCode ^ keyChar);

                keyIndex++;
                if (keyIndex == key.length()) {
                    keyIndex = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        
        String myKey = "Морозко Віталій Юрійович";
        
        String originalText = "Розділювачі це символи, які використовуються для групування " +
                            "і впорядкування тексту Java-програми (вихідного коду). До " +
                            "розділю- вачів відносяться наступні конструкції: {}() [];,. і";

        String originalFile = "java_projects/lab8/original_v10.txt";
        String encodedFile = "java_projects/lab8/encoded_v10.txt";
        String decodedFile = "java_projects/lab8/decoded_v10.txt";

        try (Writer writer = new FileWriter(originalFile)) {
            writer.write(originalText);
        }
        System.out.println("1. Створено оригінальний файл: " + originalFile);

        encodeDecode(originalFile, encodedFile, myKey);
        System.out.println("2. Файл '" + originalFile + "' закодовано у '" + encodedFile + "'");
        encodeDecode(encodedFile, decodedFile, myKey);
        System.out.println("3. Файл '" + encodedFile + "' розкодовано у '" + decodedFile + "'");
        
        System.out.println("\nГотово! Перевір файли " + encodedFile + " та " + decodedFile + " у папці проєкту.");
    }
}
