package Ex1_Employers;

public class EmployeeOnSite extends Employee {
    private static int gasoline;

    public EmployeeOnSite(String name, String lastname, double hourPrice) {
        super(name, lastname, hourPrice);
    }

    static{
        EmployeeOnSite.gasoline = 20;
    }

    @Override
    public double calculateSalary(double hours){
        double salary = 0d;
        salary = super.calculateSalary(hours) + EmployeeOnSite.gasoline;
        return salary;
    }
}
