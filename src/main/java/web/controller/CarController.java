package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {

    private CarService carService = new CarService();

    public CarController() {
        carService.addCar(new Car("model1",1,1000));
        carService.addCar(new Car("model1",2,1500));
        carService.addCar(new Car("model2",2,2000));
        carService.addCar(new Car("model2",5,2100));
        carService.addCar(new Car("model3",3,30000));
        carService.addCar(new Car("model3",7,40000));
        carService.addCar(new Car("model4",8,18000));
        carService.addCar(new Car("model4",2,1900));
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false, defaultValue = "0") int count, Model model) {

        if (count != 0 && count <5) {
            model.addAttribute("cars", carService.getNumCars(count));
            System.out.println(carService.getNumCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
            System.out.println(carService.getAllCars());
        }

        return "cars";
    }


}
