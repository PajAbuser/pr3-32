package p3.t3_2;

public class Converter {
    private RUB rub;
    private USD usd = null;
    private EUR eur = null;

    public Converter() {
    }

    public class RUB extends Converter implements Currency {
        String name = getClass().getName();
        private double valToUE = 0;

        @Override
        public String toString() {
            return getValToUE() + "";
        }

        public RUB(double valToUE) {
            this.valToUE = valToUE;
            USD usd = new USD(valToUE);
            Converter.this.usd = usd;
            EUR eur = new EUR(valToUE);
            Converter.this.eur = eur;
        }

        public double getValToUE() {
            return valToUE;
        }
    }
    public class USD implements Currency{
        @Override
        public String toString() {
            return getValToUE() + "";
        }
        private double valToUE;
        public USD(double valToUE) {
            this.valToUE = valToUE;
        }
        @Override
        public double getValToUE() {
            return 0.016;
        }
    }
    public class EUR implements Currency {
        @Override
        public String toString() {
            return getValToUE() + "";
        }
        private double valToUE;
        public EUR(double valToUE){
            this.valToUE = valToUE;
        }
        @Override
        public double getValToUE() {
            return 0.017;
        }
    }
    public Converter(double price){
        RUB rub = new RUB(price);
        Converter.this.rub = rub;
    }
    public RUB getRub(){
        return rub;
    }
    public USD getUsd(){
        return usd;
    }
    public EUR getEur(){
        return eur;
    }
    public double convert(Currency o1, Currency o2){
        return o1.getValToUE() * o2.getValToUE();
    }

}
