package p6.t1_4;


public class Car implements Priceable {

    private double price;

    public Car(double price) {
        this.price = price;
    }

    public double getPrice() {
            return this.price;
    }
}
