package p4_1.t1_10;

public abstract class Vehicle {

    protected double speed;
    protected double cost;

    public Vehicle(double speed, double cost) {
        this.speed = speed;
        this.cost = cost;
    }

    public double getSpeed() {
        return speed;
    }
    public double time(double dist){
        return dist / speed;
    }
    public double cost(double dist){
        return dist * cost;
    }
}
