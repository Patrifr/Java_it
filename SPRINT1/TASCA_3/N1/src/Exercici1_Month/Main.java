package SPRINT1.TASCA_3.N1.Exercici1_Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> listMonth = new ArrayList<Month>();
        Iterator<Month> monthIterator  = listMonth.iterator();

        listMonth.add(new Month("January"));
        listMonth.add(new Month("February"));
        listMonth.add(new Month("March"));
        listMonth.add(new Month("April"));
        listMonth.add(new Month("May"));
        listMonth.add(new Month("June"));
        listMonth.add(new Month("July"));
        listMonth.add(new Month("September"));
        listMonth.add(new Month("October"));
        listMonth.add(new Month("November"));
        listMonth.add(new Month("December"));

        Month august = new Month("August");
        listMonth.add(7, august);

        monthIterator  = listMonth.iterator();

        System.out.println("Using the for Each loop to iterate over the ArrayList :");
        for(Month month : listMonth){
            System.out.println(month.getName());
        }

        HashSet<Month> monthHashSet = new HashSet<Month>(listMonth);
        monthHashSet.add(august);

        System.out.println("Using the Iterator to iterate over the HashSet and checking there's no duplicated objects:");
        while(monthIterator.hasNext()){
            System.out.println(monthIterator.next().getName());
        }

    }
}
