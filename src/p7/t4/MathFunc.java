package p7.t4;

import java.util.StringTokenizer;

public class MathFunc implements MathCalculatable{

    @Override
    public double pow(double num, double pow) {
        StringTokenizer st = new StringTokenizer(Fraction.get(pow), "/");
        int numerator = Integer.parseInt(st.nextToken());
        int denominator = Integer.parseInt(st.nextToken());
        System.out.println(Math.pow(num,numerator) + " " + numerator + " / " + denominator);
        return Math.pow(Math.pow(num,numerator),1.0/denominator);
    }
    @Override
    public double norm(Complex z) {
        return pow(z.x*z.x + z.y+z.y,0.5);
    }
}
