package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {
    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCarTable(Model Car,
                                @RequestParam(value = "count", defaultValue = "5", required = false)
                                int count) {
        Car.addAttribute("cars",
                carService.printCarTable(count));
        return "cars";
    }
}
