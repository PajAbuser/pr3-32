package p4.t3;

public class Item {

    private Name name;
    private double price;
    private int id;

    public Item(int i, double price){

        name = Name.values()[i];
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }
}
