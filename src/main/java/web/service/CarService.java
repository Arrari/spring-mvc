package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static List<Car> carList = new ArrayList<>();

    public void addCar (Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }
    public List<Car> getNumCars(int num) {
        return carList.stream().limit(num).collect(Collectors.toList());
    }
    public int getCarsCount() {
        return carList.size();
    }

}