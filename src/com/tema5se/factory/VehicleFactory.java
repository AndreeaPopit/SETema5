package com.tema5se.factory;

import com.tema5se.interfaces.IDriver;
import com.tema5se.interfaces.IVehicle;
import com.tema5se.vehicle.Car;
import com.tema5se.vehicle.Truck;

/**
 * Created by Andreea on 15.11.2014.
 */
public class VehicleFactory extends AbstractFactory{
    @Override
    public IVehicle getVehicleType(String vehicleType){
        if(vehicleType == null){
            return null;
        }
        if(vehicleType.equals("car")){
            return new Car();
        } else if(vehicleType.equals("truck")){
            return new Truck();
        }
        return null;
    }

    @Override
    public IDriver getDriverType(String driverType){
        return null;
    }
}
