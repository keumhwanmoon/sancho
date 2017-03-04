package com.sancho.contact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class ContactController {

    @GetMapping("/contact")
    public ModelAndView getContactPage() {
        return new ModelAndView("contact/contact");
    }
}
