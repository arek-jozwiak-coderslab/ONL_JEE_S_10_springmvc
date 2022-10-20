package pl.coderslab.cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/cart")
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10),
                        rand.nextDouble())));
        return "addtocart";
    }


    @RequestMapping("/cart")
    public String cart(Model model) {
        model.addAttribute("cartItems", cart.getCartItems());
        return "cart/details";
    }

}
