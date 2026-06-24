package OOP.Abstraction;

abstract class Shape {
    String color;

    abstract double area();
    public abstract String toString();

    public Shape(String colour){
        System.out.println("Shape Constructor Called.");
        this.color = colour;
    }

    public String getColor(){
        return color;
    }
}
