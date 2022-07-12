package JavaBasics.lesson6.lab6.t5;

import JavaBasics.lesson6.lab6.t4.Child;

public class HeirClass extends MainClass {
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUserInfo() {
        name = scanner.nextLine();
    }


    public static void main(String[] args) {

        MainClass main = new MainClass();
        System.out.println("Введите возраст");
        main.setUserInfo();

        HeirClass heir = new HeirClass();
        System.out.println("Введите имя");
        heir.setUserInfo();

        System.out.println("Имя: " + heir.getName() + ", возраст: " + main.getAge());

    }
}
