public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1,2,3,4);
        Rectangle r3 = new Rectangle(5,6);

        System.out.println(r1);
        System.out.println(r2.calcArea());
        System.out.println(r3.calculateArea(r3.width, r3.width));
        System.out.println(r3.calculatePerimeter());



    }
}