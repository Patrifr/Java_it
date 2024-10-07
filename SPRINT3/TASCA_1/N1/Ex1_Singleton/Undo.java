package Ex1_Singleton;

import java.util.ArrayList;
import java.util.LinkedList;

public class Undo {

    private static Undo instance;
    private LinkedList<String> history;

    private Undo() {
        this.history = new LinkedList<>();
    }
    public static Undo getInstance(){
        if(instance == null){
            instance = new Undo();
        }
        return instance;
    }

    public void getHistory(){
        for(String command : history){
            System.out.println(command);
        }
    }

   public void saveCommands(String command){
     history.add(command);
     System.out.println("Command successfully saved.");

    }

    public void undoLastCommand(){
        String answer = "";
        if(!history.isEmpty()){
            history.removeLast();
            System.out.println("Command removed successfully");
        } else {
            System.out.println("The history is empty, there's no command to undo");
        }
    }
     /* public void saveCommands(String command){
        if(history.size() > 3){
            history.removeFirst();
            if(history.size() < 3){
                history.addLast(command);
            }
        }else{
            history.addLast(command);
        }
    }*/
}
