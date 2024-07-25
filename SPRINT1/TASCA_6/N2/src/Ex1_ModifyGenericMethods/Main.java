package SPRINT1.TASCA_6.N2.Ex1_ModifyGenericMethods;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Sebastián","Fernandez",32);
        Person person2 = new Person("Naiara","Garcia", 45);
        Person person3 = new Person("Irene","Cervantes", 25);

        GenericMethods.printArguments(person1,"Apple",63);
        GenericMethods.printArguments("Apple","Strawberry",75);
        GenericMethods.printArguments(12,13,14);
        GenericMethods.printArguments(person1,person2, 89);
    }
}
