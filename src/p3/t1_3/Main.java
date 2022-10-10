package p3.t1_3;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            if (Objects.equals(new Scanner(System.in).nextLine(), "")) {
                boolean flag = true;
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add((int) (Math.random() * 100));
                for (int i = 1; i < 4; i++) {
                    arr.add((int) (Math.random() * 100));
                    if (arr.get(i) < arr.get(i - 1)) flag = false;
                }
                if (flag) System.out.println("Cтрого возрастающa9" + " последовательность");
                else System.out.println("nea(");
                for(Integer s: arr) System.out.printf(s.toString() + ",");
                System.out.println("");
            }
        }
    }
}