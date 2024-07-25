package Exercici1_Grup_Musica;

abstract class Instrument {
        private String nom;
        private int preu;

        public Instrument(String nom, int preu){
            this.nom = nom;
            this.preu = preu;
        }
        {
            System.out.println("Bloc d'inicialització: Carregant...");
        }
        static{
            System.out.println("Bloc estátic: Està carregant l'instrument.");
        }

        public String getNom(){
            return this.nom;
        }

        public int getPreu() {
            return this.preu;
        }


        public void setNom(String nom) {
            this.nom = nom;
        }
        public void setPreu(int preu) {
            this.preu = preu;
        }


        abstract String tocar();

    }

