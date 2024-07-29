package Ex1_NoGenericMethod;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Gemma",21);
        Person person2 = new Person("Xavi",22);
        Person person3 = new Person("Sebastià",33);

        NoGenericMethods<String> box1 = new NoGenericMethods<>(person1,person2,person3);
        NoGenericMethods<String> box2 = new NoGenericMethods<>(person2,person3,person1);
        System.out.println(box1 + "\n" + box2);
    }
}
