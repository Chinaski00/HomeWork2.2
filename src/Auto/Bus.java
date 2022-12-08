package Auto;

import java.util.List;

public class Bus extends Car implements Competing{
    private String type;
    public Bus(String brand, String model, double engineCapacity, String type) {
        super(brand, model, engineCapacity);
        this.type = type;
    }
    public enum bodyTypeBus{ESPECIALLY_SMALL(10f,null), SMALL(20f,null),
        AVARAGE(50f,40f), BIG(80f,60f), ESPECIALLY_BIG(120f,100f);
        private Float highBorder;
        private Float lowBorder;

        bodyTypeBus(Float highBorder, Float lowBorder) {
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
            return (lowBorder == null) ? "Вместимость до " + highBorder + " мест"
                    : " Вместимость от " + lowBorder + " мест " + ((highBorder == null) ? ""
                    : "до " + highBorder + " мест.");
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
        return "Лучшее время: 3 минуты 50 секунд";
    }

    @Override
    public int maxSpeed() {
        return 100;
    }
    public boolean passDiagnostics(){
      System.out.println("Автобус " + getModel() + " в диагностике не требуется");
        return false;
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
