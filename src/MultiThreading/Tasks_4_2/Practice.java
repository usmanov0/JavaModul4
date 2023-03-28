package MultiThreading.Tasks_4_2;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Practice {
    Lock lockes = new ReentrantLock();
    int sum = 0;
    public int PlusOne(){
        lockes.lock();
        try{
            if (sum>10) return sum+=2;
            else getSum();
        }finally {
            lockes.unlock();
        }
        return 0;
    }
    public int getSum(){
        return sum;
    }

}
