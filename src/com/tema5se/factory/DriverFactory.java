package com.tema5se.factory;

import com.tema5se.driver.CarDriver;
import com.tema5se.driver.TruckDriver;
import com.tema5se.interfaces.IDriver;
import com.tema5se.interfaces.IVehicle;
import com.tema5se.vehicle.Car;
import com.tema5se.vehicle.Truck;

/**
 * Created by Andreea on 15.11.2014.
 */
public class DriverFactory extends AbstractFactory{
    @Override
    public IVehicle getVehicleType(String vehicleType){
        return null;
    }

    @Override
    public IDriver getDriverType(String driverType){
        if(driverType == null){
            return null;
        }
        if(driverType.equals("carDriver")){
            return new CarDriver();
        } else if(driverType.equalsIgnoreCase("truckDriver")){
            return new TruckDriver();
        }
        return null;
    }
}
