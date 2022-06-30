package JavaBasics.lesson3.lab3.t3;

import java.time.Year;

public class MainCott {
    public static void main(String[] args) {

        Cottage cottage1 = new Cottage();
        cottage1.setName("Modern brick ");
        cottage1.setYear(2021);
        cottage1.setFloorsNumber(4);
        System.out.println(cottage1);

        Cottage cottage2 = new Cottage();
        cottage2.setName("Log ");
        cottage2.setYear(2002);
        cottage2.setFloorsNumber(2);
        System.out.println(cottage2);
    }
}
