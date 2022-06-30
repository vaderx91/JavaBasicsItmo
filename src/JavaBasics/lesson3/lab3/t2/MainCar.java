package JavaBasics.lesson3.lab3.t2;


public class MainCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setColor(String.valueOf(Color.GREEN));
        car1.setName("Mini Cooper");
        car1.setWeight(1429.0);
        System.out.println(car1);

        Car car2 = new Car(Color.BLACK);
        car2.setName("BMW X5");
        car2.setWeight(2425.0);
        System.out.println(car2);


    }

}
