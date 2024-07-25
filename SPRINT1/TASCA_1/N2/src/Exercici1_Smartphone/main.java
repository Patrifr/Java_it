package SPRINT1.TASCA_1.N2.Exercici1_Smartphone;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int telefon = 0;
		Scanner entry = new Scanner(System.in);
		Smartphone smartphone1 = new Smartphone("Samsung", "Samsung Galaxy Z Flip 5");
		
		System.out.println("Escrigui el número de telèfon al que desitja trucar: ");
		telefon = entry.nextInt();
		
		entry.close();
		
		System.out.println(smartphone1.trucar(telefon));
		
		smartphone1.fotografiar();
		smartphone1.alarma();

	}

}
