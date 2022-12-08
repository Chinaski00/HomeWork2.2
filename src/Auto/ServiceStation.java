package Auto;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation <T extends Car>{

    Queue<T> cars = new LinkedList<>();


    public void addCar(T car){
        cars.offer(car);
    }

    public void service(T car){
        car.passDiagnostics();
        System.out.println("Техобслуживание пройдено");
        cars.poll();
    }
}
