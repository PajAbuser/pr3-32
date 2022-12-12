package p10;

public class Student{
    private String name, surname, specialization;
    private int course, group;
    private double grades;

    public double getGrades() {
        return grades;
    }

    public Student(int group) {
        this.name           = "name" + String.valueOf(group);
        this.surname        = "surname" + String.valueOf(group);;
        this.specialization = "specialization" + String.valueOf(group);;
        this.course         = group;
        this.group          = group;
        this.grades         = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                name + ", " +
                surname + ", " +
                specialization + ", " +
                course + ", " +
                group +
                "}";
    }
}
