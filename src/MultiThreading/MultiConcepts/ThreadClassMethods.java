package MultiThreading.MultiConcepts;

public class ThreadClassMethods{
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = ()->{
          for (int i = 1; i <= 10; i++){
              try {
                  Thread.sleep(400);
              } catch (InterruptedException e) {
              }
              System.out.println(Thread.currentThread().getName()+" -> "+i);
          }
        };
        var thread1 = new Thread(runnable,"Thread One");
        var thread2 = new Thread(runnable,"Thread Two");
        thread1.start();
        thread1.join(); //thread1 ishini tugatmaguncha thread2 kutib turadi;
        //thread1.stop(); threadni to'xtatish uchun;
        //thread.suspend(); bitta threadni qandaydir shartga ko'ra toxtatib qo'yish uchun;
        //thread1.resume(); davom ettirib ketish uchun,   resume()-suspend ishlatilgan joyda ishlatilinadi;
        thread2.start();
        System.out.println("Next Thread");
    }
}
