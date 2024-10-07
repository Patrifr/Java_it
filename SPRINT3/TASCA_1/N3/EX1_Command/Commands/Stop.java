package EX1_Command.Commands;

import EX1_Command.Vehicles.Vehicle;

public class Stop implements IOperation{
    private Vehicle vehicle;

    public Stop(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.stop();
    }
}
