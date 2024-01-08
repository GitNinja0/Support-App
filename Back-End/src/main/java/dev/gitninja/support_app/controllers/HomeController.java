package dev.gitninja.support_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping(path = "/")
    public String index(){
        return "hello Spring-Boot";
    }
}
