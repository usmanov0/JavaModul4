package uz.international;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
    public static void main(String[] args) {
        registerUser();
    }

    public static void registerUser() {
        SaveToDatabase();
        GenerateTemplate();
        SendMail();
        System.out.println("-----------------");
    }

    public static void SaveToDatabase() {
        Runnable runnable = () -> {
            try {
                System.out.println("Saving to database ...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("User saved to database✅");
            } catch (InterruptedException e) {
            }
        };
        new Thread(runnable).start();
    }

    public static void GenerateTemplate() {
        Runnable runnable = () -> {
            try {
                System.out.println("Template generating...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Template generated✅");
            } catch (InterruptedException e) {
            }
        };
        new Thread(runnable).start();
    }

    public static void SendMail() {
        Runnable runnable = () -> {
            try {
                System.out.println("Sending Mail...");
                TimeUnit.MILLISECONDS.sleep(10);
                System.out.println("Email sended✅");
            } catch (InterruptedException e) {
            }
        };
        new Thread(runnable).start();
    }
}
