package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SyohinloginController {
	
	@RequestMapping(path= "/syohinlogin",method = RequestMethod.GET)
	public String login (Model model) {
		return "syohinlogin";
	}
	
	@RequestMapping(path= "/syohinlogresult",method = RequestMethod.GET)
	public String syohin (String logID,String pass,Model model) {
		if(logID.equals("gitlogin")&&pass.equals("gitpw")) {
			return "syohinview";
		}else {
		return "redirect:/syohinlogin";
		}
	}
}
