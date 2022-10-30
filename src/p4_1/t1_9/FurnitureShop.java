package p4_1.t1_9;

import java.util.ArrayList;

public class FurnitureShop {


    public static void main(String[] args) {

        ArrayList<Furniture> furnitures = new ArrayList<>();

        furnitures.add(new Chair("Ikea chair"));
        furnitures.add(new Sofa ("Ikea sofa" ));
        furnitures.add(new Table("Ikea table"));

        System.out.println(furnitures);
        for(Furniture ex : furnitures){
            System.out.println(ex.getName());
        }
        for(Furniture ex : furnitures){
            System.out.println(ex.toString());
        }
    }
}
