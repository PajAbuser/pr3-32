package p7.t7to8;

public class Magazine implements Printable {

    static void printMagazines(Printable[] printables){
        for(int i = 0; i < printables.length;i++){
            if(printables[i].getClass() == Magazine.class){
                System.out.println(i + " " + printables[i]);
            }
        }
    }
}
