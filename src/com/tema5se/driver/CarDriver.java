package com.tema5se.driver;

import com.tema5se.interfaces.IDriver;

import java.awt.*;

/**
 * Created by Andreea on 15.11.2014.
 *
 * This class is for drivers that are driving cars.
 */
public class CarDriver implements IDriver {
    @Override
    public void driverType() {
        System.out.println("This is a car driver");
    }

    @Override
    public void drivingExperience(int years) {
        if (years > 5){
            System.out.println("This car driver is an experienced one!");
        }
        else{
            System.out.println("This car driver is not very experienced!");
        }
    }
}
