package Auto;

public class Track extends Car implements Competing {

    public Track(String brand, String model, double engineCapacity) {
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
        return "Лучшее время: 5 минут 34 секунды";
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
