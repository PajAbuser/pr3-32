package p4_1.t1_1;

public class Square extends Shape{
    private double a,b;
    private double x,y;
    private String name;
    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }

    public Square(double a, double b) {
        super(Double.toString(a+b));
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
