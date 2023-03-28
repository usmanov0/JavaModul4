package MultiThreading.Task_4_1;

public class ThreadTask1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("HAPPY RAMADAN");

    }

}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++){
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
        super.run();
    }
}
