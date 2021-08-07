package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(2020,230,"toyota"));
        cars.add(new Car(2021,300,"BMW"));
        cars.add(new Car(2015,540,"Audi"));
        cars.add(new Car(2017,450,"Mercedes"));
        cars.add(new Car(2010,400,"Volga"));
    }

    public List<Car> getCars(Integer count){
       if(count == null){
           count=5;
       }
       return cars.stream().limit(Math.min(count,5)).collect(Collectors.toList());
    }
}
