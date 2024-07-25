package SPRINT1.TASCA_8.N2.Ex3_Operation;

public class Main {
    public static void main(String[] args) {
        Operation sum = ((num1, num2) -> num1 + num2);
        System.out.println("Sum result: " + sum.operation(13,77));

        Operation subst = ((num1, num2) -> num1 - num2);
        System.out.println("Subtraction result: " + subst.operation(45,11));

        Operation mult = ((num1, num2) -> num1 * num2);
        System.out.println("Multiplication result: " + mult.operation(65, 5));

        Operation division = ((num1, num2) -> num1 / num2);
        System.out.println("Division result: " + division.operation(15,7));
    }
}
