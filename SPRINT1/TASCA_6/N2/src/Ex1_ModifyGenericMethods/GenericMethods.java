package SPRINT1.TASCA_6.N2.Ex1_ModifyGenericMethods;


public class GenericMethods {

    public static <T> void printArguments(T t1, T t2, int i){
        System.out.println( "This box contains: " + t1 + ", " + t2 + " and int " +
                            i + ".");
    }
}
