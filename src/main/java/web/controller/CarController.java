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
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCarTable(Model model,
                                @RequestParam(value = "count", defaultValue = "5") Integer count) {
        model.addAttribute("carsList",
                carService.getCountCars(carService.getCarsList(), count));
        return "cars";
    }
}
