package SPRINT1.TASCA_8.N2.Ex2_StringInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Integer> intList = Arrays.asList(10,11,12,13,14,15);
        String orderedNumbers = createNewList(intList);
        System.out.println(orderedNumbers);

    }
    public static String createNewList(List<Integer> intList){
        StringBuilder builder = new StringBuilder();
        String newString = intList.stream().map(n ->((n % 2 == 0) ? "e" : "o") + n).collect(Collectors.joining(", "));
        return newString;
    }
}
