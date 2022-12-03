package Auto;

public class PassengerCars extends Car implements Competing{
    private String type;

    public PassengerCars(String brand, String model, double engineCapacity, String type) {
        super(brand, model, engineCapacity);
        this.type = type;
    }

    public enum bodyTypePassengerCars {SEDAN("седан"), Hatchback("хечбэк"),
        COUPE("купе"), UNIVERSAL("универсал"), OFFROAD("внедорожник"),
        CROSSOVER("кроссовер"), PICKUP("пикап"), VAB("фургон"), Minivan("минивэн");
        private String translation;

        bodyTypePassengerCars(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }
        @Override
        public String toString() {
            return "Тип кузова: " + translation;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    public boolean passDiagnostics(){
        System.out.println("Проверка пройдена");
        return true;
    }


    @Override
    public String printType() {
        if (type != null){
            System.out.println(type);
        } else {
            System.out.printf("Тип неизвестен ");
        }
        return null;
    }
}
