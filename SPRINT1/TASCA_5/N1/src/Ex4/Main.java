package Ex4;

import java.io.*;
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
        String path = entry.nextLine();
        File directory = new File(path);
        try {
            if(directory.exists() && directory.isDirectory() && directory.canRead()){
                System.out.println("Valid route. Listing your directory's files....\n");
                listDirectoryTree(directory);
                System.out.println("The file has been successfully written.");
            } else if (directory.exists() && directory.canRead() && directory.isFile()) {
                System.out.println("Valid path. Reading an printing it's content....\n");
                readFile(path);
            }
        }catch (Exception e){
            System.out.println("No valid route.");
        }finally {
            entry.close();
        }
    }

    public static void listDirectoryTree(File directory){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File [] directoryTree = directory.listFiles();
        Arrays.sort(directoryTree);
        for(File file : directoryTree){
            if(file.exists() && file.isDirectory()){
                saveData("D " +  file.getName() + "Last modified: " +
                        date.format(file.lastModified()));
                listDirectoryTree(file);
            } else{
                saveData("F " + file.getName() + "Last modified: " +
                        date.format(file.lastModified()));
            }
        }
    }
    public static void saveData(String data){
        try(FileWriter writer = new FileWriter("SavedData.txt",true)){
            String writeData = data + "\n";
            writer.write(writeData);
        }catch (IOException e) {
            System.out.println("Error. " + e.getMessage());
        }
    }

    public static void readFile(String path) {
        File file = new File(path);
        if(file.getName().toLowerCase().endsWith(".txt")){
            try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while((line = reader.readLine()) != null){
                    if(!line.isEmpty()){
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error. " + e.getMessage());
            }
        }else{
            System.out.println("The file is not \".txt\"");
        }
    }

}
