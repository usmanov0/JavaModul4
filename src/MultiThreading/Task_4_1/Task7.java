package MultiThreading.Task_4_1;

public class Task7 {
    public static void main(String[] args) {
        WithPriority thread1 = new WithPriority();
        WithPriority thread2 = new WithPriority();
        WithPriority thread3 = new WithPriority();
        WithPriority thread4 = new WithPriority();
        WithPriority thread5 = new WithPriority();

        thread1.setPriority(2);
        thread2.setPriority(4);
        thread3.setPriority(6);
        thread4.setPriority(8);
        thread5.setPriority(10);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
class WithPriority extends Thread{
    @Override
    public void run() {
    }
}
