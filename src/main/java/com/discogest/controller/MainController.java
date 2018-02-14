package com.discogest.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping(value={"/","/home"}, method = RequestMethod.GET)
	public String home(){
		return "home";
	}
	
	@RequestMapping(value={"/error"}, method = RequestMethod.GET)
	public String errore(){
		return "error";
	}
	

}
