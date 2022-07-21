package JavaBasics.lesson14.lab14.t3;

public class ThreadQueue extends Thread{
    private boolean flag = false;

    @Override
    public void run() {
        int i = 0;
        while (i < 50) {
            synchronized (this) {
                if (!flag) {
                    System.out.println(Thread.currentThread().getName());
                    flag = true;
                    notifyAll();
                }else {
                    flag = false;
                    try {
                        wait();
                    }  catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }  i++;
            }
        }
    }

    public static void main (String[] args) {
        ThreadQueue qThread = new ThreadQueue();

        new Thread(qThread, "Thread 1").start();
        new Thread(qThread, "Thread 2").start();

    }


}
