package com.aircuve.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	private static String userId = "aircuvetest";
	private static String userPwd = "password";
	
	
	@RequestMapping(value="/login/request", method=RequestMethod.GET) 
	public String login(@RequestBody String body) {
		
		JSONObject bodyJson = new JSONObject(body);
		JSONObject resultJson = new JSONObject();
		
		
		if(userId.equals(bodyJson.get("userId")) && userPwd.equals(bodyJson.get("userPwd"))){
			resultJson.put("success", "true");
		}else{
			resultJson.put("success", "false");
		}
		
		
		
		return resultJson.toString();
	}
	
}
