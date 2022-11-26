package Auto;

public class PassengerCars extends Car implements Competing{
    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }


    public void startMoving() {
        System.out.println("Начать движение");
    }

    public void endMoving() {
        System.out.println("Закончить движение");
    }

    @Override
    public String pitStop() {
        return "Встать на Пит-Стоп";
    }

    @Override
    public String betterTime() {
        return "Лучшее время: 2 минуты 20 секунд";
    }

    @Override
    public int maxSpeed() {
        return 160;
    }
}
