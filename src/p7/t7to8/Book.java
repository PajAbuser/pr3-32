package p7.t7to8;

public class Book implements Printable{
    static void printBooks(Printable[] printables){
        int i = 0;
        for(Printable p : printables){
            if(p instanceof Book){
                System.out.println(i + " " + printables[i]);
            }
            i++;
        }
    }
}
