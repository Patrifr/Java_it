package EX1_Command.Vehicles;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the car .....");
    }

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating .....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car .....");
    }
}
