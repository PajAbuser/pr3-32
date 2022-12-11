package p9.t4;

import java.util.Comparator;

public interface MyComparator<T> extends Comparator<T> {
    int compare(T o1, T o2);
}
