package JavaBasics.lesson10.lab10.t1;

import java.io.*;

public class StringWriter {
    public static void main(String[] args) {
        File file1 = new File("files/10.1.txt");
        File file2 = new File("files/10.1-1.txt");

        if (file1.exists()) {

            try (BufferedReader bis = new BufferedReader(new FileReader(file1))) {
                int c;
                while ((c = bis.read()) != -1) {

                    System.out.print((char) c);
                }

            } catch (IOException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        } else {
            System.err.println("\nТакого файла не существует");
        }



        if (file2.exists()) {

            try (BufferedReader bis = new BufferedReader(new FileReader(file2))) {
                int s;
                while ((s = bis.read()) != -1) {

                    System.out.print((char) s);
                }

            } catch (IOException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        } else {
            System.err.println("\nТакого файла не существует");
        }
    }
}

