package SPRINT1.TASCA_6.N2.Ex2_ModifyArguments;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> listPerson = new ArrayList<>();
        ArrayList<Integer> listInt = new ArrayList<>();

        Person person1 = new Person("Sebastián","Fernandez",32);
        Person person2 = new Person("Naiara","Garcia", 45);
        Person person3 = new Person("Irene","Cervantes", 25);

        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(person3);

        listInt.add(11);
        listInt.add(12);
        listInt.add(13);

        GenericArray.printArgumentsList(listPerson);
        GenericArray.printArgumentsList(listInt);
    }
}
