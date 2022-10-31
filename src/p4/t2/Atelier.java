package p4.t2;

public class Atelier implements WomenClothing, MenClothing{

    public void dressMan(Clothes[] clothes) {

        for(Clothes clothe : clothes){

            System.out.println(clothe.toString());

        }
    }

    public void dressWoman(Clothes[] clothes) {

        for(Clothes clothe : clothes){

            System.out.println(clothe.toString());

        }
    }

    public void dressWoman() {

    }

    public void dressMan() {

    }
}
