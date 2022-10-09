package p3.t2_3;

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
            System.out.println((double) myD);
            System.out.println((float) (double) myD );
            System.out.println((long) (double) myD );
            System.out.println((int) (double) myD );
            System.out.println((short) (double) myD );
            System.out.println((byte) (double) myD );
            System.out.println((char) (double) myD );
        }
    }
}
