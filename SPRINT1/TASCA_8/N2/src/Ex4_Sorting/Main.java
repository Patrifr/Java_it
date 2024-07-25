package SPRINT1.TASCA_8.N2.Ex4_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Strawberry", "22", "Kiwi", "Cherry", "13", "Plum","Banana","Coco", "23", "Blueberry");

        System.out.println("Sorting list alphabetically by the first char: ");
        list.stream().sorted(Comparator.comparing(s -> s.charAt(0))).toList().forEach(System.out::println);

        System.out.println("\nSorting list by Strings containing letter \"E\" first:");
        list.stream().filter(s -> s.toLowerCase().contains("e")).sorted(Comparator.comparing(s -> s.charAt(0)))
                .toList().forEach(System.out::println);
        list.stream().filter(s -> !s.toLowerCase().contains("e")).sorted(Comparator.comparing(s -> s.charAt(0)))
                .toList().forEach(System.out::println);

        System.out.println("\nChange the letter \"A\" for a \"4\": ");
        list.stream().sorted().toList().forEach(s -> {s = s.toLowerCase().replace("a", "4");
        System.out.println(s);
        });

        System.out.println("\nPrint only numbers: ");
        list.stream().filter(s -> s.matches("[0-9]*")).toList().forEach(System.out::println);

    }
}
