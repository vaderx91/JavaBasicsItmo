package JavaBasics.lesson9.lab9.t3;

import java.util.*;

public class CustomBillion {
    private static final List<Integer> intArrayList = new ArrayList<>();
    private static final List<Integer> intLinkedList = new LinkedList<>();

    private static void addElements(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static void getElements(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            int x = (int) (Math.random() * list.size());
            list.get(x);
            }
        }


    public static void main(String[] args) {
        long x1 = System.currentTimeMillis();
        addElements(intArrayList);
        long x2 = System.currentTimeMillis();
        System.out.println("Время добавления в ArrayList: " + (x2 - x1));

        x1 = System.currentTimeMillis();
        addElements(intLinkedList);
        x2 = System.currentTimeMillis();
        System.out.println("Время добавления в LinkedList: " + (x2 - x1));

        x1 = System.currentTimeMillis();
        getElements(intArrayList);
        x2 = System.currentTimeMillis();
        System.out.println("Время получения из ArrayList: " + (x2 - x1));

        x1 = System.currentTimeMillis();
        getElements(intLinkedList);
        x2 = System.currentTimeMillis();
        System.out.println("Время получения из LinkedList: " + (x2 - x1));
    }
}

