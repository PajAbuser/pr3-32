package p9.t4;

public class MyComp implements MyComparator<Worm>{

    public int compare(Worm o1, Worm o2) {
        return o1.compareTo(o2);
    }

}
