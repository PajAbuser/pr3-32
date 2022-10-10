package p3.t1_2;

import java.util.*;

public class Tester {
    private static ArrayList<Circle> circles = new ArrayList<>();

    public static Circle getSmallestCircle() {
        Circle circle = new Circle(new Point(0.0, 0.0), -2 ^ Double.SIZE);
        for (int i = 0; i < circles.size(); i++) {
            double curCircleR = circles.get(i).getR();
            if (curCircleR < circle.getR()) circle.setR(curCircleR);
        }
        return circle;
    }

    public static Circle getLargestCircle() {
        Circle circle = new Circle(new Point(0.0, 0.0), -2 ^ Double.SIZE);
        for (int i = 0; i < circles.size(); i++) {
            double curCircleR = circles.get(i).getR();
            if (curCircleR > circle.getR()) circle.setR(curCircleR);
        }
        return circle;
    }

    class MComparator implements Comparator<Circle> {

        @Override
        public int compare(Circle o1, Circle o2) {
            return Double.compare(o1.getR(), o2.getR());
        }
    }

    public void sortByR() {
        Collections.sort(circles, new MComparator());
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter mas len");
            int l = new Scanner(System.in).nextInt();
            System.out.println("Enter rand method (1 - Math.random(); 2 - Random)");
            int i = new Scanner(System.in).nextInt();
            switch (i) {
                case 1 -> {
                    for (int m = 0; m < l; m++) {
                        circles.add(new Circle(new Point(0, 0), (int) ((Math.random()) * 100)));
                    }
                }
                case 2 -> {
                    for (int m = 0; m < l; m++) {
                        circles.add(new Circle(new Point(0, 0), Math.abs(new Random().nextInt() % 100)));
                    }
                }
            }
            for (int n = 0; n < circles.size(); n++) {
                System.out.println(circles.get(n));
            }
            new Tester().sortByR();
            System.out.println("\n\n\n");
            for (int n = 0; n < circles.size(); n++) {
                System.out.println(circles.get(n));
            }
            System.out.println();
            System.out.println(getLargestCircle());
            System.out.println(getSmallestCircle());
        }
    }
}