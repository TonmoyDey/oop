public class Fibonacci_Series {
    public static void main(String[] args) {
        int n = 12;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " + ");
            {
                int c = a + b;
                a = b;
                b = c;
            }
        }

    }
}
