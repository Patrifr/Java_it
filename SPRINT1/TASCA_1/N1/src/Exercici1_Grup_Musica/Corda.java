package SPRINT1.TASCA_1.N1.Exercici1_Grup_Musica;

public class Corda extends Instrument {

        public Corda(String nom, int preu) {
            super(nom, preu);
        }

        @Override
        String tocar() {
            return "Està tocant un instrument de corda.";
        }
 }

