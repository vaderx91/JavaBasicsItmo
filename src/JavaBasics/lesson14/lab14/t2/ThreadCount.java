package JavaBasics.lesson14.lab14.t2;


public class ThreadCount extends Thread {

    private final Counter counter;

    private ThreadCount (Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void getThread(Counter counter) {

        for (int i = 0; i < 100; i++) {

            ThreadCount thread = new ThreadCount(counter);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


}


