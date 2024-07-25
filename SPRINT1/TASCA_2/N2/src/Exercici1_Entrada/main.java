package SPRINT1.TASCA_2.N2.Exercici1_Entrada;

import java.util.Scanner;

public class main {
    public static void main (String[] args) throws Exception {
        Scanner entry = new Scanner(System.in);

       byte entry1 = Entrada.llegirByte("Introdueix la teva edat:");
        System.out.println("La edat introduïda és: " + entry1);

        int entry2 = Entrada.llegirInt("Introdueix el teu número preferit:");
        System.out.println("El teu número preferit és: " + entry2);

        float entry3 = Entrada.llegirFloat("Introdueix un número decimal:");
        System.out.println("El número introduït és: " + entry3);

        double entry4 = Entrada.llegirDouble("Introdueix un altre número decimal:");
        System.out.println("El número introduït és: " + entry4);

        char entry5 = Entrada.llegirChar("Introdueix un char: ");
        System.out.println("El char introduït és: " + entry5);

        String entry6 = Entrada.llegirString("Introdueix un String:");
        System.out.println("El String introduït és: " + entry6);

        boolean entry7 = Entrada.llegirSiNo("Introdueix el boolean S o N: ");
        System.out.println("El boolean introduït és: " + entry7);
    }
}
