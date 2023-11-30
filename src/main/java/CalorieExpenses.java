import java.util.Scanner;
public class CalorieExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Weight, Please -> ");
        float weight = scanner.nextFloat();
        System.out.print("Your Height, Please -> ");
        float height = scanner.nextFloat();
        System.out.print("Your age, Please -> ");
        int age = scanner.nextInt();
        System.out.print("Your daily calorie consumption: ");
        System.out.println((10*weight)+(6.25*height)-(5*age));
    }
}
