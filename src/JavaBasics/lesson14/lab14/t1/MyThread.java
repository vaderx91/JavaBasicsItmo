package JavaBasics.lesson14.lab14.t1;


public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " is " + getState());

        int i = 0;
        do {
            System.out.println(i++);
        } while (i < 100);

    }

    public static void getThread() {
        for (int i = 0; i < 10; i++) {

            MyThread thread = new MyThread();
            System.out.println(thread.getName() + " is " + thread.getState());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + " is " + thread.getState());
        }
    }

    public static void main(String[] args) {
        getThread();

    }
}


