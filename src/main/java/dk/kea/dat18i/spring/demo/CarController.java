package dk.kea.dat18i.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/mycar")
    public String car(Model model){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1234, "BMW", "pink", 399.99));
        carList.add(new Car(4567, "VW", "red", 452));
        carList.add(new Car(7823, "Tesla", "orange", 130));
        model.addAttribute("cars", carList);
        return "show-car";
    }

}
