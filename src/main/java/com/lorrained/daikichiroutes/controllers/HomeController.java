package com.lorrained.daikichiroutes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {

	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
//    @RequestMapping("/search/")
//    public String index(@RequestParam(value="q", required=false) String searchQuery) {
//        if (searchQuery == null) {
//        	return "You searched for nothing.";
//        } else {
//    	return "You searched for: " + searchQuery;
////    	the route would have to be search/?q=(whatever you are searching)
//        }
//    }
    
}