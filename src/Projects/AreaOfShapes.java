package Projects;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What shape do you want to calculate?");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
        System.out.print("Select a number: ");
        int choice = sc.nextInt();
        // This is the clear console screen in java (clrscr() in C++)
        // System.out.print("\033[H\033[2J");
        // System.out.flush(); 

        switch (choice) {
            case 1:{
                System.out.println("Calculating the Area of Square.\n");
                System.out.print("Enter the length of the Side: ");
                double side = sc.nextInt();
                AreaOfShapes area = new AreaOfShapes();
                area.areaOfSquare(side);
                break;
            }

            case 2:{
                System.out.println("Calculating the Area of Rectangle.\n");
                System.out.print("Enter the Width: ");
                double width = sc.nextInt();
                System.out.print("Enter the Height: ");
                double height = sc.nextInt();
                AreaOfShapes area = new AreaOfShapes();
                area.areaOfRectangle(width, height);
                break;
            }

            case 3:{
                System.out.println("Calculating the Area of Triangle.\n");
                System.out.print("Enter the Base: ");
                double base = sc.nextInt();
                System.out.print("Enter the Height: ");
                double height = sc.nextInt();
                AreaOfShapes area = new AreaOfShapes();
                area.areaOfTriangle(base, height);
                break;
            }

            case 4:{
                System.out.println("Calculating the Area of Circle.\n");
                System.out.print("Enter the Radius: ");
                double radius = sc.nextInt();
                AreaOfShapes area = new AreaOfShapes();
                area.areaOfCircle(radius);
                break;
            }
        
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
    
    public double areaOfTriangle(double base, double height){
        double area = base * height * 0.5 ;
        System.out.println("The area of Triangle is: " + area);
        return area;
    }

    public double areaOfSquare(double side){
        double area = Math.pow(side, 2);
        System.out.println("The area of Square is: " + area);
        return area;
    }

    public double areaOfRectangle(double width, double height){
        double area = width * height;
        System.out.println("The area of Rectangle is: " + area);
        return area;
    }

    public double areaOfCircle(double radius){
        double area = Math.PI * (Math.pow(radius, 2));
        System.out.println("The area of Circle is: " + area);
        return area;
    }

}
