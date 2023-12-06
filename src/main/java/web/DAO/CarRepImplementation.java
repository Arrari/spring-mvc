package web.DAO;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;
import web.model.Car;

@Repository
public class CarRepImplementation implements CarRepository {

    private List<Car> carList = new ArrayList<>();

    public CarRepImplementation() {
        this.carList.add(new Car(1, "model1", 1, 1000));
        this.carList.add(new Car(2, "model1", 2, 1500));
        this.carList.add(new Car(3, "model2", 2, 2000));
        this.carList.add(new Car(4, "model2", 5, 2100));
        this.carList.add(new Car(5, "model3", 3, 30000));
        this.carList.add(new Car(6, "model3", 7, 40000));
        this.carList.add(new Car(7, "model4", 8, 18000));
        this.carList.add(new Car(8, "model4", 2, 1900));
    }

    @Override
    public void addCar(Car car) {
        this.carList.add(car);
    }

    @Override
    public Car getCar(int id) {
        return this.carList.stream()
                .filter(s -> id == s.getID())
                .findAny()
                .orElse(null);
    }

    @Override
    public List getAllCars() {
        return this.carList;
    }

    @Override
    public List<Car> getIntCars(int num) {
        return this.carList.stream().limit(num).collect(Collectors.toList());
    }

    @Override
    public void removeCar(int id) {
        this.carList.remove(carList.stream()
                .filter(s -> id == s.getID())
                .findAny()
                .orElse(null));
    }

    @Override
    public int getNumOfCars() {
        return this.carList.size();
    }

}
