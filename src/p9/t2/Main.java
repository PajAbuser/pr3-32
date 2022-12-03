package p9.t2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter ammount of students");
            int size = new Scanner(System.in).nextInt();
            Comparator<Student> scomp = new SortingStudentsByGPA();
            ArrayList<Student> students = new ArrayList<Student>();
            for (int i = 0; i < size; i++) {
                students.add(new Student((int) (Math.random() * 1000)));
            }
            students.sort(scomp);
            for(Student s : students){
                System.out.println(s);
            }

        }
    }
}
