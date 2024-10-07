package EX1_Command.Vehicles;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike .....");
    }

    @Override
    public void accelerate() {
        System.out.println("The bike is accelerating .....");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike .....");
    }
}
