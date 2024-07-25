package SPRINT1.TASCA_6.N3.Ex1_Smartphone;

public class Smartphone implements Telephone{

    @Override
    public void calling() {
        System.out.println("Calling...");
    }
    public void takePhoto(){
        System.out.println("Taking photo...");
    }
}
