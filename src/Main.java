import com.tema5se.factory.AbstractFactory;
import com.tema5se.factory.FactoryProducer;
import com.tema5se.interfaces.IDriver;
import com.tema5se.interfaces.IVehicle;

/**
 * Created by Andreea on 15.11.2014.
 */
public class Main {
    public static void main(String[] args){

        //get vehicle factory
        AbstractFactory vehicleFactory = FactoryProducer.getFactory("vehicle");

        //get an object of Vehicle
        IVehicle vehicle1 = vehicleFactory.getVehicleType("car");

        //call vehicle number of doors
        vehicle1.numberOfDoors(4);

        //get an object of Vehicle
        IVehicle vehicle2 = vehicleFactory.getVehicleType("truck");

        //call vehicle number of doors
        vehicle2.numberOfDoors(2);

        //get driver factory
        AbstractFactory driverFactory = FactoryProducer.getFactory("driver");

        //get an object of type Car Driver
        IDriver driver1 = driverFactory.getDriverType("carDriver");

        //verify how experienced is the driver
        driver1.drivingExperience(3);

        //get an object of type Car Driver
        IDriver driver2 = driverFactory.getDriverType("truckDriver");

        //verify how experienced is the driver
        driver2.drivingExperience(12);
    }
}
