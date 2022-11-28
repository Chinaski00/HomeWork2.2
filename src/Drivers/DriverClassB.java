package Drivers;

import Auto.PassengerCars;

public class DriverClassB<B extends PassengerCars> extends Driver{

    public DriverClassB(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
        super(brand, model, engineCapacity, name, rights, experience);
    }
}
