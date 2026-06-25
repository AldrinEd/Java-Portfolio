package OOP.Polymorphism.Overriding;

public class MetroBank extends Bank{
    @Override void getInterest(int interest){
        System.out.println("Interest claimed!");
        System.out.println(interest * 3);
    }

    public static void main(String[] args) {
        Bank myBank = new MetroBank();
        myBank.getInterest(10);
        Bank bank = new Bank();
        bank.getInterest(10);
    }
}
