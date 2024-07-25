package SPRINT1.TASCA4.N1.EX3;

import SPRINT1.TASCA_4.N1.Ex3_ArrayIndexOOB.ArrayIndexOutOfBounds;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
public class ArrayIndexOOBTest {

    @Test
    public void testOOb(){
       int [] arrayOutOfBounds = ArrayIndexOutOfBounds.getNum();
       Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () ->
       {int numOutOfBounds = arrayOutOfBounds[5];});
    }
}
