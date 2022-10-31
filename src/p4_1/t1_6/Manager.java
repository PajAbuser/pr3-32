package p4_1.t1_6;

public class Manager extends Employer{

    private Employer employer;
    private double averageSum = 12;


    public Manager(Employer employer) {
        super();
        this.employer = employer;

    }

    public double getIncome(){
        return averageSum + employer.getIncome();
    }
}
