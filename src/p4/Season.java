package p4;

public enum Season {

    SUMMER (0),
    AUTUMN (1),
    WINTER (2),
    SPRING (3);

    final double[] avgTemps = new double[]{1, 2, 3, 4};
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
    public double getAvgTemp(int i){
        return avgTemps[i];
    }


    public String getDescription(){
        if(this.SeasonSelector != 0) {
            return "Cold season of year";
        }
        else return "Warm season of year";
    }

}
