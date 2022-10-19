package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        System.out.println("asdasd");
        return "hello world asdasdasdasdas";
    }


    @RequestMapping(value = "/hello3", method = RequestMethod.GET)
    @ResponseBody
    public String hello3() {
        return "hello world";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    @ResponseBody
    public String contant() {
        return "hello world";
    }

}
