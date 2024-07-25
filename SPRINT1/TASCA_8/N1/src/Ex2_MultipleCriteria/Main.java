package SPRINT1.TASCA_8.N1.Ex2_MultipleCriteria;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Paella", "Tortilla", "Patatas Bravas", "Cocido", "Gazpacho","Jamon");

        System.out.println("Words that contain the letter O and have more than 5 letters:");
       stringList.stream().filter(o -> o.toLowerCase().contains("o") && o.length() > 5).toList()
               .forEach(System.out::println);
    }
}
