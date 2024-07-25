package SPRINT1.TASCA_7.N2.Ex1_Json;
import java.io.Serializable;

@Serializer(directory = "C:/Users/patri/Desktop/Java_itAcademy/src/main/java/SPRINT1/TASCA_7/N2/Ex1_Json")

public class Person implements Serializable{
    private String name;
    private String work;
    private int age;

    public Person(String name, String work, int age){
        this.name = name;
        this.work = work;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getWork() {
        return work;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWork(String work) {
        this.work = work;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "User's name: " + this.getName() + "\nActual work position: " + this.getWork() + "\nAge: " +
                this.getAge();
    }
}
