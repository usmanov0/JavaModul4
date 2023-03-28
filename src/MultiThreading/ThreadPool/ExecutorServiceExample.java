package MultiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorServiceExample = Executors.newFixedThreadPool(10);
        for (int i = 0; i <= 200; i++){
            final int taskID = i;
            Runnable runnable = ()->{
                System.out.printf(Thread.currentThread()+"::"+"Task executing (task number is %d)%n",taskID);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };
            executorServiceExample.execute(runnable);
        }
    }
}
