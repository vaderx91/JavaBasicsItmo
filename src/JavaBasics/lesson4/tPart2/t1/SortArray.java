package JavaBasics.lesson4.tPart2.t1;

public class SortArray {
    public static void main(String[] args) {
        int[] ints = {4, 6, 8, 10, 12, 2222};
        sortArray(ints);

        int[] ints2 = {22, 6, 8, 10, 12, 1};
        sortArray(ints2);

    }

    public static void sortArray(int[] array) {
        boolean sorted = false;

        for (int i = 0; i < array.length; i++) {
            int j = i + 1;
            if (j < array.length) {
                sorted = array[i] < array[j];
            } else break;
        }

        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
