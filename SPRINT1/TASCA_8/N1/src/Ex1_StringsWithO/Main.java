package SPRINT1.TASCA_8.N1.Ex1_StringsWithO;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Paella", "Tortilla", "Patatas Bravas", "Cocido", "Gazpacho","Jamon");

        System.out.println("Words that contain the letter O: ");
       stringList.stream().filter(o -> o.toLowerCase().contains("o")).toList()
               .forEach(System.out::println);
    }
}
