package com.vomtung.relationmapping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/index")
@Controller
public class IndexController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(){
		return "index";
	}
}
