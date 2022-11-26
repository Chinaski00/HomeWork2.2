package Drivers;

import Auto.Car;

public abstract class Driver extends Car {

    private String name;
    private boolean rights;
    private String experience;

    public Driver(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
        super(brand, model, engineCapacity);
        this.name = name;
        if (this.name != null || !this.name.isEmpty() || !this.name.isBlank()){
            this.name = name;
        } else {
            this.name = "Неизвестно";
        }
        this.rights = rights;
        this.experience = experience;
        if (this.experience != null || !this.experience.isEmpty() || !this.experience.isBlank()){
            this.experience = experience;
        } else {
            this.experience = "Неизвестно";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        experience = experience;
    }

    public abstract void startMove();
    public abstract void endMove();
    public abstract void fillCar();

    public String toString(){
        return "Водитель " + getName() + " управляет автомобилем " + getBrand()  + " и будет участвовать в заезде";
    }

}
