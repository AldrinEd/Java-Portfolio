package OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        SalesEmployee se = new SalesEmployee("Aldrin", 100, 123);
        System.out.println("Name: " + se.getName());
        System.out.println("Salary: " + se.getSalary());
        System.out.println("Salary Incentive: " + se.salaryIncentive);
    }
}
