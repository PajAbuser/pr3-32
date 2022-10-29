package p4.t1_1;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Shape(10);
        Rectangle rectangle = new Shape(3,4,5);
        Square square = new Shape(10,20);
        System.out.println(
            circle.getArea() + " " +
            circle.getPerimeter() + " " +
            circle.getType()
        );
        System.out.println(
            rectangle.getArea() + " " +
            rectangle.getPerimeter() + " " +
            rectangle.getType()
        );
        System.out.println(
            square.getArea() + " " +
            square.getPerimeter() + " " +
            square.getType()
        );
    }
}
