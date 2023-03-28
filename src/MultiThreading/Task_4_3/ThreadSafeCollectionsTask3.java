package MultiThreading.Task_4_3;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class ThreadSafeCollectionsTask3 {
    public static void main(String[] args) throws InterruptedException {
        var set = ConcurrentHashMap.<Integer>newKeySet();
        //HashSet<Integer> set = new HashSet<>(); //Not Correct;
        Runnable runnable1 = () -> {
            try {
                for (int i = 0; i < 1000; i++)
                    set.add(i);
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        };
        Runnable runnable2 = () -> {
            try {
                for (int i = 1000; i < 2000; i++)
                    set.add(i);
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(set.size());
    }
}
