package dk.kea.dat18i.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarRepository carRepo;

    @GetMapping("/mycar")
    public String car(Model model){
        List<Car> carList = carRepo.findAllCars();
        model.addAttribute("cars", carList);
        return "show-car";
    }


    @GetMapping("/addcar")
    public String addCar(Model m){
        m.addAttribute("carform", new Car());
        return "add-car";
    }

    @PostMapping("/savecar")
    @ResponseBody
    public String saveCar(@ModelAttribute Car car){

        carRepo.insert(car);
        return "Your data is saved and secured don't worry about GDPR.";
    }


    @GetMapping("/carv")
    @ResponseBody
    public Car showCar(){
        Car car = carRepo.findCar(1);
        return car;
    }

}
