package p3.t2_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Double myD = null;
            try {
                myD = Double.parseDouble(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("Smth is wrong :)");
            }
            System.out.println( new String(Double.toString(myD)) );
        }
    }
}
