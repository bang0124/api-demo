package com.aircuve.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value="/api") 
public class ApiController {
	
	
	@RequestMapping(value="/home", method=RequestMethod.GET) 
	public String home() {
		
		JSONObject json = new JSONObject();
		
		
		return json.toString();
	}
	
}
