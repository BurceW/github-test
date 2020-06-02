package com.wkhgs.wgb.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/mygittest")
    public String MyTest(){

        return "are you ok?";

    }

}
