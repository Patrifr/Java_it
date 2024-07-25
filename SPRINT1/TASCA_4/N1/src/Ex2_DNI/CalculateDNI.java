package SPRINT1.TASCA_4.N1.Ex2_DNI;

public class CalculateDNI {
    private final  int NUM_DNI;

    public CalculateDNI(int NUM_DNI){
        this.NUM_DNI = NUM_DNI;
    }
    public int getNUM_DNI() {
        return NUM_DNI;
    }

    public char calculateLetter(){
        char[] letter = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N',
                         'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letter[this.NUM_DNI % 23];
    }
}
