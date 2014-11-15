package com.tema5se.factory;

/**
 * Created by Andreea on 15.11.2014.
 */
public class FactoryProducer {
        public static AbstractFactory getFactory(String choice){
            if(choice.equalsIgnoreCase("vehicle")){
                return new VehicleFactory();
            } else if(choice.equalsIgnoreCase("driver")){
                return new DriverFactory();
            }
            return null;
        }
}
