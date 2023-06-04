package oms.springdiplom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home.html");
        return modelAndView;
    }
    @GetMapping("/authenticated")
    public String pageForAuthenticatedUsers(){
        return "secured part of web service";
    }
    @GetMapping("/only_for_admins")
    public String pageOnlyForAdmins(){
        return "asds";
    }
}
