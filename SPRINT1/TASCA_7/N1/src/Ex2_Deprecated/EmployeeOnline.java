package SPRINT1.TASCA_7.N1.Ex2_Deprecated;

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
    @Deprecated
    public double calculateExtraHours(double extraHours){
        double priceTotal = 0d;
        double priceExtra = 0d;
        priceExtra = this.getHourPrice() * 5.98;
        priceTotal = priceExtra * extraHours;
        return priceTotal;
    }
}
