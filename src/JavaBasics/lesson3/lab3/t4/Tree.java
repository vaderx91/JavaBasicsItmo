package JavaBasics.lesson3.lab3.t4;
//Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева. Создайте три конструктора:
//        ●	Конструктор, который устанавливает только возраст и название;
//        ●	Конструктор, который устанавливает все переменные в классе;
//        ●	Конструктор, который ничего не устанавливает, но выводит сообщение
//        «Пустой конструктор без параметров сработал».
//
//        Создайте три объекта на основе класса и используйте по одному конструктору на каждый.


public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", isAlive=" + isAlive +
                ", name='" + name + '\'' +
                '}';
    }

}
