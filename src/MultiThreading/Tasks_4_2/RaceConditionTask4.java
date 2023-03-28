package MultiThreading.Tasks_4_2;

public class RaceConditionTask4 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread th1 = new Thread(counter,"Thread-1 is");
        Thread th2 = new Thread(counter,"Thread-2 is");
        Thread th3 = new Thread(counter,"Thread-3 is");
        th1.start();
        th2.start();
        th3.start();
    }
}
class Counter implements Runnable{
    private int a = 0;
    public void increment(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a++;
    }
    public void decrement(){
        a--;
    }
    public int getValue(){
        return a;
    }
    @Override
    public void run() {
        this.increment(); System.out.println("After Increment "+Thread.currentThread().getName()+" "+this.getValue());
        this.decrement(); System.out.println("Thread at Last "+Thread.currentThread().getName()+" "+this.getValue());
    }
}
