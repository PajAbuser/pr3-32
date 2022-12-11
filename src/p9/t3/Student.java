package p9.t3;

public class Student {
    private int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return String.format("Student{iDNumber="+"%1$3d"+"}",iDNumber);
    }

    public int getiDNumber() {
        return iDNumber;
    }
}
