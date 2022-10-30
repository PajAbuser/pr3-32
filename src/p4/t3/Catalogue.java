package p4.t3;

import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Item> items = new ArrayList<>();
    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public Catalogue(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Item> getCatalogue(){
        return this.items;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    public String toString2() {
        return "Catalogue{" +
                "items=" + items.toString() +
                ", size=" + size +
                '}';
    }
}
