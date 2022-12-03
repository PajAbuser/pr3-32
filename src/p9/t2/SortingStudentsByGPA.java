package p9.t2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGrades() == o2.getGrades()) return 0;
        if(o1.getGrades() > o2.getGrades()) return 1;
        else return -1;
    }
}
