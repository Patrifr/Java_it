package N1.EX3;

import Ex3_ArrayIndexOOB.ArrayIndexOutOfBounds;
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
