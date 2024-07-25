package Exercici1_Grup_Musica;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vent instrument1 = new Vent("flauta",350);
        Percusio instrument2 = new Percusio("Tambor", 190);
        Corda instrument3 = new Corda("Violí", 469);

        System.out.println(instrument1.tocar());
        System.out.println(instrument2.tocar());
        System.out.println(instrument3.tocar());
    }
}
