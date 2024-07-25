package SPRINT1.TASCA_2.N1.Exercici1_Venda;

import java.util.ArrayList;

public class Venda {
    private float preuTotal;
    private ArrayList<Producte> llistaProductes;

    public Venda(float preuTotal){
        this.preuTotal = preuTotal;
        this.llistaProductes = new ArrayList<Producte>();
    }

    public float getPreuTotal(){
        return this.preuTotal;
    }
    public ArrayList<Producte> getLlistaProductes() {
        return this.llistaProductes;
    }

    public void setPreuTotal(float preuTotal) {
        this.preuTotal = preuTotal;
    }
    public void setLlistaProductes(Producte producte) {
        this.llistaProductes.add(producte);
    }

    public void calcularTotal() throws VendaBuidaException {
        try{
            if(this.getLlistaProductes().isEmpty()){
                throw new VendaBuidaException("Per fer una venda primer has d’afegir productes.");
            } else {
                for(Producte producte : this.getLlistaProductes()){
                   this.preuTotal += producte.getPreu();
                }
                System.out.println("El preu total dels productes és de: " + this.preuTotal + "€");
            }
        } catch (VendaBuidaException e){
            System.out.println(e.getMessage());
        }
    }

    public void mostrarLlista(){
       System.out.println("La llista de productes a la cistella es: ");
       for(Producte producte : this.getLlistaProductes()){
            System.out.println(producte.getNom() + ": " + producte.getPreu() + "€");
        }
    }
}
