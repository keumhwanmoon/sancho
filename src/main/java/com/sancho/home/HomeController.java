package com.sancho.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView getHomePage() {
        return new ModelAndView("home");
    }
}
