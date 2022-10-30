package p4.t2;

public abstract class Clothes {

    private int size;
    private double price;
    private String color;

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
