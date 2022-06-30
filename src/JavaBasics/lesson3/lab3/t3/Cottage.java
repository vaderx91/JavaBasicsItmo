package JavaBasics.lesson3.lab3.t3;

//Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики.
// Добавление характеристик реализуйте через метод класса.
//
//Выведите информацию про каждый объект.

import static java.util.Calendar.*;

public class Cottage {
    private String name;
    private Integer builtYear;
    private Integer floorsNumber;

    public Cottage() {
    }

    public Cottage(String name, Integer builtYear, Integer floorsNumber) {
        this.name = name;
        this.builtYear = builtYear;
        this.floorsNumber = floorsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return builtYear;
    }

    public void setYear(Integer builtYear) {
        this.builtYear = builtYear;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }
//    public void dataSetter() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter the name of the cottage");
//        this.name = String.valueOf(in.nextInt());
//        System.out.print("Enter the built year");
//        this.builtYear = in.nextInt();
//        System.out.print("Enter the number of floors");
//        this.floorsNumber = in.nextInt();
//
//    };

    @Override
    public String toString() {
        return "This is the " + floorsNumber + " floor(s) " + name +
                "cottage, built in " + builtYear + " (" + cottageAge() + " year(s) ago)";
    }

    public int cottageAge() {
        int currentYear = getInstance().get(YEAR);
        {
            if (currentYear > this.builtYear) {
                return currentYear - this.builtYear;
            } else {
                System.out.println("Invalid built year");
            }
        }
        return 0;
    }
}
