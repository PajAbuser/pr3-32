package p3.t2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Double myD = Double.valueOf(new Scanner(System.in).nextLine());
                System.out.println(myD);
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        }
    }
}
