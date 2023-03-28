package MultiThreading.Task_4_1;

public class DeamonThreadTask6 {
    public static void main(String[] args) {
        My thread1 = new My();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
    }
}
class My extends Thread{
    @Override
    public void run() {
        super.run();
    }
}
