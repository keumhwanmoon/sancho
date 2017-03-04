package com.sancho.gbs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class GroupBuyController {

    @GetMapping("/group-buys")
    public ModelAndView getGroupBuysPage() {
        return new ModelAndView("group-buys");
    }
}
