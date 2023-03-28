package MultiThreading.Tasks_4_2;

public class CouterTask1 {
    int sum  = 0;
    public synchronized void OnePlus(){
        setSum(getSum()+1);
    }
    public int getSum() {
        return sum;
    }
    public void setSum(int sum) {
        this.sum = sum;
    }
}



