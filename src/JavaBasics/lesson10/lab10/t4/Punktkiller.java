package JavaBasics.lesson10.lab10.t4;

import java.io.*;

public class Punktkiller {
    public static void main(String[] args) {
        File dir1 = new File("files");
        File dir2 = new File("files4");
        File file1 = new File(dir1, "10.1.txt");
        File file2 = new File(dir2, "10.4.txt");

        dir2.mkdir();
        try {
            file2.createNewFile();

        } catch (IOException io) {

            io.printStackTrace();
        }

        try (FileInputStream fin1 = new FileInputStream(file1);
             FileOutputStream fos1 = new FileOutputStream(file2)) {

            byte[] buffer = new byte[fin1.available()];

            fin1.read(buffer);   // считываем буфер
            for (int i = 0; i < buffer.length; i++) {
                if (!Character.isLetterOrDigit((char) buffer[i]) && buffer[i] != 10 && buffer[i] != 13) {
                    buffer[i] = (byte) '$';
                }
            }
            fos1.write(buffer); // записываем из буфера в файл
            System.out.println("Файл записан");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }


}

