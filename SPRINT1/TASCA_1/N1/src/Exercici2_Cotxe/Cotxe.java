package SPRINT1.TASCA_1.N1.Exercici2_Cotxe;

public class Cotxe {
	private static final String marca = "BMW";
	private static String model;
	private final int potencia;
	
	public Cotxe(String marca, String model, int potencia){
		Cotxe.model = model; //model es pot inicialitzar accedint de forma estatica. 
		this.potencia = potencia; // potencia es pot inicialitzar, en canvi marca no es pot al constructor.
	}
	public String getMarca() {
		return Cotxe.marca;
	}
	public String getModel() {
		return Cotxe.model;
	}
	public int getPotencia() {
		return this.potencia;
	}

	public void setModel(String model) {
		Cotxe.model = model;
	}

	public String accelerar() {
		return "El cotxe està accelerant.";
	}

	public static String frenar() {
		return "El cotxe està frenant.";
	}
}
