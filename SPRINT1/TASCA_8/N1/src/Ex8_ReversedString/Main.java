package SPRINT1.TASCA_8.N1.Ex8_ReversedString;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        Reverse reverse = (s -> { builder.append(s);
            return builder.reverse().toString();
    });
        String s = "I want to go to Japan";
        System.out.println("Original String: " + s + "\nReversed String: " + reverse.reversedString(s));
    }
}
