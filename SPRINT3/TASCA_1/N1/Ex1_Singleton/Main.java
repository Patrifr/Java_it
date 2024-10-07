package Ex1_Singleton;
import java.util.Scanner;

public class Main {
    static Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {
    menu();

    }
    public static void menu(){
        int opt = 0;
        String ans = "";
        do{
            Undo undo = Undo.getInstance();
            System.out.println("Choose and option:\n" +
                   "1. Add command.\n" +
                   "2. Undo command.\n" +
                   "3. Show history.\n" +
                   "0. Exit.");
           opt = entry.nextInt();
           entry.nextLine();

           switch(opt){
               case 1:
                   System.out.println("Write the command:");
                   ans = entry.nextLine();
                   undo.saveCommands(ans);
                   break;
               case 2:
                 undo.undoLastCommand();
                 break;
               case 3:
                   System.out.println("Showing the latest commands....");
                   undo.getHistory();
                   break;
               case 0:
                   System.out.println("Exiting the program....");
                   break;
           }
        }while(opt != 0);
    }
}