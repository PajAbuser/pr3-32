package p4.t1_2;

import p4.Season;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Season curSeason = Season.values()[new Scanner(System.in).nextInt()];

        switch(curSeason){
            case
                AUTUMN,
                WINTER,
                SUMMER,
                SPRING
                ->
                System.out.println("\nI love " + curSeason.toString());
            default -> System.out.println("\nI love no season(");
        }

    }
}
