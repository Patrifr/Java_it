package SPRINT1.TASCA_1.N1.Exercici1_Grup_Musica;

public class Percusio extends Instrument{

   public Percusio(String nom, int preu) {
        super(nom, preu);

    }
    @Override
    String tocar() {
        return "Està sonant un instrument de percusió.";
    }
}

