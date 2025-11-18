package lab9;
import java.io.*;

public class Example2_Typpotik {

    public static void main(String[] args) throws Exception {
        String filename = "java_projects/lab9/fl.txt";

        try {
            
            FileOutputStream fos = new FileOutputStream(filename);
            DataOutputStream out = new DataOutputStream(fos);

            System.out.println("Записуємо типізовані дані у " + filename + "...");
            
            out.writeBoolean(true);
            out.writeChar('A');
            out.writeByte(126);
            out.writeShort(658);
            out.writeInt(6732);
            out.writeLong(1234567890L);
            out.writeFloat(5.895f);
            out.writeDouble(1.234567);

            out.flush();
            out.close();
            
            System.out.println("Запис завершено.");
            
            FileInputStream fis = new FileInputStream(filename);
            DataInputStream in = new DataInputStream(fis);

            System.out.println("\nЧитаємо типізовані дані з " + filename + ":");

            System.out.println("Boolean: " + in.readBoolean());
            System.out.println("Char:    " + in.readChar());
            System.out.println("Byte:    " + in.readByte());
            System.out.println("Short:   " + in.readShort());
            System.out.println("Int:     " + in.readInt());
            System.out.println("Long:    " + in.readLong());
            System.out.println("Float:   " + in.readFloat());
            System.out.println("Double:  " + in.readDouble());

            in.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}