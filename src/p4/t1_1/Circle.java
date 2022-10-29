package p4.t1_1;

public class Circle extends Shape{
    public Circle(double r) {
        R = r;
    }

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
