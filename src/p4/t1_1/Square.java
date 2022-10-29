package p4.t1_1;

public class Square extends Shape{
    private double a,b;
    private double x,y;
    @Override
    public double getArea(){
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
