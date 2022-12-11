package p9.t3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Sorts {

    public static void mergeSort(ArrayList<Student> students) {
        if (students.size() > 1){
            int mid = students.size() / 2;
            ArrayList<Student> left = new ArrayList<>(students.subList(0, mid));
            for (int i = 0; i < mid ; i++){
                left.set(i,students.get(i));
            }
            ArrayList<Student> right = new ArrayList<>(students.subList(0, students.size() - mid));
            for (int i = mid;i < students.size();i++){
                right.set((i - mid),students.get(i));
            }
            mergeSort(left);
            mergeSort(right);
            int i = 0;
            int j = 0;
            int k = 0;
            while ( i < left.size() && j < right.size()){
                if ( left.get(i).getiDNumber() < right.get(j).getiDNumber() ){
                    students.set(k,left.get(i));
                    i++;
                } 
                else{
                    students.set(k,right.get(j));
                    j++;
                }
                k++;
            }
            while ( i <
            left.size()){
                students.set(k,left.get(i));
                i++;
                k++;
            }
            while ( j <
            right.size()){
                students.set(k,right.get(j));
                j++;
                k++;
            }
        }
    }
}