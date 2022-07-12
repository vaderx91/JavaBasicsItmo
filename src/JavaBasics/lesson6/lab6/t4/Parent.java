package JavaBasics.lesson6.lab6.t4;

import java.util.Scanner;

public class Parent {
    int field;

    public void setField() {
        Scanner inputInt = new Scanner(System.in);
        this.field = inputInt.nextInt();
    }

    public int getField() {
        return field;
    }
}
