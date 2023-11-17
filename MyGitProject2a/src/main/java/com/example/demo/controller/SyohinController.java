package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SyohinController {
	
	@RequestMapping(path= "/syohin",method = RequestMethod.GET)
	public String syohin (String logID,String pass) {
		return "syohin_view";
	}
}
