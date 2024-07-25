package SPRINT1.TASCA_8.N2.Ex1_Names;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Ana", "Jose", "Amy", "Joan", "Pep", "Maria", "Axe", "Ari");
        namesList.stream().filter(name -> name.charAt(0) == 'A' && name.length() == 3).toList()
                .forEach(System.out::println);
    }
}
