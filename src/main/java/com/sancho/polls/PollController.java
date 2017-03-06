package com.sancho.polls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-04.
 */
@Controller
public class PollController {

    private final PollService pollService;

    @Autowired
    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @GetMapping("/polls")
    public ModelAndView getInterestCheckPage() {
        ModelAndView modelAndView = new ModelAndView("polls/polls");

        modelAndView.addObject("polls", pollService.selectAll());

        return modelAndView;
    }
}
