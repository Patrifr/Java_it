package SPRINT1.TASCA_3.N1.Exercici3_Countries;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {

        countryGame();
    }
    public static void countryGame (){
        String name = "";
        String answer = "";
        String correctAnswer = "";
        String randomCountry = "";
        int points = 0;

        Scanner entry = new Scanner(System.in);
        Map<String, String> mapFromFile = createMapFromFile();
        Object [] keyMap = createMapFromFile().keySet().toArray();

        System.out.println("Insert your name: ");
        name = entry.nextLine();

        for(int i = 0; i < 10; i++){
            int randomI = ((int) (Math.random() * keyMap.length));
            randomCountry = (String) keyMap[randomI];
            correctAnswer = mapFromFile.get(randomCountry);

            System.out.println(name + ", which is the capital of " + randomCountry);
            answer = entry.nextLine();

          if (answer.equalsIgnoreCase(correctAnswer)) {
              points++;
              System.out.println("Correct, that's the right answer! You have 1 point.");
          }else{
              System.out.println("Incorrect, the right answer is: " + correctAnswer);
          }
        }
        System.out.println(name + ", you have a total of " + points + " points.");
        saveUserData(name,points);
        entry.close();
    }

    public static Map<String,String> createMapFromFile() {
        Map<String, String> fileMap = new HashMap<>();

        BufferedReader reader = null;
        try {
            FileReader countries = new FileReader("src/main/java/SPRINT1/TASCA_3/N1/Exercici3_Countries/countries.txt");
            reader = new BufferedReader(countries);
            String data;

            while (!(data = reader.readLine()).isEmpty()) {
                String[] parts = data.split(" ");

                String key = parts[0].replace("_", " ");
                String value = parts[1].replace("_", " ");
                fileMap.put(key, value);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fileMap;
    }
    public static void saveUserData(String name, int points){
        try (FileWriter writer = new FileWriter("src/main/java/SPRINT1/TASCA_3/N1/Exercici3_Countries/UserData.txt",true)){
            String data = "User name: " + name + " - Total points: " + points + ".";
            writer.write(data);
            System.out.println("The file has been successfully written.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
