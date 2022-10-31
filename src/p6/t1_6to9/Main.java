package p6.t1_6to9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printable> printables = new ArrayList<>();

        printables.add(new Book());

        printables.add(new Shop());

        printables.add(new Book());

        printables.add(new Shop());

        for(Printable printable : printables){

            printable.print();

        }

    }
}
