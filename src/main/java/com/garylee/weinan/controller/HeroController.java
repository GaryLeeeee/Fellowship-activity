package com.garylee.weinan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HeroController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
