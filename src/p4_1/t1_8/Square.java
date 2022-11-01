package p4_1.t1_8;

public class Square extends Rectangle {
    protected double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        super(side, side);
        this.side = side;
    }
    public void setWidth(double width){
        new Square().setWidth(width);
    }
    public void setLength(double length){
        new Square().setLength(length);
    }

    public Square() {
    }
}
