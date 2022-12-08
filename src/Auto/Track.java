package Auto;

import java.util.List;

public class Track extends Car implements Competing {
    private String type;

    public Track(String brand, String model, double engineCapacity,String type) {
        super(brand, model, engineCapacity);
        this.type = type;
    }
    public enum bodyTypeTrack {N1(3.5f,null), N2(12f,3.5f), N3(null, 12f);
        private Float highBorder;
        private Float lowBorder;

        bodyTypeTrack(Float highBorder, Float lowBorder) {
            this.highBorder = highBorder;
            this.lowBorder = lowBorder;
        }

        public Float getHighBorder() {
            return highBorder;
        }

        public Float getLowBorder() {
            return lowBorder;
        }

        @Override
        public String toString() {
            return (lowBorder == null) ? "Грузоподъемность до " + highBorder + " тонн"
                    : " Грузоподъемность от " + lowBorder + " тонн " + ((highBorder == null) ? ""
                    : "до " + highBorder + " тонн.");
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
        return "Лучшее время: 5 минут 34 секунды";
    }

    @Override
    public int maxSpeed() {
        return 120;
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
