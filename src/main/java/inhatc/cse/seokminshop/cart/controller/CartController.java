package inhatc.cse.seokminshop.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {

    @GetMapping("/cart")
    public String cartList() {
        return "cart/list";
    }

}
