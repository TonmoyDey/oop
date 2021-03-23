public class Function {

    public static void main(String[] args) {
        System.out.println(intfun());
        System.out.println(boolfun());
        System.out.println(charfun());
        System.out.println(Stringfun());
        System.out.println(doublefun());
        System.out.println(floatfun());
        System.out.println(bytefun());

    }
    static int intfun(){
        return 10;
    }
    static boolean boolfun(){
        return true;
    }
    static double doublefun(){
        return 10.00;
    }
    static float floatfun(){
        return 10.0f;
    }
    static long longfun(){
        return 12386L;
    }
    static char charfun(){
        return 'a';
    }
    static byte bytefun(){
        return 1;
    }
    static String Stringfun(){
        return "Tonmoy Dey";
    }
}
