package EX1_AbstractFactory;

import EX1_AbstractFactory.Factories.AbstractFactory;
import EX1_AbstractFactory.Factories.IrelandContactFactory;
import EX1_AbstractFactory.Factories.KoreanContactFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBookApp {
    private static Scanner entry = new Scanner(System.in);
    private static ArrayList <Contact> contactsAgenda = new ArrayList<>();

    public static void menu(){
        int opt = 0;
        do{
            System.out.println("Agenda of contact's options:\n" +
                    "1. Add a new Contact.\n" +
                    "2. See all Contacts.\n" +
                    "0. Exit.");
            opt = entry.nextInt();
            entry.nextLine();

            switch (opt){
                case 1:
                    addContact();
                    break;
                case 2:
                    seeAgenda();
                    break;
                case 0:
                    System.out.println("Exiting the app....");
                    break;
                default:
                    System.out.println("Please select a valid option.");
                    break;
            }
        }while(opt != 0);
    }

    public static void seeAgenda(){
        try{
            if(contactsAgenda.isEmpty()){
                throw new AgendaIsEmptyException("Error.The Agenda is empty. Please, add a contact first.\n");
            }else{
                for(Contact contact : contactsAgenda){
                    System.out.println(contact.toString());
                }
            }
        } catch (AgendaIsEmptyException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addContact(){
        String name, address, phone = "";
        int opt = 0;
        AbstractFactory factory = null;

        System.out.println("Contact's name: ");
        name = entry.nextLine();

        System.out.println("""
                Select the Contact's country:\s
                1. South Korea.
                2. Ireland.""");

        opt = entry.nextInt();
        entry.nextLine();

        switch (opt) {
            case 1:
                System.out.println("Contact's Address: ");
                address = entry.nextLine();
                System.out.println("Contact's phone: ");
                phone = entry.nextLine();

                factory = new KoreanContactFactory();
                contactsAgenda.add(new Contact(name, factory.getAddress(address), factory.getPhone(phone)));
            break;

            case 2:
                System.out.println("Contact's Address: ");
                address = entry.nextLine();
                System.out.println("Contact's phone: ");
                phone = entry.nextLine();

                factory = new IrelandContactFactory();
                contactsAgenda.add(new Contact(name, factory.getAddress(address), factory.getPhone(phone)));
            break;

            default:
                System.out.println("No valid option. Try again");
                break;
        }
    }
}
