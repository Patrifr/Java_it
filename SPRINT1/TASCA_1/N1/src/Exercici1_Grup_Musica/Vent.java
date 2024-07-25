package Exercici1_Grup_Musica;

public class Vent extends Instrument{

        public Vent(String nom, int preu) {
            super(nom, preu);
        }

        @Override
        String tocar() {
            return "Està sonant un instrument de vent.";
        }

}
