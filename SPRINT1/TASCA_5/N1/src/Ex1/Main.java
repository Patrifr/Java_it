package Ex1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        findDirectory();

    }
    public static void findDirectory(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Write the directory's absolute route:");
        File directory = new File(entry.nextLine());
        if(directory.exists() && directory.isDirectory()){
            System.out.println("Valid route. Listing your directory's files....");
            listDirectory(directory);
            }else{
            System.out.println("No valid route.");
            }
        entry.close();
    }
    public static void listDirectory(File directory){
        File[] files = directory.listFiles();
        if(files == null){
            System.out.println("The directory is empty");
        }else{
            Arrays.sort(files);
            Arrays.stream(files).toList().forEach(System.out::println);
        }
    }
}
