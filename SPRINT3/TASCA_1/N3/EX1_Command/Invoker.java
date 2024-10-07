package EX1_Command;

import EX1_Command.Commands.IOperation;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<IOperation> operationsList = new ArrayList<IOperation>();

    public void addOperation(IOperation operation){
        this.operationsList.add(operation);
    }
    public void executeOperations(){
        this.operationsList.forEach(IOperation::execute);
    }
}
