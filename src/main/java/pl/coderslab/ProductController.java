package pl.coderslab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.cart.Product;

@RestController
@RequestMapping("/products")
public class ProductController {

    @RequestMapping("/")
    public Product helloBook() {
        return new Product("asdas",2.0);
    }
}
