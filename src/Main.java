import Auto.*;
import Drivers.Driver;
import Drivers.DriverClassB;
import Drivers.DriverClassC;
import Drivers.DriverClassD;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Bus bus1 = new Bus("ГАЗ", "ПАЗ-652", 35, null);
        bus1.addDriver(new DriverClassD<>("РАФ", "982", 44,"Костя", true,"30 лет"));
        bus1.addSponsor(new Sponsor("РедБул", 50000));
        bus1.addMechanic(new Mechanic("Костя", "Чинаски", "РедБул", "Работает со всеми машинами"));

        Bus bus2 = new Bus("ЗИЛ", "158", 20, "Автобус");
        Bus bus3 = new Bus("ЛиАЗ", "676", 50, "Автобус");
        Bus bus4 = new Bus("РАФ", "982", 44, "Автобус");

        Track track1 = new Track("ГАЗ", "Ермак",80,"Грузовик");
        track1.addDriver(new DriverClassB<>("Ауди", "R8", 240,"Андрей", true,"15 лет"));
        track1.addMechanic(new Mechanic("Сергей", "Отерро", "АвтоДок", "Работает с грузовыми"));
        track1.addSponsor(new Sponsor("ХайперХ", 5000));
        Track track2 = new Track("ГАЗель", "Бизнес",73,"Грузовик");
        Track track3 = new Track("КамАЗ", "6520",90,"Грузовик");
        Track track4 = new Track("Урал", "NEXT",56,"Грузовик");

        PassengerCars car1 = new PassengerCars("Ауди", "R8", 160,"Легковой авто");
        car1.addDriver(new DriverClassB<>("Ауди", "R8", 240,"Андрей", true,"15 лет"));
        car1.addMechanic(new Mechanic("Андрей", "Гарбуз", "5колесо", "Работает с легковыми"));
        car1.addSponsor(new Sponsor("Чинаски", 1000));
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
        List<Car> cars = new ArrayList<>();
        cars.add(bus1);
        cars.add(bus2);
        cars.add(bus3);
        cars.add(bus4);
        cars.add(track1);
        cars.add(track2);
        cars.add(track3);
        cars.add(track4);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        for (Car car: cars) {
            printInfo(car);
        }


        autoService(bus1,bus2,bus3,bus4,
                track1,track2,track3,track4,
                car1,car2,car3,car4);
    }
    public static void printInfo(Car car){
        System.out.println("Автомобиль " + car.getBrand() + car.getModel());
        System.out.println("Водители");
        for (Driver driver : car.getDrivers()) {
            System.out.println(driver.getName());
        }
        System.out.println("Спонсоры:");
        for (Sponsor sponsor : car.getSponsors()){
            System.out.println(sponsor.getName());
        }
        System.out.println("Механики");
        for (Mechanic mechanic : car.getMechanics()){
            System.out.println(mechanic.getFirstName() + mechanic.getLastName() + mechanic.getCompany());
        }
    }
    public static void autoService(Transport... transports){
        for (int i = 0; i < transports.length; i++) {
            try {
                if (!transports[i].passDiagnostics()) {
                    throw new RuntimeException("Не прошёл проверку");
                }
                }catch(RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        }
        }
