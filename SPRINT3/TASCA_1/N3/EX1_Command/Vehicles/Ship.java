package EX1_Command.Vehicles;

public class Ship implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the Ship .....");
    }

    @Override
    public void accelerate() {
        System.out.println("The ship is accelerating .....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the ship .....");
    }
}
