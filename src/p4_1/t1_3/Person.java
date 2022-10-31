package p4_1.t1_3;

public class Person {
    private String fullName;
    private String age;

    public void talk(){
        System.out.print(fullName + " is speaking");
    }

    public void move(){

    }

    public Person() {
    }

    public Person(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }
}
