import Auto.Bus;
import Auto.PassengerCars;
import Auto.Track;
import Drivers.DriverClassB;
import Drivers.DriverClassC;
import Drivers.DriverClassD;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("ГАЗ", "ПАЗ-652", 35, null);
        Bus bus2 = new Bus("ЗИЛ", "158", 20, "Автобус");
        Bus bus3 = new Bus("ЛиАЗ", "676", 50, "Автобус");
        Bus bus4 = new Bus("РАФ", "982", 44, "Автобус");

        Track track1 = new Track("ГАЗ", "Ермак",80,"Грузовик");
        Track track2 = new Track("ГАЗель", "Бизнес",73,"Грузовик");
        Track track3 = new Track("КамАЗ", "6520",90,"Грузовик");
        Track track4 = new Track("Урал", "NEXT",56,"Грузовик");

        PassengerCars car1 = new PassengerCars("Ауди", "R8", 160,"Легковой авто");
        PassengerCars car2 = new PassengerCars("Мерседес", "220", 140,"Легковой авто");
        PassengerCars car3 = new PassengerCars("ГАЗ", "1600", 180,"Легковой авто");
        PassengerCars car4 = new PassengerCars("Порш", "Каен", 320,"Легковой авто");

        System.out.println(bus1.maxSpeed());
        System.out.println(bus1.betterTime());
        System.out.println(bus1.pitStop());

        DriverClassD driverClassD = new DriverClassD<>("РАФ", "982", 44,"Костя", true,"30 лет");
        DriverClassB driverClassB = new DriverClassB<>("Ауди", "R8", 240,"Андрей", true,"15 лет");
        DriverClassC driverClassC = new DriverClassC<>("Урал", "NEXT", 54,"Антон", true,"10 лет");
        System.out.println(driverClassD.toString());
        System.out.println(driverClassB.toString());
        System.out.println(driverClassC.toString());
        System.out.println(bus1.printType());

    }
}