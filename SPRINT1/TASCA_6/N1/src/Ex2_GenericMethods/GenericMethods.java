package SPRINT1.TASCA_6.N1.Ex2_GenericMethods;


public class GenericMethods {

    public static <T> void printArguments(T t1, T t2, T t3){
        System.out.println( "This box contains: " + t1 + ", " + t2 + " and " +
                            t3 + ".");
    }
}
