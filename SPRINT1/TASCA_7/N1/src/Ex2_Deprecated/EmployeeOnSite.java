package SPRINT1.TASCA_7.N1.Ex2_Deprecated;

public class EmployeeOnSite extends Employee {
    private static int gasoline;
    public EmployeeOnSite(String name, String lastname, double hourPrice, int gasoline) {
        super(name, lastname, hourPrice);
        EmployeeOnSite.gasoline = 20;
    }
    public static int getGasoline() {
        return gasoline;
    }
    public static void setGasoline(int gasoline) {
        EmployeeOnSite.gasoline = gasoline;
    }

    @Override
    public double calculateSalary(double hours){
        double salary = 0d;
        salary = super.calculateSalary(hours) + getGasoline();
        return salary;
    }
    @Deprecated
    public double costFood(int WorkedDays){
        double monthlyFood = 0d;
        monthlyFood = WorkedDays * 10.50;
        return monthlyFood;
    }
}
