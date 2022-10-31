package p4_1.t1_1;

public class Rectangle extends Shape {
    private double a,b;
    private double x,y;

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }

    public Rectangle(double a, double b, double c) {
        super(Double.toString(a+b+c));
        this.a = a;
        this.b = b;
    }
    private String name;
    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
