package Drivers;


import Auto.Bus;

public class DriverClassD <D extends Bus> extends Driver {


    public DriverClassD(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
        super(brand, model, engineCapacity, name, rights, experience);
    }
}
