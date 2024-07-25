package SPRINT1.TASCA_8.N1.Ex7_SortListReverse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Strawberry", "Banana", "Coco", "Apple", "Pear", "Tangerine");

        stringList.stream().sorted(Comparator.comparing(String :: length).reversed()).forEach(System.out :: println);
    }
}
