package SPRINT1.TASCA_3.N1.Exercici2_Integer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList1 = new ArrayList<Integer>();
        List<Integer> reverseList = new ArrayList<Integer>();

        integerList1.add(10);
        integerList1.add(20);
        integerList1.add(40);
        integerList1.add(60);

        ListIterator<Integer> integerListIterator = integerList1.listIterator();

        System.out.println("Created a List<Integer> and used the .hasNext() method to iterate over the List until " +
                            "there's no more integers using the .Next() method:");
        while(integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
        }
        System.out.println("Reversing the list looping through the list in reverse and adding the integers in that" +
                            "order on a new list and printing it: ");
        while(integerListIterator.hasPrevious()){
            reverseList.add(integerListIterator.previous());
        }
        for(Integer integer : reverseList){
            System.out.println(integer);
        }
    }
}
