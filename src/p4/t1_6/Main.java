package p4.t1_6;

import p4.Season;

public class Main {

    public static void main(String[] args) {

        Season curSeason;

        for(int i = 0; i < 4; i++){

            curSeason = Season.values()[i];
            curSeason.setSeasonSelector(i);
            System.out.println(curSeason + " avg temp = " + curSeason.getAvgTemp(i) + " " + curSeason.getDescription());

        }

    }

}
