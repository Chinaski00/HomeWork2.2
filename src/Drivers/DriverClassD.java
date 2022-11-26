package Drivers;


import Auto.Bus;

public class DriverClassD <D extends Bus> extends Driver {


    public DriverClassD(String brand, String model, double engineCapacity, String name, boolean rights, String experience) {
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
