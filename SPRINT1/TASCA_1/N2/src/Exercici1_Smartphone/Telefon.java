package Exercici1_Smartphone;

public class Telefon {
	String marca;
	String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	public String getMarca() {
		return this.marca;
	}
	public String getModel() {
		return this.model;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String trucar (int telefon) {
		return "S'està trucant al número " + telefon + ".";
	}
	

}
