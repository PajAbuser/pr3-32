package p4_1.t1_4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int a = Math.abs(new Random().nextInt() % 10);
        int b = Math.abs(new Random().nextInt() % 10);
        Matrix m1 = new Matrix(a,b);
        Matrix m2 = new Matrix(b,a);
        /*m1.display(); m2.display();
        m1.addMatrix(m2); m1.display();
        m1.display(); m2.display();
        m1.doubleNaMatrix(new Scanner(System.in).nextDouble());
        m1.display();*/
        m1.display(); m2.display();
        m1.multMatrix(m2).display();
    }
}
