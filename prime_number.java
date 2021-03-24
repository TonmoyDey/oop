public class prime_number {
    public static void main(String[] args) {
        boolean t =true;
        int num =19;
        int i  = 2;
        while (i<=num/2)
        {
            if(num%i==0)
            {
                t = false;
            }
            i++;
        }
        if(t) System.out.println("prime");
        else System.out.println("Not prime");
    }
}
