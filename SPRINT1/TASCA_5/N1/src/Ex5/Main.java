package Ex5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();
    }
    
    public static void menu(){
        Scanner entry = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("\nWelcome. Choose an option:\n" +
                    "1. List the elements inside a directory.\n" +
                    "2. Save the directory's elements in a file.\n" +
                    "3. Read and print the content inside a file.\n" +
                    "4. Serialize an Object.\n" +
                    "5. Deserialize an Object.\n" +
                    "0. Exit.");
            option = entry.nextInt();
            entry.nextLine();

            switch (option){
                case 1:
                    findDirectory();
                    break;
                case 2:
                    saveDirectoryData();
                    break;
                case 3:
                    printFile();
                    break;
                case 4:
                    serializeObj();
                    break;
                case 5:
                    deserializeObj();
                    break;
                case 0:
                    System.out.println("Thank you. Goodbye.");
                    break;
            }
        }while(option != 0);
        entry.close();
    }

    public static void findDirectory(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Write the directory's absolute route:");
        File directory = new File(entry.nextLine());
        if(directory.isDirectory() && directory.exists() && directory.canRead()){
            System.out.println("Valid route. Listing your directory's files....\n");
            listDirectoryTree(directory);
        }else{
            System.out.println("No valid route.");
        }
    }

    public static void saveDirectoryData(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Write the directory's absolute route:");
        String path = entry.nextLine();
        File directory = new File(path);
        if(directory.isDirectory() && directory.exists() && directory.canRead()){
            System.out.println("Valid route. Listing your directory's files....\n");
            listDirectoryTreeOnAFile(directory);
            System.out.println("The file has been successfully written.");
        }else{
            System.out.println("No valid route.");
        }
    }

    public static void printFile(){
        Scanner entry = new Scanner(System.in);
        System.out.println("Write the directory's absolute route:");
        String path = entry.nextLine();
        File directory = new File(path);
        if (directory.isFile() && directory.exists() && directory.canRead()) {
            System.out.println("Valid path. Reading an printing it's content....\n");
            readFile(path);
        }else{
            System.out.println("No valid route.");
        }
    }

    public static void listDirectoryTree(File directory){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File [] directoryTree = directory.listFiles();
        Arrays.sort(directoryTree);
        for(File file : directoryTree){
            if(file.exists() && file.isDirectory() && file.canRead()){
                System.out.println("D " + file.getName() + "Last modified: " +
                        date.format(file.lastModified()));
                listDirectoryTree(file);
            } else{
                System.out.println("F " + file.getName() + "Last modified: " +
                        date.format(file.lastModified()));
            }
        }
    }

    public static void listDirectoryTreeOnAFile(File directory){
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File [] directoryTree = directory.listFiles();
        Arrays.sort(directoryTree);
        for(File file : directoryTree){
            if(file.isDirectory() && file.exists() && file.canRead()){
                saveData("D " +  file.getName() + "Last modified: " +
                        date.format(file.lastModified()));
                listDirectoryTreeOnAFile(file);
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

    public static void serializeObj(){
        Person [] persons = new Person [3];
        persons[0] = new Person("Joan","Leria",27);
        persons[1] = new Person("Oliver", "Andres",27);
        persons[2] = new Person("Laura","Vazquez",25);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serialized.txt"));
            oos.writeObject(persons);
            oos.close();
            System.out.println("The object has been successfully serialized.");
        }catch (Exception e){
            System.out.println("Error. " + e.getMessage());
        }
    }

    public static void deserializeObj(){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Serialized.txt"));
            Person [] personsDeserialized = (Person[]) ois.readObject();
            ois.close();
            System.out.println("The object has been successfully deserialized.\n" +
                    "*********** Printing object's content ***********\n");
            Arrays.stream(personsDeserialized).toList().forEach(System.out::println);
        }catch (Exception e){
            System.out.println("Error. " + e.getMessage());
        }
    }
}
