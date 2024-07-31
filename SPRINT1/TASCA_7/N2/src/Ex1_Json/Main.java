package Ex1_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

       Person person = new Person("Vanessa","Waitress",33);

       jsonSerializer(person);
    }

    public static void jsonSerializer(Object object){
        if(object.getClass().isAnnotationPresent(Serializer.class)){
            Serializer annotation = object.getClass().getAnnotation(Serializer.class);
            String fileName = annotation.fileName();
            String directory = annotation.directory();

            File file = new File(directory,fileName);

            try(FileWriter writer = new FileWriter(file,true);){
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String user = gson.toJson(object);

                writer.write(user);
                System.out.println("The object has been successfully serialized.");

            }catch (Exception e) {
                System.out.println("Error. The Object could not be serialized into a json file." + e.getMessage());
            }
        }else{
            System.out.println("Object's class has no annotation.");
        }
    }
}
