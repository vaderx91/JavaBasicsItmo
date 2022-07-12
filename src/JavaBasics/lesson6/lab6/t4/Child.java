package JavaBasics.lesson6.lab6.t4;

public class Child extends Parent {
    @Override
    public void setField() {
        super.setField();
    }

    @Override
    public int getField() {
        return super.getField();
    }

    public void resField() {
        System.out.println(getField());
    }

    public static void main(String[] args) {

        Child child = new Child();

        System.out.println("Введите целое число");
        child.setField();

        System.out.println("Результат");
        child.resField();
    }
}
