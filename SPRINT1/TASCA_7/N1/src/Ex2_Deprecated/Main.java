package Ex2_Deprecated;

public class Main {
    @SuppressWarnings ("deprecation")
    public static void main(String[] args) {
        double hours = 0d;
        EmployeeOnSite employee1 = new EmployeeOnSite("Josep","Alvarez",10.44,35);
        EmployeeOnline employee2 = new EmployeeOnline("Maria","Bergua",10.44);

        System.out.println("This month's salary for worker " + employee1.getName() + " " + employee1.getLastname() +
                        ", is a total of " + employee1.calculateSalary(144) + "€");
        System.out.println("This month's salary for worker " + employee2.getName() + " " + employee2.getLastname() +
                        ", is a total of " + employee2.calculateSalary(125) + "€");

        System.out.println(employee1.costFood(20));
        System.out.println(employee2.calculateExtraHours(10));


    }
}
