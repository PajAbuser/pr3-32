package p4;

public enum Season {

    SUMMER (1),
    AUTUMN (2),
    WINTER (3),
    SPRING (4);

    double[] avgTemps = new double[]{1, 2, 3, 4};
    double avgTemp;

    private int SeasonSelector;
    Season(int SeasonSelector) {
        this.SeasonSelector = SeasonSelector;
        this.avgTemp = avgTemps[SeasonSelector];
    }

    Season() {
        this.avgTemp = avgTemps[SeasonSelector];
    }

    public void setSeasonSelector(int seasonSelector) {
        this.SeasonSelector = seasonSelector;
    }

    Season(int SeasonSelector, double avgTemp) {
        this.SeasonSelector = SeasonSelector;
        this.avgTemps[SeasonSelector] = avgTemp;
    }

    public String getDescription(){
        if(this.SeasonSelector != 1) {
            return "Cold season of year";
        }
        else return "Warm season of year";
    }

}
