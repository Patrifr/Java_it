package N1.EX1;
import Ex1_JUnitMonths.Months;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MonthTest {

    ArrayList<String> months = Months.monthsToArrayList();

    @Test
    void sizeList(){
        int size = months.size();
        assertEquals(12, size);
    }

    @Test
    void listNotNull(){
        assertNotNull(months);
    }

    @Test
    void augustIndex(){
        assertEquals("August", months.get(7));
    }

}