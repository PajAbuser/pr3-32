package p7.t4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MathCalculatable mathFunc = new MathFunc();
        double x,y;
        x = Double.parseDouble(new Scanner(System.in).nextLine());
        y = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Calculated = " + mathFunc.pow(x,y) + "\n\"Real\"     = " + Math.pow(x,y));

        System.out.println("\nArea of circle with R = " + x + " : " + mathFunc.pow(x,2) * mathFunc.PI + " (calculated by MathFunc)");
        
    }
}
