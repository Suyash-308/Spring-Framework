package com.itshaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller()
public class GreetingController {
    @RequestMapping(value = "/greet",method = RequestMethod.GET)
    public ModelAndView greeting(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greeting");
        modelAndView.addObject("greeting","Hello !");
        return modelAndView;
    }

    @RequestMapping(value = "/welcome" ,method = RequestMethod.GET)
    public ModelAndView welcome(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome");
        modelAndView.addObject("welcome","Welcome to Spring MVC !");
        return modelAndView;
    }
}
