package JavaBasics.lesson6.lab6.t2;

public abstract class Human {
    protected String name;
    protected String surname;

    protected Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void setName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public abstract String getInfo();
}
