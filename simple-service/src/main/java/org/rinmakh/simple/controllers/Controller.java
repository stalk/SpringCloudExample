package org.rinmakh.simple.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class Controller {


    @RequestMapping("/")
    public String start(){
        return "Hello world";
    }

    @RequestMapping(value = "/department")
    public List<String> getDepartments(@RequestParam(name="number")Integer number){
        return Arrays.asList("one","two","free","four");
    }



}
