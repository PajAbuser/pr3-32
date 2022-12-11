package p9.t4;

public class Worm implements MyComparable<Worm>{

    private double param;
    public Worm(double param) {
        this.param = param;
    }

    public double getParam() {
        return param;
    }

    public int compareTo(Worm o) {
        return (this.param == o.param) ? 0 : (this.param > o.param) ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Worm{" +
                "param=" + param +
                '}';
    }
}
