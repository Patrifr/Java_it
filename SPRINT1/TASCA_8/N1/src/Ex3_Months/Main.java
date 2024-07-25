package SPRINT1.TASCA_8.N1.Ex3_Months;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> monthsList = Arrays.asList("January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");

        monthsList.forEach(month -> System.out.println(month));
    }
}
