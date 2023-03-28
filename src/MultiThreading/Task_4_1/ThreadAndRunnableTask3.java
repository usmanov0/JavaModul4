package MultiThreading.Task_4_1;

public class ThreadAndRunnableTask3 {
    public static void main(String[] args) {
        ThrAndRun thread = new ThrAndRun();
        thread.start();
        ThrAndRun runnable = new ThrAndRun();
        runnable.run();
    }
}
class ThrAndRun extends Thread implements Runnable{
    //Thread;
    @Override
    public synchronized void start() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+ "With Thread-> "+i);
        }
        System.out.println();
        super.start();
    }
    //Runnable;
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println("With Runnable"+i);
        }
        super.run();
    }
}