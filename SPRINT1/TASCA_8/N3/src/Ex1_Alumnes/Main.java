package SPRINT1.TASCA_8.N3.Ex1_Alumnes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        List<Student> studentsWithA;

        students.add(new Student("Joan", 27,"Big Data",6.5));
        students.add(new Student("Ainoa",26,"JAVA",8.7));
        students.add(new Student("Albert",24,"PHP",5.5));
        students.add(new Student("Sergio", 22,"PHP",7));
        students.add(new Student("Isidro",55,"PHP", 9.2));
        students.add(new Student("Marta",31,"JAVA",8.2));
        students.add(new Student("José",17,"Big Data",4.3));
        students.add(new Student("Vanesa",33,"PHP",2.3));
        students.add(new Student("Yago", 16,"JAVA",4.9));
        students.add(new Student("Maite",20,"JAVA",5.2));

        System.out.println("Print the list with the student's name and age:");
        students.stream().sorted(Comparator.comparing(s -> s.getName().charAt(0))).toList()
                .forEach(s -> System.out.println("-Name: " + s.getName() + ", age: " + s.getAge() + "."));

        System.out.println("\nPrint the list with the students who's name starts with \"A\":");
        studentsWithA = students.stream().filter(s-> s.getName().startsWith("A")).toList();
        studentsWithA.forEach(System.out::println);

        System.out.println("\nPrint the list with the students who's grade is \"5\" or more:");
        students.stream().sorted(Comparator.comparing(s -> s.getName().charAt(0)))
                        .filter(s -> s.getGrade() >= 5).toList().forEach(System.out::println);

        System.out.println("\nPrint the list with the students who's grade is \"5\" or more," +
                " and don't course php:");
        students.stream().sorted(Comparator.comparing(s -> s.getName().charAt(0)))
                .filter(s -> s.getGrade() >= 5 && !s.getCourse().equals("PHP")).toList()
                .forEach(System.out::println);

        System.out.println("\nPrint the list with the students that are adults and course JAVA");
        students.stream().sorted(Comparator.comparing(s -> s.getName().charAt(0)))
                .filter(s-> s.getAge() >= 18 && s.getCourse().equals("JAVA")).toList()
                .forEach(System.out::println);

    }
}
