package dk.kea.dat18i.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepo;

    @GetMapping("/mycar")
    public String car(Model model){
        List<Car> carList = new ArrayList<>();

        model.addAttribute("cars", carList);
        return "show-car";
    }

    @GetMapping("/carv")
    @ResponseBody
    public Car showCar(){
        Car car = carRepo.findCar(1);
        return car;
    }

}
