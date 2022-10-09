package p3.t1_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter mas len");
            Scanner scanner = new Scanner(System.in);
            int n = 0;
            try {
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> arr4 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add((int) (Math.random()*1000 % n));
                if(arr.get(i) % 2 == 0 && arr.get(i) != 0) arr4.add(arr.get(i));
            }
            System.out.print(arr + "\n");
            System.out.print(arr4 + "\n");
            Collections.sort(arr);
            Collections.sort(arr4);
            System.out.print(arr + "\n");
            System.out.print(arr4 + "\n");
        }
    }
}