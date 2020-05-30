package com.ysstech.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/hi")
    public String hi() {
        return "redirect:index.html";
    }

    @RequestMapping("/index")
    public ModelAndView template() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        modelAndView.addObject("value", "Hello World!");
        return modelAndView;
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String, String> hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Hello", "World!");
        return map;
    }
}