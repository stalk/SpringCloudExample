package org.rinmakh.secondservice.controller;


import org.rinmakh.secondservice.feign.FeinCLientExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {

    @Autowired
    FeinCLientExample feinCLient;

    @GetMapping("/hellos")
    public String getHello(){
        return feinCLient.getHello();
    }
}
