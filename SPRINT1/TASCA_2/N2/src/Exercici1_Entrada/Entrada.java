package SPRINT1.TASCA_2.N2.Exercici1_Entrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner entry = new Scanner(System.in);

    public static byte llegirByte(String missatge){
        byte numIntro = 0;
        boolean check = false;

        while(!check){
            System.out.println(missatge);
            try {
           numIntro = entry.nextByte();
           check = true;
            } catch (InputMismatchException e){
             System.out.println("Error. El valor introduït no és válid, introdueix un byte.");
            }
            entry.nextLine();
        }
        return numIntro;
    }

    public static int llegirInt(String missatge){
        int numIntro = 0;
        boolean check = false;

        while(!check){
            System.out.println(missatge);
            try {
                numIntro = entry.nextInt();
                check = true;
            } catch (InputMismatchException e){
                System.out.println("Error. El valor introduït no és válid, introdueix un Integer.");
            }
            entry.nextLine();
        }
        return numIntro;
    }
    public static float llegirFloat(String missatge){
    float numIntro = 0f;
    boolean check = false;

    while(!check){
        System.out.println(missatge);

        try {
            numIntro = entry.nextFloat();
            check = true;
        } catch (InputMismatchException e){
            System.out.println("Error. El valor introduït no és válid, introdueix un Float.");
            }
        entry.nextLine();
    }
        return numIntro;
    }
    public static double llegirDouble(String missatge){
        double numIntro = 0d;
        boolean check = false;

        while(!check){
            System.out.println(missatge);
            try{
                numIntro = entry.nextDouble();
                check = true;
            }catch (InputMismatchException e){
                System.out.println("Error. El valor introduït no és válid, introdueix un Double.");
            }
            entry.nextLine();
        }
        return numIntro;
    }
    public static char llegirChar(String missatge) throws Exception {

        char charIntro = ' ';
        boolean check = false;

        while(!check){
            try{
                System.out.println(missatge);
                charIntro = entry.next().charAt(0);
                check = true;
            }catch(Exception e){
                System.out.println("Error. Introdueix un char.");
            }
            entry.nextLine();
        }
        return charIntro;
    }
    public static String llegirString(String missatge){
        String stringIntro = "";
        boolean check = false;

        while(!check){
            System.out.println(missatge);
            try{
                stringIntro = entry.nextLine();

                if(stringIntro.isEmpty()){
                    throw new Exception();
                }else{
                    check = true;
                }
            }catch (Exception e){
                System.out.println("Error. Introdueix un String: ");
            }
        }
        return stringIntro;
    }
   public static boolean llegirSiNo(String missatge){
        String letraIntro = "";
        boolean booleanResp = false;
        boolean check = false;

        while(!check){
            System.out.println(missatge);
            try {
                letraIntro = entry.nextLine();
                if (letraIntro.equalsIgnoreCase("s")){
                    booleanResp = true;
                    check = true;
                } else if ( letraIntro.equalsIgnoreCase("n")){
                    booleanResp = false;
                    check = true;
                }else{
                    throw new Exception();
                }
            } catch (Exception e){
                System.out.println("Error. Introdueix un boolean vàlid (S o N): ");
            }
        }
       return booleanResp;
   }
}