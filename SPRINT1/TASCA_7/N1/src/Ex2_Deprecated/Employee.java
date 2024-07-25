package SPRINT1.TASCA_7.N1.Ex2_Deprecated;

public abstract class Employee {
    private String name;
    private String lastname;
    private double hourPrice;

    public Employee(String name, String lastname, double hourPrice){
        this.name = name;
        this.lastname = lastname;
        this.hourPrice = hourPrice;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public double getHourPrice() {
        return hourPrice;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setHourPrice(double hourPrice) {
        this.hourPrice = hourPrice;
    }

    public double calculateSalary(double hours){
        double salary = 0d;
        salary = hours * this.getHourPrice();
        return salary;
    }
}
