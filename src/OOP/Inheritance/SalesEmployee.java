package OOP.Inheritance;

public class SalesEmployee extends Employee {
    int salaryIncentive;

    SalesEmployee(String name, int salary, int salaryIncentive){
        super(name, salary);
        this.salaryIncentive = salaryIncentive;
    }
}
