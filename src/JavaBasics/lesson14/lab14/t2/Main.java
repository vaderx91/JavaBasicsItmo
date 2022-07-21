package JavaBasics.lesson14.lab14.t2;

public class Main {
    public static void main(String[] args) {

        Counter counter = new Counter();

        ThreadCount.getThread(counter);

        System.out.println(counter.getCount());

    }
}
