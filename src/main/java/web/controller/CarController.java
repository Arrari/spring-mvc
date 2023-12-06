package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(required = false, defaultValue = "0") int count, Model model) {

        if (count != 0 && count < 5) {
            model.addAttribute("cars", carService.getNumCars(count));
            System.out.println(carService.getNumCars(count));
        } else {
            model.addAttribute("cars", carService.getAllCars());
            System.out.println(carService.getAllCars());
        }

        return "cars";
    }


}
