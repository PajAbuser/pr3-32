package p10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> iDNumber = new ArrayList<>();
    public static void quickSort(ArrayList<Student> array, int low, int high) {
        if (array.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student opora = array.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getGrades() < opora.getGrades()) {
                i++;
            }
            while (array.get(j).getGrades() > opora.getGrades()) {
                j--;
            }
            if (i <= j) {
                Student temp = array.get(i);
                array.set(i,array.get(j));
                array.set(j,temp);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
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
                if ( left.get(i).getGrades() < right.get(j).getGrades() ){
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
    static void setArray(int size){
        for(int i = 0; i < size; i++){
            iDNumber.add(new Student((int) (Math.random()*10)));
        }
    }
    static void outArray(ArrayList<Student> array){
        for (Student student : array) {
            System.out.println(student);
        }
    }
    static ArrayList<Student> merge(ArrayList<Student> s1, ArrayList<Student> s2) {
        ArrayList<Student> s3 = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < s1.size() && j < s2.size()) {
            if (s1.get(i).getGrades() < s2.get(j).getGrades()) {
                s3.add(s1.get(i));
                i++;
            } else {
                s3.add(s2.get(j));
                j++;
            }
        }
        while (i < s1.size()) {
            s3.add(s1.get(i));
            i++;
        }
        while (j < s2.size()) {
            s3.add(s2.get(j));
            j++;
        }
        return s3;
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nEnter size of array: ");
            setArray(new Scanner(System.in).nextInt());
            outArray(iDNumber);
            System.out.println();
            ArrayList<Student> iDNumber1 = iDNumber;
            quickSort(iDNumber1, 0, iDNumber1.size() - 1);
            outArray(iDNumber1);
            System.out.println();
            mergeSort(iDNumber);
            outArray(iDNumber);
            System.out.println();
            ArrayList<Student> merged = merge(iDNumber, iDNumber1);
            outArray(merged);
        }
    }
}
