package com.tema5se.driver;

import com.tema5se.interfaces.IDriver;

/**
 * Created by Andreea on 15.11.2014.
 *
 * This class is for drivers that are driving trucks.
 */
public class TruckDriver implements IDriver {
    @Override
    public void driverType() {
        System.out.println("This is a truck driver");
    }

    @Override
    public void drivingExperience(int years) {
        if (years > 10){
            System.out.println("This truck driver is an experienced one!");
        }
        else{
            System.out.println("This truck driver is not very experienced!");
        }
    }
}
