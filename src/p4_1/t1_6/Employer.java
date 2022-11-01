package p4_1.t1_6;

public class Employer {

    private String firstName , lastName;
    private double income;


    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    @Override
    public String toString() {
        return firstName + ' ' +
                lastName + ' ' +
                income;
    }

    public Employer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getIncome() {
        return income;
    }

}
