package com.backendd.backendd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {
    
    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "home";
    }
}
