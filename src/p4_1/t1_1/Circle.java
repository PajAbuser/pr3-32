package p4_1.t1_1;

public class Circle extends Shape{
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", R=" + R +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Circle(double r) {
        super(Double.toString(r));
        R = r;
    }
    private String name;
    private double R;
    private double x,y;
    @Override
    public double getArea(){
        return Math.PI * R * R;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * R;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
