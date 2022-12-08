package Auto;

import Drivers.Driver;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport {

    private String brand;
    private String model;
    private double engineCapacity;
    private List<Driver> drivers = new ArrayList<>();
    private List<Mechanic> mechanics = new ArrayList<>();
    private List<Sponsor> sponsors = new ArrayList<>();

    public Car(String brand, String model, double engineCapacity) {
        this.brand = brand;
        if (this.brand != null || !this.brand.isEmpty() || !this.brand.isBlank()){
            this.brand = brand;
        } else {
            this.brand = "Неизвестно";
        }
        this.model = model;
        if (this.model != null || !this.model.isEmpty() || !this.model.isBlank()){
            this.model = model;
        } else {
            this.model = "Неизвестно";
        }
        this.engineCapacity = Math.abs(engineCapacity);
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }
    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }
    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public boolean passDiagnostics(){
        return true;
    }

    @Override
    public String printType() {
       return "Машина";
    }
}
