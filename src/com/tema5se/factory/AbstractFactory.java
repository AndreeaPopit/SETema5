package com.tema5se.factory;

import com.tema5se.interfaces.IDriver;
import com.tema5se.interfaces.IVehicle;

/**
 * Created by Andreea on 15.11.2014.
 */
public abstract class AbstractFactory {
    public abstract IVehicle getVehicleType(String vehicleType);
    public abstract IDriver getDriverType(String driverType);
}
