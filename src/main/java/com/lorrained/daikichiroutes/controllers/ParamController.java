package com.lorrained.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
	
    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String nameQuery) {
        if (nameQuery == null) {
        	return "Hello Human!";
        } else {
        return "Hello " + nameQuery + "!";
    }
}
        
}
