package JavaBasics.lesson4.tPart1.t5;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLast {
    public static void main(String[] args) {
        checkFirstLast3();
    }

    public static void checkFirstLast3() {
        System.out.println("Укажите длину масива:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size]; // Создаём массив int размером в size
        if (size >= 2) {  // проверяем, что в массиве больше 1 элемента
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
        } else {
            System.out.println("Длинна массива должна быть больше 2-х элементов:");
        }

        System.out.print("Массив:" + Arrays.toString(array)); // Выводим получившийся масив в консоль

        // проверяем, что массив содержит "3" как первый или последний элемент
        if ((array[0] == 3) || array[size - 1] == 3) {
            System.out.println("\nрезультат: " + true);
        } else {
            System.out.println("\nрезультат: " + false);
        }
    }

}

