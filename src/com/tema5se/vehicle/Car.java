package com.tema5se.vehicle;

import com.tema5se.interfaces.IVehicle;

/**
 * Created by Andreea on 15.11.2014.
 *
 * This is the class for cars.
 */
public class Car implements IVehicle {
    @Override
    public void vehicleType() {
        System.out.println("This vehicle is a car!");
    }

    @Override
    public void numberOfDoors(int doors) {
        System.out.format("This car has %d doors!\n",doors);
    }
}
