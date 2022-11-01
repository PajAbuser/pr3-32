package p4_1.t1_1;

public class Tester {
    public static void main(String[] args) {

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(3,4,5);
        Shape square = new Square(10,20);
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
