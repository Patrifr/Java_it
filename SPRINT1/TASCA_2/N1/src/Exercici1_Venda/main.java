package SPRINT1.TASCA_2.N1.Exercici1_Venda;

public class main {
    public static void main(String[] args) throws VendaBuidaException {
    Producte producte1 = new Producte("Smartphone", 860);
    Producte producte2 = new Producte("Televisor", 2889);
    Producte producte3 = new Producte("Portátil",1234);

    int[] ArrayTest = {1, 2};

    Venda venda1 = new Venda(0);
    Venda venda2 = new Venda (0);

    venda1.setLlistaProductes(producte1);
    venda1.setLlistaProductes(producte2);
    venda1.setLlistaProductes(producte3);

    venda1.mostrarLlista();
    venda1.calcularTotal();

    venda2.calcularTotal();

    try{
         System.out.println(ArrayTest[5]);
    } catch (ArrayIndexOutOfBoundsException e){
        System.out.println(e.getMessage());
    }

    }

}
