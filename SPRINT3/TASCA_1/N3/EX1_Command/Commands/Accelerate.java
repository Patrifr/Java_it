package EX1_Command.Commands;

import EX1_Command.Vehicles.Vehicle;

public class Accelerate implements IOperation{
    private Vehicle vehicle;

    public Accelerate(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
