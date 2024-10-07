package EX1_Command.Commands;

import EX1_Command.Vehicles.Vehicle;

public class Start implements IOperation{
    private Vehicle vehicle;

    public Start(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.start();
    }
}
