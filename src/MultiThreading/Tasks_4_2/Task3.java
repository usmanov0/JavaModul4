package MultiThreading.Tasks_4_2;

public class Task3 {
    private  int[] account;
    public synchronized void Pay(int from, int to, double amount){
        if(account[from]<amount) return;
        System.out.println(Thread.currentThread());
        account[from] -= amount;
        System.out.printf("%10.2f from %d to %d",amount,from,to);
        account[to] += amount;
        System.out.printf("Total Balance is %10.2f%n",TotalSum());
    }
    public void PayMe(int from, int to, double amount){
        synchronized (this){ //synchronized blocks;
            if(account[from]<amount) return;
            System.out.println(Thread.currentThread());
            account[from] -= amount;
            System.out.printf("%10.2f from %d to %d",amount,from,to);
            account[to] += amount;
            System.out.printf("Total Balance is %10.2f%n",TotalSum());
        }
    }

    public double TotalSum(){
        double sum = 0;
        for (double s:account) {
            sum+=s;
        }
        return sum;
    }
}
