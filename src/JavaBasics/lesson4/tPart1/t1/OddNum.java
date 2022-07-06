package JavaBasics.lesson4.tPart1.t1;

public class OddNum {
    public static void main(String[] args) {
        checkOdd();
    }

    static void checkOdd() {

        for (int i = 1; i <= 99; i++)
            if (i % 2 == 1) {
                System.out.println(i);
            }
    }
}



