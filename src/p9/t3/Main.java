package p9.t3;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Student> merge(ArrayList<Student> s1, ArrayList<Student> s2) {
        ArrayList<Student> s3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < s1.size() && j < s2.size()) {
            if (s1.get(i).getiDNumber() < s2.get(j).getiDNumber()) {
                s3.add(s1.get(i));
                i++;
            } else {
                s3.add(s2.get(j));
                j++;
            }
        }
        while (i < s1.size()) {
            s3.add(s1.get(i));
            i++;
        }
        while (j < s2.size()) {
            s3.add(s2.get(j));
            j++;
        }
        return s3;
    }

    public static void main(String[] args) {

        ArrayList<Student> students1 = new ArrayList<>(10);
        ArrayList<Student> students2 = new ArrayList<>(10);

        int[] ints = new Random().ints(20).toArray();
        for (int i = 0; i < 20; i += 2) {
            students1.add(new Student(ints[i] % 100));
            students2.add(new Student(ints[i + 1] % 100));
        }
        System.out.println(students1);
        System.out.println();
        System.out.println(students2);

        ArrayList<Student> students = merge(students1, students2);
        System.out.println();
        System.out.println(students);
        System.out.println();
        Sorts.mergeSort(students);
        System.out.println(students);

    }
}