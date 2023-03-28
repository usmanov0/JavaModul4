package MultiThreading.Tasks_4_2;

public class Task2 {
    int count = 0;
    public synchronized void Plus1(){
        setCount(getCount()+1);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
