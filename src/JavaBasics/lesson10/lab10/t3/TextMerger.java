package JavaBasics.lesson10.lab10.t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextMerger {
    public static void main(String[] args) {
        File dir1 = new File("files");
        File dir2 = new File("files2");
        File dir3 = new File("files3");
        File file1 = new File(dir1, "10.1.txt");
        File file2 = new File(dir2, "10.2.txt");
        File file3 = new File(dir3, "10.3.txt");

        dir3.mkdir();
        try {
            file3.createNewFile();
        } catch (IOException io) {
            io.printStackTrace();
        }

        try (FileInputStream fin1 = new FileInputStream(file1);
             FileInputStream fin2 = new FileInputStream(file2);
             FileOutputStream fos1 = new FileOutputStream(file3, true);
             FileOutputStream fos2 = new FileOutputStream(file3, true)) {

            byte[] buffer1 = new byte[fin1.available()];
            byte[] buffer2 = new byte[fin2.available()];


            fin1.read(buffer1, 0, buffer1.length);   // считываем буфер
            fin2.read(buffer2, 0, buffer2.length);


            fos1.write(buffer1, 0, buffer1.length); // записываем из буфера в файл
            System.out.println("Файл 1 записан");

            fos2.write(buffer2, 0, buffer2.length);
            System.out.println("Файл 2 записан");

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
