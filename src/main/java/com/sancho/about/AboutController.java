package com.sancho.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class AboutController {

    @GetMapping("/about")
    public ModelAndView getAboutPage() {
        return new ModelAndView("about/about");
    }
}
