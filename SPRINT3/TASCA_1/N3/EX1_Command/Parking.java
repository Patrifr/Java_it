package EX1_Command;

import EX1_Command.Commands.Accelerate;
import EX1_Command.Commands.Start;
import EX1_Command.Commands.Stop;
import EX1_Command.Vehicles.Airplane;
import EX1_Command.Vehicles.Bike;
import EX1_Command.Vehicles.Car;
import EX1_Command.Vehicles.Ship;

public class Parking {
    public static void app(){

        Start planeStart  = new Start (new Airplane());
        Accelerate planeAccel = new Accelerate(new Airplane());
        Stop planeStop = new Stop(new Airplane());

        Start carStart  = new Start (new Car());
        Accelerate carAccel = new Accelerate(new Car());
        Stop carStop = new Stop(new Car());

        Start bikeStart  = new Start (new Bike());
        Accelerate bikeAccel = new Accelerate(new Bike());
        Stop bikeStop = new Stop(new Bike());

        Start shipStart  = new Start (new Ship());
        Accelerate shipAccel = new Accelerate(new Ship());
        Stop shipStop = new Stop(new Ship());

        commands(planeStart, planeAccel, planeStop);
        System.out.println("\n");
        commands(carStart, carAccel, carStop);
        System.out.println("\n");
        commands(bikeStart, bikeAccel, bikeStop);
        System.out.println("\n");
        commands(shipStart, shipAccel, shipStop);

    }
    public static void commands(Start s1, Accelerate a1, Stop st1){
        Invoker invoker = new Invoker();

        invoker.addOperation(s1);
        invoker.addOperation(a1);
        invoker.addOperation(st1);

        invoker.executeOperations();

    }
}
