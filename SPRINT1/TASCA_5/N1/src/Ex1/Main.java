package SPRINT1.TASCA_5.N1.Ex1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        findDirectory();

    }
    //Buscar el directorio y ver si la ruta es válida o no.
    public static void findDirectory(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Write the directory's absolute route");
        File directory = new File(entry.nextLine());
        try {
            if(directory.isDirectory()){
                System.out.println("Valid route. Listing your directory's files....");
                listDirectory(directory);
            }
        }catch (Exception e){
            System.out.println("No valid route.");
        }
    }
    //si el directorio no está vacio ordenarlo alfabeticamente y escribirlo en un fichero.
    public static void listDirectory(File directory){
        if(directory == null){
            System.out.println("The directory is empty");
        }else{
            File[] files = directory.listFiles();
            Arrays.sort(files);
            Arrays.stream(files).toList().forEach(System.out::println);
        }
    }
}
