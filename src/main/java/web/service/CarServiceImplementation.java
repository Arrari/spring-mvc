package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarRepository;
import web.model.Car;
import java.util.List;


@Service
public class CarServiceImplementation implements CarService {

    private CarRepository cRep;

    @Autowired
    public CarServiceImplementation(CarRepository carRepository) {
        this.cRep = carRepository;
    }

    @Override
    public void addCar(Car car) {
        this.cRep.addCar(car);
    }

    @Override
    public void removeCar(int ID) {
        this.cRep.removeCar(ID);
    }

    @Override
    public List<Car> getAllCars() {
        return this.cRep.getAllCars();
    }

    @Override
    public List<Car> getNumCars(int num) {
        return this.cRep.getIntCars(num);
    }

    @Override
    public int getCarsCount() {
        return this.cRep.getNumOfCars();
    }
}
