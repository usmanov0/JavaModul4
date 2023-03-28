package MultiThreading.Task_4_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        var array = new ArrayList<Integer>();
        var array1 = Collections.synchronizedCollection(array);
        Runnable runnable = ()->{
          try{
              for (int i = 0; i < 500; i++)
                  array1.add(i);
              Thread.sleep(10);
          }catch (InterruptedException e){}
        };
        new Thread(runnable).start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(array1.size());
    }
}
