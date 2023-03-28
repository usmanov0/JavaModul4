package MultiThreading.Task_4_1;

public class Task5 {
    public static void main(String[] args) {
        Run runn = new Run();
        runn.run();
    }
}
class Run implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
            }
            System.out.println(i);
        }
    }
}

