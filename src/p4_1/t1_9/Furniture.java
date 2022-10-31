package p4_1.t1_9;

public abstract class Furniture {

    protected String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                '}';
    }

    public Furniture(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
