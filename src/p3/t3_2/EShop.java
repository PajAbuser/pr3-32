package p3.t3_2;

import java.util.ArrayList;
import java.util.Scanner;

public class EShop {

    public static void main(String[] args) {
        double price = 0;
        while (true) {
            System.out.println("Choose: 1 - add a product; 2 - calculate sum");
            int c = 0;
            try {
                c = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("Smth is wrong :)");
            }
            switch (c){
                case 1 ->{
                    System.out.println("Enter product's price in UNITS");
                    try {
                        price = new Scanner(System.in).nextDouble();
                    } catch (Exception e) {
                        System.out.println("Smth is wrong :)");
                    }
                }
                case 2 -> {
                    //price = new Scanner(System.in).nextDouble();
                    Converter converter = new Converter(price);
                    int s = 0;
                    System.out.println("Choose a currency: 1 - RUB, 2 - USD, 3 - EUR");
                    try {
                        s = new Scanner(System.in).nextInt();
                    } catch (Exception e) {
                        System.out.println("Smth is wrong :)");
                    }
                    switch (s){
                        case 1 -> {
                            System.out.println(
                            converter.getRub()
                        );}
                        case 2 -> {
                            System.out.println(
                            converter.convert(converter.getRub(), converter.getUsd())
                        );}
                        case 3 -> {
                            System.out.println(
                            converter.convert(converter.getRub(), converter.getEur())
                        );}
                    }
                }
            }

        }
    }
}
