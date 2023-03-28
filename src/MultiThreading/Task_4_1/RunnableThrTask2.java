package MultiThreading.Task_4_1;

public class RunnableThrTask2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        thread.run();

    }
}
class Task implements Runnable{

    @Override
    public void run() {
        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("HAPPY RAMADAN");
        }
    }
}
