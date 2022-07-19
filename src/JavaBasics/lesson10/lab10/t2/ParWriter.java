package JavaBasics.lesson10.lab10.t2;

import javax.imageio.IIOException;
import javax.sql.rowset.serial.SerialStruct;
import java.io.*;


public class ParWriter {
    public static void main(String[] args) {
        File dir = new File("files1");
        File file1 = new File(dir, "10.2.txt");

        dir.mkdir();
        try {
            file1.createNewFile();
        } catch (IOException io) {
            io.printStackTrace();


        }

        String string = "Креативный текст-заглушка";

        try (FileOutputStream os = new FileOutputStream(file1)) {
            byte[] buffer = string.getBytes();
            os.write(buffer);
            System.out.println("Файл записан");
        } catch (IOException io) {
            System.err.println(io.getMessage());
        }

    }
}
