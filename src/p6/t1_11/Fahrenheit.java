package p6.t1_11;

public class Fahrenheit implements Convertable{

    private double value;
    private boolean converted = false;

    public void convert() {
        if (!converted) {
            this.value = (value - 32) / 1.6;
        }
    }
}
