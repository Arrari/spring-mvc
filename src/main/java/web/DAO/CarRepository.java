package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarRepository {

    public void addCar(Car car);

    public Car getCar(int id);

    public List<Car> getAllCars();

    public List<Car> getIntCars(int num);

    public void removeCar(int id);

    public int getNumOfCars();
}
