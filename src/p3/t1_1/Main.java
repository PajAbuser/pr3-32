package p3.t1_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter mas len");
            int l = new Scanner(System.in).nextInt();
            System.out.println("Enter rand method (1 - Math.random(); 2 - Random)");
            int i = new Scanner(System.in).nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            switch (i) {
                case 1 -> {
                    for (int m = 0; m < l; m++) {
                        arr.add((int) ((Math.random()-0.5) * 20000));
                    }
                }
                case 2 -> {
                    for (int m = 0; m < l; m++) {
                        arr.add(new Random().nextInt());
                    }
                }
            }
            for (int n = 0; n < l; n++) {
                System.out.print(arr.get(n)  + " ");
            }
            //sortbegin
            Collections.sort(arr);
            //sortend
            System.out.println("\n");
            for (int n = 0; n < l; n++) {
                System.out.print(arr.get(n) + " ");
            }
        }
    }
}
