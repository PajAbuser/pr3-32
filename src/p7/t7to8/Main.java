package p7.t7to8;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[10];
        for(int i = 0; i < 10; i+=2){
            printables[i] = new Book();
        }
        for(int i = 1; i < 10; i+=2){
            printables[i] = new Magazine();
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i + " " + printables[i]);
        }
        System.out.println();
        Magazine.printMagazines(printables);
        System.out.println();
        Book.printBooks(printables);
    }
}
