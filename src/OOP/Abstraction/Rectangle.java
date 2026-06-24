package OOP.Abstraction;

public class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(String color, int height, int width){
        super(color);
        System.out.println("Rectangle Constructor Called.");
        this.height = height;
        this.width = width;
    }

    @Override double area(){
        return height * width;
    }

    @Override public String toString(){
        return "Rectangle color is " + color + " and area is : " + area();
    }
}
