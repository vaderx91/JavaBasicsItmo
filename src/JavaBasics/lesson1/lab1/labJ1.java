package JavaBasics.lesson1.lab1;

import java.util.Scanner;

public class labJ1 {
    public static void main(String[] args) {
        //           Задание 1
        System.out.println("Task 1");

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");
//       Задание 2
        System.out.println("Task 2");

        double t1 = (46 + 10) * (10 / 3d);
        System.out.println("t1: " + t1);
        int t2 = (29) * (4) * (-15);
        System.out.println("t2: " + t2);

//       Задание 3
        System.out.println("Task 3");
        double number = 10500;
        System.out.println(number / 10 / 10);

//        Задание 4
        System.out.println("Task 4");
        double x = 3.6d;
        double y = 4.1d;
        double z = 5.9d;
        double result = x * y * z;
        System.out.println("result; " + result);

//        Задание 5
        System.out.println("Task 5");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);
        s = scanner.nextLine();
        System.out.println(s);

        //        Задание 6
        System.out.println("Task 6");
        int b = scanner.nextInt();

        if (b > 100 && b % 2 == 0) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}

