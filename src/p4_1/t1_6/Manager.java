package p4_1.t1_6;

public class Manager extends Employer{

    public Employer employer;
    private double averageSum = 12;


    public Manager(Employer employer) {
        super(employer.getFirstName(), employer.getFirstName(), employer.getIncome());
        this.employer = employer;

    }

    @Override
    public String toString(){
        return employer.getFirstName() + " " + employer.getLastName() + " " + getIncome();
    }

    public double getIncome(){
        return averageSum + employer.getIncome();
    }
}
