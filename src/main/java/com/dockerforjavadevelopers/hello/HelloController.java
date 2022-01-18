package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello World\n";
    }
    @RequestMapping("/ahte")
    public String newahte() {
        return "Ahtesham bhai lage raho\n";
    }
    
    
    
}
