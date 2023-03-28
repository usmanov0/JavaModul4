package MultiThreading.Tasks_4_2;

public class Task5 {
    int sum = 0;
    public synchronized int PlusTwoIf(){
        return (sum>10) ? sum+2 : getSum();
    }
    public int getSum() {
        return sum;
    }
}
