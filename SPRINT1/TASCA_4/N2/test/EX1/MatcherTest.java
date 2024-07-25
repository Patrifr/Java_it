package SPRINT1.TASCA4.N2.EX1;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;


public class MatcherTest {
    @Test
    public void testStringLenght(){
        MatcherClass matcherIncorrect = new MatcherClass(is(8));
        MatcherAssert.assertThat("mordor", matcherIncorrect);
    }
}
