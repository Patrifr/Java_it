package Ex5_PiValue;

public class Main {
    public static void main(String[] args) {
        PiValue pi = () -> 3.1415;

        System.out.println(pi.getPiValue());
    }
}
