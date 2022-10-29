package p4.t1_1;

public class Rectangle extends Shape {
    private double a,b,c;
    private double x,y;

    public Rectangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea(){
        double p = (a+b+c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
