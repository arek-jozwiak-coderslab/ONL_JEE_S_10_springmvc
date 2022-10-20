package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Controller
public class HelloController {
    @GetMapping("/hello-world")
    @ResponseBody
    public String helloWorld() {

        return "Hello World";
    }

    @GetMapping("/helloView")
    public String helloViewAction(Model model) {


        int hour = LocalTime.now().getHour();
//        hour = 1;
        if (hour > 20 || hour < 8) {
            model.addAttribute("backgroundColor", "black");
            model.addAttribute("color", "white"); //
        }else {
            model.addAttribute("backgroundColor", "white");
            model.addAttribute("color", "red"); //
        }
        return "home";
    }
}
