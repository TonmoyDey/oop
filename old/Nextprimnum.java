public class Nextprimnum {
    public static void main(String[] args) {
        int a= 8;
        int prime = 0;
        for (int i = a; i < 10000; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                prime = i;
                break;
            }
        }
        System.out.println(prime);
    }
}

