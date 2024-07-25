package SPRINT1.TASCA_6.N1.Ex1_NoGenericMethod;

public class Main {
    public static void main(String[] args) {
        String fruit1 = "Strawberry";
        String fruit2 = "Banana";
        String fruit3 = "Apple";

        NoGenericMethods<String> box1 = new NoGenericMethods<>(fruit1,fruit2,fruit3);
        NoGenericMethods<String> box2 = new NoGenericMethods<>(fruit2,fruit3,fruit1);
        NoGenericMethods<String> box3 = new NoGenericMethods<>(fruit3,fruit1,fruit2);
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
    }
}
