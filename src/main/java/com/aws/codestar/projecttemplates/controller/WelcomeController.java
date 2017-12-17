package com.aws.codestar.projecttemplates.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	 
	 @RequestMapping(value="/",method=RequestMethod.GET)
	    public String helloWorldGet1(@RequestParam(value = "name", defaultValue = "World") String name) {
	     System.out.println("NSTRNRT ISDJGLSDJG;");  
		 return "welcome";
	    }

}
