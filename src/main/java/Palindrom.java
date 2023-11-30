public class Palindrom {
    public static void main(String[] args) {
        String a = "coding", str = " ";
        char ch;
        for (int i = 0; i < a.length(); i++) {
            ch = a.charAt(i);
            str = ch + str;
        }
        System.out.println(str);

        int n = 12345, r, sum = 0;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum += r;
        }
        System.out.println(sum);

        int n1 = 1234,t,summ=0;
        while (n1>0){
            t = n1 % 10;
            n1 = n1 / 10;
            summ = summ * 10 + t;
        }
        System.out.println(summ);


        int value = 12345677;
        int r1;
        int sum1 = 1;
        for (int i = 0; i <= value; i++){
            r1 = value % 10;
            value = value / 10;
            sum1 += r1;
        }
        System.out.println(sum1);
    }
}
























