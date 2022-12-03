package p9.t1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter ammount of students");
            int size = new Scanner(System.in).nextInt();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                students.add(new Student((int) (Math.random() * 1000)));
            }
            ///sorting
            for (int i = 1; i < students.size(); i++) {
                Student current = students.get(i);
                int j = i - 1;
                while(j >= 0 && current.iDNumber < students.get(j).iDNumber) {
                    students.set(j+1,students.get(j));
                    j--;
                }
                students.set(j+1, current);
            }
            ///end of sorting
            for (int i = 0; i < size; i++) {
                System.out.println(students.get(i));
            }
        }
    }
}
