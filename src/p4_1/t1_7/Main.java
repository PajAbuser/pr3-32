package p4_1.t1_7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pupil> pupils = new ArrayList<>();
        pupils.add(new Student());
        pupils.add(new Shoolboy());
        pupils.add(new Student());
        pupils.add(new Student());
        for(Pupil pup : pupils){
            if(pup.getClass() == Student.class) System.out.println(pup);
        }
        for(Pupil pup : pupils){
            if(pup.getClass() == Shoolboy.class) System.out.println(pup);
        }
    }
}
