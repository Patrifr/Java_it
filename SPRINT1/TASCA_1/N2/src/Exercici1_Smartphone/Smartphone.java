package SPRINT1.TASCA_1.N2.Exercici1_Smartphone;

public class Smartphone extends Telefon implements Camera,Rellotge{

	public Smartphone(String marca, String model) {
		super(marca, model);
	}

	@Override
	public void alarma() {
		System.out.println("Està sonant l'alarma.");
	}
	
	@Override
	public void fotografiar() {
		System.out.println("S'està fent una foto.");
	}

}
