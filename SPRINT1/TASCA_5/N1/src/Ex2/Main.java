package Ex2;

import java.io.File;
import java.text.SimpleDateFormat;
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
            System.out.println("Valid route. Listing your directory's files....\n");
            listDirectoryTree(directory);
        }else{
            System.out.println("No valid route.");
        }
        entry.close();
    }

    public static void listDirectoryTree(File directory){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File [] directoryTree = directory.listFiles();
        if(directoryTree == null){
            System.out.println("The directory is empty");
        }else{
            Arrays.sort(directoryTree);
            for(File file : directoryTree){
                    if(file.exists() && file.isDirectory()){
                        System.out.println("D " + file.getName() + "Last modified: " +
                                date.format(file.lastModified()));
                        listDirectoryTree(file);
                    } else{
                        System.out.println("F " + file.getName() + "Last modified: " +
                                date.format(file.lastModified()));
                    }
            }
        }

    }
}
