package EX1_Command.Vehicles;

public class Airplane implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the plane .....");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating .....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the plane .....");
    }
}
