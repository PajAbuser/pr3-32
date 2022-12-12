package p11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSelect task (1-4):");
            switch (new Scanner(System.in).nextInt()) {
                case 1 -> {
                    System.out.println("Strizhevskiy\n19:44 29.09.2022");
                    Date d = new Date();
                    System.out.printf("%tR %tF", d, d);
                }
                case 2 -> {
                    System.out.println("Enter year, month, day, hour, minute, second:");
                    Calendar setDate = Calendar.getInstance();
                    setDate.set(
                            new Scanner(System.in).nextInt(),
                            new Scanner(System.in).nextInt(),
                            new Scanner(System.in).nextInt()
                    );
                    setDate.set(Calendar.HOUR_OF_DAY, new Scanner(System.in).nextInt());
                    setDate.set(Calendar.MINUTE, new Scanner(System.in).nextInt());
                    setDate.set(Calendar.SECOND, new Scanner(System.in).nextInt());
                    System.out.println(setDate.getTime());
                Calendar diff = Calendar.getInstance();
                /*diff.setTime(new Date().setYear(setDate.get(Math.abs(Calendar.YEAR-Calendar.getInstance().get(Calendar.YEAR)))));
                );*/
                }
                case 3 -> {

                }
                case 4 -> {

                }
            }
        }
    }
}
