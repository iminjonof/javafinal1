package pl.edu.vistula.Task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class controller {

    @GetMapping("/")
    public String hello() {
        return "Hello vistula, my first spring boot";
    }

    @GetMapping("/greeting")
    public String greeting( @RequestParam(name="name", required = false, defaultValue="World") String name, Model model) {
        model.addAttribute("name",name);
        return "greeting";
    }

    //http://localhost:8080/greeting

}
