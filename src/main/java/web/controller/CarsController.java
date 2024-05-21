package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class Car {

    @GetMapping()
    public String carsList(Model model) {
        return new String();
    }

    @GetMapping()
    public String anyCar(@RequestParam("count") int count, Model model) {
        return null;
    }
}
