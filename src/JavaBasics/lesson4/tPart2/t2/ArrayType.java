package JavaBasics.lesson4.tPart2.t2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayType {
    public static void main(String[] args) {
        insertArray();
    }

    public static void insertArray() {
        System.out.println("Укажите длину масива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size]; // Создаём массив int размером в size

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print("Массив:" + Arrays.toString(array)); // Выводим получившийся масив в консоль
    }
}
