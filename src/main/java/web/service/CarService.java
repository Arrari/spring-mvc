package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface CarService {

    public void addCar(Car car);

    public void removeCar(int ID);

    public List<Car> getAllCars();

    public List<Car> getNumCars(int num);

    public int getCarsCount();

}
