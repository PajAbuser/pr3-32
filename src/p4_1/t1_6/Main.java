package p4_1.t1_6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employer employer = new Employer("zxc","qwe",123);
        ArrayList<Employer> employers = new ArrayList<>();

        employers.add(new Manager(new Employer("zxc123","qwe321",3227)));
        employers.add(new Employer("123zxc123","321qwe321",8228));
        for(Employer employerr : employers){
            System.out.println(employerr.getFirstName() + " " + employerr.getLastName() + " " + employerr.getIncome());
        }
    }
}
