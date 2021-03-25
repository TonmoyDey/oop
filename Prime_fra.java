public class Prime_fra {
    public static void main(String[] args) {

        int a = 124;
        if(prime(a))System.out.println("prime");
        else System.out.println("Not prime");
        primeFra(a);

    }
    static void primeFra(int a){
        for(int y=2;y<=a;y++){
            if (prime(y)){
                int z=y;
                while(a%z==0){
                    System.out.print(y + " ");
                    z=z*z;
                }
            }
        }
    }




      static boolean prime(int a){
        for(int x=2; x<=a/2;x++)
        {
            if(a%x==0) return false;
        }
        return true ;

    }
}

