package p4_1.t1_2;

public class Phone {

    private String number;
    private String weight;
    private String model;

    public String getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public Phone() {
    }

    public void recieveCall(String name, String number){}

    public void sendMessage(String[] args){
        for(String s : args){
            System.out.print(s+"\n");
        }
    }

    @Override
    public String toString() {
        return    "number='" + number + '\'' +
                ", weight='" + weight + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String weight, String model) {
        new Phone(number,model);
        this.weight = weight;
    }


    public void recieveCall(String callerName){
        System.out.println("\nЗвонит "+callerName);
    }

    public void recieveCall(){}
}
