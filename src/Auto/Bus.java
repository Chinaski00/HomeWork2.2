package Auto;

public class Bus extends Car implements Competing{
    public Bus(String brand, String model, double engineCapacity) {
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
        return "Лучшее время: 3 минуты 50 секунд";
    }

    @Override
    public int maxSpeed() {
        return 100;
    }
}
