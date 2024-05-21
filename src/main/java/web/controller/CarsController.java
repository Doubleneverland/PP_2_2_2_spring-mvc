package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDao;
import web.models.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDao carDao;
    @Autowired
    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping()
    public String anyCar(@RequestParam(defaultValue = "5") int count, Model model) {
        List<Car> test = carDao.carByCount(count);
        model.addAttribute("car", test);
        return "carsCount";
    }
}
