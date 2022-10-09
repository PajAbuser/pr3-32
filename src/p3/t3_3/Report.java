package p3.t3_3;

import p3.t1_1.Main;

import java.util.ArrayList;

public class Report {
    private static ArrayList<Employee> employees = new ArrayList<>();
    public static void generateReport(){
        for(Employee employee : employees){
            System.out.printf("%1$10.2f",employee.getSalary());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < Math.random()*100; i++) employees.add(new Employee("zxc", (Math.random()*1000000)));
        Report.generateReport();
    }
}
