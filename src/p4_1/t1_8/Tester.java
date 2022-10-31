package p4_1.t1_8;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(3,4);
        Square square = new Square(10);
        System.out.println(
            circle.getArea() + " " +
            circle.getPerimeter()
        );
        System.out.println(
            rectangle.getArea() + " " +
            rectangle.getPerimeter()
        );
        System.out.println(
            square.getArea() + " " +
            square.getPerimeter()
        );
    }
}
