package Drivers;
import Auto.Track;

public class DriverClassC <C extends Track> extends Driver  {

    public DriverClassC(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
        super(brand, model, engineCapacity, name, rights, experience);
    }


    @Override
    public void startMove() {
        System.out.println("Разгон водителя");
    }

    @Override
    public void endMove() {
        System.out.println("Остановка водителя");
    }

    @Override
    public void fillCar() {
        System.out.println("Заправить машину");
    }
}
