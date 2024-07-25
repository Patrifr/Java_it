package SPRINT1.TASCA_7.N2.Ex1_Json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
       Person person = new Person("Vanessa","Waitress",33);
       jsonSerializer(person);
    }
    public static void jsonSerializer(Object object){
        try{
            if(object.getClass().isAnnotationPresent(Serializer.class)){
                Serializer annotation = object.getClass().getAnnotation(Serializer.class);
                String fileName = annotation.fileName();
                String directory = annotation.directory();

                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                String user = gson.toJson(object);

                File file = new File(directory,fileName);
                FileWriter writer = new FileWriter(file,true);
                writer.write(user);
                writer.close();
                System.out.println("The object has been successfully serialized.");
            }else{
                System.out.println("Object's class has no annotation.");
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
