package com.sancho.polls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class PollController {

    @GetMapping("/polls")
    public ModelAndView getInterestCheckPage() {
        return new ModelAndView("polls/polls");
    }
}
