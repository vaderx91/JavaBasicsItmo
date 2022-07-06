package JavaBasics.lesson4.tPart1.t2;

public class Div35Both {
    public static void main(String[] args) {
        checkDiv35B();
    }

    static void checkDiv35B() {

        System.out.println("Divide by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Divide by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Divide by 3 and 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
