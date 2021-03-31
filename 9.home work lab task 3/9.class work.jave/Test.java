public class Test {
    public static void main(String[] args) {
        Box b= new Box();
        b.setHeight(2.0);
        b.setLength(5.5);
        b.setWidth(2.5);
        System.out.println("Length ="+b.getLength());
        System.out.println("Width ="+b.getWidth());
        System.out.println("Height ="+b.getHeight());
    }
}
