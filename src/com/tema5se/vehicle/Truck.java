package com.tema5se.vehicle;

import com.tema5se.interfaces.IVehicle;

/**
 * Created by Andreea on 15.11.2014.
 *
 * This is a class for trucks as vehicle type.
 */
public class Truck implements IVehicle{
    @Override
    public void vehicleType() {
        System.out.println("This is a truck!");
    }

    @Override
    public void numberOfDoors(int doors) {
        System.out.format("This truck has %d doors!\n",doors);
    }
}
