package p9.t4;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worm> worms = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            worms.add(new Worm((int)((Math.random()*1000) % 1000)));
        }
        System.out.println(worms);
        MyComparator<Worm> comp = new MyComp();
        worms.sort(comp);
        System.out.println("sorted:");
        System.out.println(worms);
    }
}
