package p4_1.t1_10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car(150, 500));
        vehicles.add(new Ship(80, 2500));
        vehicles.add(new Train(120, 240));
        vehicles.add(new Plane(900, 4000));
        double dist = 1000;
        for (Vehicle veh : vehicles) {
            System.out.println(veh.getClass()+ " " + String.format("%1$7.2f",veh.time(dist)) + "h, " + String.format("%1$10.2f",veh.cost(dist)) + " RUR");
        }
    }
}
