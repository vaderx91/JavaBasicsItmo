package JavaBasics.lesson4.tPart2.t4;

import java.util.Arrays;

public class FirstUniqueInArray {
    public static void main(String[] args) {
        int[] ints = {4, 6, 8, 10, 4, 6};
        findFirstUniqueNum(ints);
    }

    public static void findFirstUniqueNum(int[] array) {
        System.out.println("Заданный массив: " + Arrays.toString(array));
        int size = array.length;
        int[] firstUniqueNum = new int[size];
        int firstUniqueNumCounter = 0;
        for (int i = 0; i < size; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                firstUniqueNum[firstUniqueNumCounter] = array[i];
                firstUniqueNumCounter++;
            }
        }
        System.out.println("Первое уникальное число в массиве:" + firstUniqueNum[0]);
    }
}

