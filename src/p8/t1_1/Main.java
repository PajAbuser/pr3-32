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
    static int rec4(int b, int k, int s) {
        int raz = (int) Math.pow(10,k) - 1;
        if (s > 9*k || s < 1) return 0;
        if (b <= raz) {
            int sum = 0;
            String str = Integer.toString(b);
            for (int i = 0; i < k; i++){
                sum += str.charAt(i) - '0';
            }
            if(sum == s) return 1 + rec4(b+1,k,s);
            return rec4(b+1,k,s);
        }
        else return 0;
    }

    static int rec5(int N, int iter){
        int raz = (int) Math.pow(10,iter);
        if(raz > N) return 0;
        else return (N / raz) % 10 + rec5(N, iter+1);
    }

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
                case 4 -> {
                    System.out.println("Enter num of razryads and desired sum of digits in num");
                    int a = new Scanner(System.in).nextInt();
                    int b = new Scanner(System.in).nextInt();
                    System.out.println(rec4((int)Math.pow(10,a - 1),a, b));
                }
                case 5 ->{
                    int N = new Scanner(System.in).nextInt();
                    System.out.println(rec5(N,0));
                }
            }
        }
    }
}
