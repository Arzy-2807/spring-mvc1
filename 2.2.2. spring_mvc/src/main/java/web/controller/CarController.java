package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService = new CarService();


    @GetMapping
    public String getCars(@RequestParam(value = "count",required = false)Integer count, Model model){
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
