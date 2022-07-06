package JavaBasics.lesson4.tPart1.t3;

import java.util.Scanner;

public class SumEqInt {
    public static void main(String[] args) {
        checkSumEqInt();
    }

    static void checkSumEqInt() {

        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int n2 = scanner.nextInt();

        System.out.println("Введите третье число");
        int n3 = scanner.nextInt();

        System.out.println("результат: " + check(n1, n2, n3));
    }

    public static Boolean check(int a, int b, int c) {
        return a + b == c;
    }
}
