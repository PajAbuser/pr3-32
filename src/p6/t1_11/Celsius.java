package p6.t1_11;

public class Celsius implements Convertable{

    private double value;
    private boolean converted = false;

    public void convert() {
        if (!converted) {
            this.value = value * 1.6 + 32;
        }
    }
}
