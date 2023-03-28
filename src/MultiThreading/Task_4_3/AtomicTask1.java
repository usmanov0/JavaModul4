package MultiThreading.Task_4_3;

public class AtomicTask1 extends Thread{
    int sum = 11;
    public void inc(){System.out.println(sum = sum + 1);} //Atomic;
    public int getSum() {return sum;}
    public void setSum(int sum) {this.sum = sum;}

    public static void main(String[] args) {
        AtomicTask1 atomicTask1 = new AtomicTask1();
        atomicTask1.inc();
    }
}
