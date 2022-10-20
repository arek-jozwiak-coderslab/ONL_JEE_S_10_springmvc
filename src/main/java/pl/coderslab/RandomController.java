package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
public class RandomController {


    @GetMapping("/random/{max}/{min}")
    @ResponseBody
    public String random(@PathVariable int max, @PathVariable int min) {
        Random random = new Random();
        int i = random.nextInt(max-min+1) + min;

        double random1 = Math.random();


        return String.format("Użytkownik podał wartośi %d i %d " +
                "Wylosowano liczbę: %d wylosowana liczba.", max, min, i);
    }
}
