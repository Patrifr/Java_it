package SPRINT1.TASCA_6.N3.Ex1_Smartphone;

public class Generic {

    public static<T extends Telephone> void telMethod(T t){
        t.calling();
    }
    public static <T extends Smartphone> void smartphoneMethod(T t){
        t.calling();
        t.takePhoto();
    }
}
