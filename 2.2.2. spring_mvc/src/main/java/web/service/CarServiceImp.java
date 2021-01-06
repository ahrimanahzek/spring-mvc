package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImp() {
        cars.add(new Car("Car1", "1", "Q"));
        cars.add(new Car("Car2", "2", "W"));
        cars.add(new Car("Car3", "3", "X"));
        cars.add(new Car("Car4", "4", "Z"));
        cars.add(new Car("Car5", "5", "Y"));
    }

    @Override
    public List<Car> getCars(int id) {
        List<Car> carGetFirstList = new ArrayList<>(cars);
        return carGetFirstList
                .stream()
                .limit(id)
                .collect(Collectors.toList());
    }
}