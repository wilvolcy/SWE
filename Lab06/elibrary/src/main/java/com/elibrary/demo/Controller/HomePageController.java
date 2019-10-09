package com.elibrary.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value ={"/","elibrary"})
    public  String displayHomePage(){
        return "home/index";
    }

}
