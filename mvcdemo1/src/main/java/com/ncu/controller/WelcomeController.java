package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.models.Customer;
import com.ncu.models.Users;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String helloMsg()
	{
		return "index";
	}
	@RequestMapping(path = "/login")
	public String doLogin(@RequestParam(required=false,name="userId") String userId, Model model1) {
		model1.addAttribute("msg", "login"+userId);
		return "welcome";
	}
	@RequestMapping(path = "/login1")
	public String doLogin( Model model) {
	return "dashboard";
	}
	
	@RequestMapping(path = "/LoginSuccessfully")
	public String loginSuccessfully(@ModelAttribute("userModel") Users hi , Model model1  ) {
		model1.addAttribute("userModel", new Customer());
		model1.addAttribute("msg" , hi.getUserid());
		return "LoginSuccessfully";
	}
	
	@RequestMapping(path = "/saved")
	public String saved(@ModelAttribute("userModel") Customer c , Model model1) {
		model1.addAttribute("msg", c.getFname());
		model1.addAttribute("msg1", c.getLname());
		model1.addAttribute("msg2", c.getAge());
		model1.addAttribute("msg3", c.getGender());
		return "saved";
	
}
}
