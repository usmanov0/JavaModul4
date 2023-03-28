package MultiThreading.Tasks_4_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task6 {
    Lock banklock = new ReentrantLock();
    public int [] accounts;
    public void Payme(int from,int to, double amount){
        banklock.lock();
        try {
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
        }
        finally {
            banklock.unlock();
        }
    }
    public double getTotalBalance(){
        double sum = 0;
        for (double a:accounts) {
            sum += a;
        }
        return sum;
    }
}
