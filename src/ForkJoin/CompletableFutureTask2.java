package ForkJoin;


import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureTask3 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        CompletableFuture.runAsync(()->{
            System.out.println("Running on :: "+ Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int a = 10;
            int b = 5;

            System.out.println("Choose action +, -, *, /: ");
            char operator = '*';
            int res = 0;
            switch (operator){
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
                default:
                    System.out.println("Wrong operation!");
            }
            System.out.println(a + " "+operator+" "+b +" = "+res);

        },executorService);
    }
}
