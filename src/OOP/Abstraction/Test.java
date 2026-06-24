package OOP.Abstraction;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Circle("Red",4);
        System.out.println(s1.toString());

        System.out.println();
        Shape s2 = new Rectangle("Blue", 3, 4);
        System.out.println(s2.toString());
    }
}
