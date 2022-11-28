package Drivers;
import Auto.Track;

public class DriverClassC <C extends Track> extends Driver  {

    public DriverClassC(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
        super(brand, model, engineCapacity, name, rights, experience);
    }
}
