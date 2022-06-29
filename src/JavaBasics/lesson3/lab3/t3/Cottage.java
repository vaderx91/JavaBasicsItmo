package JavaBasics.lesson3.lab3.t3;

//Создайте класс Дом. Добавьте в него следующие данные:
//●	поля: количество этажей, год постройки, наименование;
//●	метод для установки всех значений;
//●	метод для вывода всех значений;
//●	метод, возвращающий количество лет с момента постройки.
//
//На основе класса создайте два объекта и пропишите для каждого характеристики. Добавление характеристик
// реализуйте через метод класса.
//
//Выведите информацию про каждый объект.

import java.time.Year;

public class Cottage {
    private String name;
    private Year year;
    private Integer floorsNumber;

    public Cottage(String name, Year year, Integer floorsNumber) {
        this.name = name;
        this.year = year;
        this.floorsNumber = 1;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public Integer getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(Integer floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    @Override
    public String toString() {
        return "This is the " + name +
                "cottage " + floorsNumber + ", built in " + year;
    }
}
