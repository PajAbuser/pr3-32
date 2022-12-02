package p8.t1_1;

import java.util.Scanner;

public class Main {

    static String rec1(int k, int n) {
        String rets = "";
        while(n<=k) {
            for (int i = 0; i < n; i++) {
                rets += String.valueOf(n);
            }
            return rets + rec1(k,n + 1);
        }
        return rets;
    }
    static String rec2(int k, int n){
        if(k < n) {
            return k + rec2(k + 1, n);
        }
        else if(k > n) {
            return k + rec2(k - 1, n);
        }
        else return String.valueOf(k);
    }

    string
    public static void main(String[] args) {
        while(true){
            System.out.println("Enter task num (1-5)");
            int select1 = new Scanner(System.in).nextInt();
            switch(select1) {
                case 1 -> {
                    int k = new Scanner(System.in).nextInt();
                    System.out.println(rec1(k, 1));
                }
                case 2 -> {
                    int k = new Scanner(System.in).nextInt();
                    System.out.println(rec2(1, k));
                }
                case 3 -> {
                    int a = new Scanner(System.in).nextInt();
                    int b = new Scanner(System.in).nextInt();
                    System.out.println(rec2(a, b));
                }
            }
        }
    }
}
