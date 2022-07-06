package com.two.vote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ImagController {

    @RequestMapping("/image")
    public String test(){
        return "a";
    }
}
