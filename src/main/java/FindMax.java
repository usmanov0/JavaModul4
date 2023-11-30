public class FindMax {
        public static void main(String[] args) {
            int num1=10;
            int num2=20;
            int num3=30;
            int max2x = findmax(num1,num2);
            System.out.println(num1+" "+num2+" Max of numbers==> "+max2x);
            int max3x = findmax(num1,num2,num3);
            System.out.println(num1+" "+num2+" "+num3+" "+"Max of numbers==> "+max3x);

        }
        public static int findmax(int a, int b){
            return a>b ? a : b;
        }
        public static int findmax(int a, int b, int c) {
            int maxx = 0;
            if (a > b) maxx = a;
            if (b > a) maxx = b;
            else maxx = c;
            return maxx;
        }
        }

