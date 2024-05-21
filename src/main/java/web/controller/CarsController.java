package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;
//import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarsController {
    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String anyCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            List<Car> list = carService.carByCount(count);
            model.addAttribute("car", list);
        } else {
            List<Car> list = carService.carList();
            model.addAttribute("car", list);
        }
        return "carsCount";
    }


}
