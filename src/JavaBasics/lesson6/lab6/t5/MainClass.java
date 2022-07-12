package JavaBasics.lesson6.lab6.t5;

import java.util.Scanner;

public class MainClass {
    Scanner scanner = new Scanner(System.in);

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserInfo() {
        this.age = scanner.nextInt();
    }

}
