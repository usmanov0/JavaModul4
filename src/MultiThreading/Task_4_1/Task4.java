package MultiThreading.Task_4_1;

public class Task4 {
    public static void main(String[] args) {
        WithRun withRun = new WithRun();
        withRun.run();
    }
}
class WithRun implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++){
            try{
                Thread.sleep(300);
            }catch (InterruptedException e){
            }
            System.out.println(i);
        }
    }
}
