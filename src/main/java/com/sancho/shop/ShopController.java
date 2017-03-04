package com.sancho.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class ShopController {

    @GetMapping("/shop")
    public ModelAndView getShopPage() {
        return new ModelAndView("shop/shop");
    }
}
