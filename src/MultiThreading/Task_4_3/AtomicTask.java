package MultiThreading.Task_4_3;
import java.util.concurrent.atomic.AtomicInteger;
public class AtomicTask{
    AtomicInteger sum = new AtomicInteger(1);
    public int getSum() {return sum.get();}


    public void counter(){
        sum.incrementAndGet();
    }
}
