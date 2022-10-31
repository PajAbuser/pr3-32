package p6.t1_6to9;

public interface Printable {

    public default void print(){
        System.out.println(this.getClass());
    };

}
