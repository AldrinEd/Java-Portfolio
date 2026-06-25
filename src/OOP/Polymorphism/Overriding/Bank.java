package OOP.Polymorphism.Overriding;

public class Bank {
    int interest;

    void getInterest(int interest){
        System.out.println("Interest claimed!");
        System.out.println(interest * 2);
    }
}
