package com.telecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lee on 09/05/2017.
 */

@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("login");

        return modelAndView;
    }

    @RequestMapping(value = "/customerApply")
    public ModelAndView customerApply() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("customerApply");

        return modelAndView;
    }

    @RequestMapping(value = "/collection")
    public ModelAndView collectionpage() {
        ModelAndView modelAndView = new ModelAndView();

        return modelAndView;
    }

    @RequestMapping(value = "/businessHall")
    public ModelAndView businessHall() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("businessHall");

        return modelAndView;
    }

    @RequestMapping(value = "/business")
    public ModelAndView business() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("business");

        return modelAndView;
    }
}
