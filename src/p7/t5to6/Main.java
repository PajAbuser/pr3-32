package p7.t5to6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringHandable stringHandler = new ProcessStrings();
        String s = new Scanner(System.in).nextLine();
        System.out.println(stringHandler.countLiterals(s) + " " + stringHandler.task2(s) + " " + stringHandler.reverse(s));
    }
}
