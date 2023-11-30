
//X, A, va Y sonlar berilgan. X kg konfet A so‘m turadi. 1kg va Y kg
//konfet qancha turishini aniqlovchi dastur tuzing
import java.util.Scanner;

public class A_X_Y {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shokolad kg:");
        double x = scanner.nextDouble();
        double a = scanner.nextDouble();
        System.out.print("Konfet kg");
        double y = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println();
        System.out.println((a/x) - (b/y));
    }
//X, A, Y va B sonlar berilgan. X kg shoqolad A so‘m turadi va Y kg
    //konfet B so‘m turadi. 1 kg shokolad 1 kg konfetdan qancha qimmat turishini
    //aniqlovchi dastur tuzilsin
}
