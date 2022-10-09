package p3.t1_2;

public class Circle {
    private Point center;
    private double r;
    private double x;
    private double y;

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
        this.x = center.getX();
        this.y = center.getY();
    }
}
