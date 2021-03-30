public class Fibonacci {
    public static void main(String[] args) {
        int a=8;
        int b=1;
        int c=1;
        int d=b+c;
        for (int i= 3;i<=a;i++){
            b=c;
            c=d;
            d= b+c;

        }
        System.out.println(d);
    }

}
