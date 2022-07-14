package JavaBasics.lesson9.lab9.t2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DubRemover {
    public static Set<Object> dubRemove(List<Object> objectList) {
        return new HashSet<>(objectList);
    }

    public static void main(String[] args){
        Object objectA = new Object();
        Object objectB = new Object();
        Object objectAB = objectA;
        Object objectC = new Object();
        Object objectD = new Object();
        Object objectCA = objectC;


        List<Object> objectList = new ArrayList<>();
        objectList.add(objectA);
        objectList.add(objectAB);
        objectList.add(objectB);
        objectList.add(objectC);
        objectList.add(objectCA);
        objectList.add(objectD);

        System.out.println("Количество уникальных объектов: " + dubRemove(objectList).size());
    }
}
