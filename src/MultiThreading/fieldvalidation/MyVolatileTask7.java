package MultiThreading.fieldvalidation;

public class MyVolatileTask7
    {
        public static void main(String[] args) throws InterruptedException {
            MyRunnnable runnable = new MyRunnnable();
            var t1 = new Thread(runnable);
            var t2 = new Thread(runnable);
            t1.start();
            t2.start();
            Thread.sleep(4000);
            runnable.stop();
        }
    }
class MyRunnnable implements Runnable{
    private volatile boolean a;

    @Override
    public void run() {
        a=true;
        while (a){
        }
        System.out.println(Thread.currentThread() + " <-Finished");
    }
    public void stop(){
        a=false;
    }
}