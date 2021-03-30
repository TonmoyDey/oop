import java.util.Locale;

public class Third_code {
    static String name = "Putuly ";
    static String name1 = "Putuly putuly";
    static String name2 ="putuly";

    static String n = new String("PUTULY");
    static String n1= new String("PUTULY");

    public static void main(String[] args) {
        System.out.println(name==name1);// true
        System.out.println(name1==name2);// false (because p is different in different string)
        System.out.println(n==n1);
        System.out.println(n.equals(n1));
        System.out.println(n.equals(n1));
        System.out.println(name2.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name2.charAt(1));
        System.out.println(name.indexOf(2));
        System.out.println(name.length());
        System.out.println(name1.substring(7,10));
    }
}
