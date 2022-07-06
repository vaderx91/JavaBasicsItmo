package JavaBasics.lesson4.tPart2.t3;

import java.util.Arrays;

public class SwapFirstToLast {
    public static void main(String[] args) {
        int[] ints = {4, 6, 8, 10, 12, 2222};
        swapFirstToLast(ints);

        int[] ints2 = {22, 6, 8, 10, 12, 22};
        swapFirstToLast(ints2);

        int[] ints3 = {22};
        swapFirstToLast(ints3);

    }

    public static void swapFirstToLast(int[] array) {
        System.out.println("Заданный массив: " + Arrays.toString(array));
        int firstME;
        int lastME;

        if (array.length > 1) {
            if (array[0] != array[array.length - 1]) {
                firstME = array[0];
                lastME = array[array.length - 1];
                array[0] = lastME;
                array[array.length - 1] = firstME;
                System.out.println("Сортированный массив: " + Arrays.toString(array));
            } else System.out.println("Первый и последний элементы массива одинаковые");
        } else System.out.println("Массив состоит из одного или менее элементов");
    }
}
