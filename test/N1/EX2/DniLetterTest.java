package SPRINT1.TASCA4.N1.EX2;

import SPRINT1.TASCA_4.N1.Ex2_DNI.CalculateDNI;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniLetterTest {
    @ParameterizedTest
    @CsvSource(value = {"75536115:K", "42403040:X", "17485550:F", "23794532:C", "91986142:B",
                        "84503451:W", "71255964:D", "62355375:Y", "88273838:E", "70297962:A"},
                        delimiter = ':')

    public void testLetter(int dni, char letter){
    CalculateDNI checkLetter = new CalculateDNI(dni);
    char correctLetter = checkLetter.calculateLetter();
    assertEquals(letter, correctLetter);
    }
}
