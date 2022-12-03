package p9.t2;

public class Student{
    private double grades;

    public Student(double g) {
        this.grades = g;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + grades +
                '}';
    }
    public double getGrades() {
        return grades;
    }
}
