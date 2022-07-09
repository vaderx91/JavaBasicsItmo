package JavaBasics.lesson5.lab5.t2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите слово");

        if (s.hasNextInt()) {
            System.out.println("Введено число, пожалуйста, введите слово");
            return;
        }

        String st1 = s.nextLine();
        String st2 = checkPal(st1);

        palindrome(st1, st2);
    }

    public static String checkPal(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return String.valueOf(stringBuilder.reverse());
    }

    public static void palindrome(String st1, String st2) {

        if (st1.equals(st2)) {
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }
}

