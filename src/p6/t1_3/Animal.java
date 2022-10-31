package p6.t1_3;

public class Animal implements Nameable{

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return "\n"+name;
    }
}
