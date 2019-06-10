package com.whatsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	@RequestMapping(value="/goToLoginPage")
    public String goToLogin()
{
	return "LoginPg";	
}
	
	@RequestMapping(value="/loginFail")
	public String loginFailRequest(Model m)
	{
		m.addAttribute("msg", "Entered Invalid Credentials!, Please try  with valid One!!");
		return "LoginPg";
		
	}
	
	@RequestMapping(value="/defaultTargetPage")
	public String defaultPage()
	{
		return "Success";
	}
	@RequestMapping(value="/logoutUser")
	public String Logout(Model m)
	{
		m.addAttribute("msg", "Logout successful!! Please login again for use site!!");
		return "LoginPg";
	}
	@RequestMapping(value="/accessDeniedPage")
	public String accessDenied(Model m) 
	{
		m.addAttribute("msg", "Access Denied!! You don't have access ton perform this operation!!");
		return "Success";
		
	}
}
