package p4_1.t1_1;

public class Shape {
    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public Shape(String name){
        this.name = name;
    }
    private String name;

    public String getType(){
        return name;
    }

    public double getArea(){
        return 0;
    }

    public double getPerimeter(){
        return 0;
    }

}
