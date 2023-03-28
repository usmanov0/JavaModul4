package MultiThreading.Task_4_3;

public class AtomicTestWithRaceTask2 {
    int number;
    public synchronized void changeNUmber(){
        if (number==0) {System.out.println(Thread.currentThread().getName() + " | Changed"); number -= 1;}
        else{System.out.println(Thread.currentThread().getName() +" |Not Changed");}
    }

    public static void main(String[] args) throws InterruptedException {
        var test = new AtomicTestWithRaceTask2();
        for (int i = 0; i <=10 ; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    test.changeNUmber();
                }
            },"Thread "+i).start();
        }
    }
}
