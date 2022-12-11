package p9.t2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void quickSort(ArrayList<Student> array, int low, int high) {
        if (array.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getGrades() < opora.getGrades()) {
                i++;
            }
            while (array.get(j).getGrades() > opora.getGrades()) {
                j--;
            }
            if (i <= j) {
                Student temp = array.get(i);
                array.set(i,array.get(j));
                array.set(j,temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter ammount of students");
            int size = new Scanner(System.in).nextInt();
            Comparator<Student> scomp = new SortingStudentsByGPA();
            ArrayList<Student> students = new ArrayList<Student>();
            for (int i = 0; i < size; i++) {
                students.add(new Student((int) (Math.random() * 1000)));
            }
            System.out.println(students);
            quickSort(students, 0, students.size() - 1);
            System.out.print("Sorted students:\n");
            System.out.print(students);
        }
    }
}
