package p4_1.t1_8;

public class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle{" +
                ",radius=" +radius+
                '}';
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double radius;

    @Override
    public double getArea(){
        return Math.PI *radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI *radius;
    }

}
