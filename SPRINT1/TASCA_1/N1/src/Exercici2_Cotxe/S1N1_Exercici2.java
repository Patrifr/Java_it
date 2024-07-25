package SPRINT1.TASCA_1.N1.Exercici2_Cotxe;

public class S1N1_Exercici2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cotxe cotxe1 = new Cotxe(null, "Serie 3 Berlina", 340);
		
		System.out.println(cotxe1.getMarca());
		System.out.println(cotxe1.getModel());
		System.out.println(cotxe1.getPotencia() + " CV.");
		System.out.println(cotxe1.accelerar());
		System.out.println(Cotxe.frenar());

	}

}
