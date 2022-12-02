package p6.t1_11;

import java.util.Scanner;

public class Main /*implements Convertable*/{

    boolean incelsius = false;
    double temp;

    public boolean isIncelsius() {
        return incelsius;
    }

    public void setIncelsius(boolean incelsius) {
        this.incelsius = incelsius;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public static void main(String[] args) {

        System.out.println("\nEnter temp in 1 - celcius, 2 - fahrenheit");
        int select1 = new Scanner(System.in).nextInt();
        System.out.println("\nEnter temp value");
        new Scanner(System.in).nextDouble();


        /*if(select1 == 1) setIncelsius(true);

        int select
        System.out.println("\nEnter");*/

    }

    public void convert(double val) {
        if(incelsius) val = (val * 1.6) + 32;
        else val = (val - 32) / 1.6;
        }
}
