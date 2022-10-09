package p3.t3_2;

public interface Currency {

    String name = Currency.class.getName();
    double valToUE = 0;

    public default double getValToUE() {
        return valToUE;
    }

}
