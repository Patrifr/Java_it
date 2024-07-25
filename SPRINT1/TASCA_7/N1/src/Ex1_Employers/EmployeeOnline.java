package SPRINT1.TASCA_7.N1.Ex1_Employers;

public class EmployeeOnline extends Employee {
    private final int internet = 55;
    public EmployeeOnline(String name, String lastname, double hourPrice) {
        super(name, lastname, hourPrice);
    }
    public int getInternet() {
        return internet;
    }
    @Override
    public double calculateSalary(double hours){
        double salary = 0d;
        salary = super.calculateSalary(hours) + this.getInternet();
        return salary;
    }
}
