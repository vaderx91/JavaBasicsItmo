package JavaBasics.lesson3.lab3.t2;


// Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
// в классе через который можно будет вывести все эти данные. Добавьте два объекта, установите
// для них значения и выведите все при помощи ранее созданного метода.
// Также добавьте несколько конструкторов, которые будут устанавливать:
//  ●	только цвет машины;
//  ●	цвет и вес машины;
//  ●	и пустой конструктор.


import jdk.nashorn.internal.objects.annotations.Constructor;

public class Car {
    private Color color;
    private String name;
    private Double weight; // kg

    //    Constructors
    public Car() {
    }

    public Car(Color color) {
        this.color = color;
    }

    public Car(Color color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    //Getters and Setters
    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = Color.valueOf(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "This is" +
                " " + color +
                " " + name +
                ", which weight is " + weight + " kg";
    }

}
