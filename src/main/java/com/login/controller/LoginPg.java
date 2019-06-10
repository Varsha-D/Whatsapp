package com.login.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.whatsapp.DAO.ILoginDao;
import com.whatsapp.controller.AddPojos;

@Controller
public class LoginPg {
@Autowired
ILoginDao loginDao;
@RequestMapping(value="/loginPg")
 public String loginUser(@RequestParam("email") String username, @RequestParam("pwd") String password,Model m)
 {
	System.out.println("Login user method Triggered");
	System.out.println(username+""+password);
	List<AddPojos> list=loginDao.getUserByUserNameAndPassword(username, password);
	if(list.isEmpty())
	{
        System.out.println("Invalid Credentials!! stop in him in login page");
		m.addAttribute("msg", "Entered invalid Credentials!! Try with valid one!!") ;
		return "LoginPg";
	}else
	{
		System.out.println("Valid Credentials!! Login success forward to profile page");
		List<AddPojos> userList=loginDao.getAllUsers();

		/*for(AddPojos user: userList)
		{
			System.out.println(user.getName());
			System.out.println(user.getEmail());
			System.out.println(user.getCity());
			System.out.println(user.getMobile());
			System.out.println(user.getPwd());

		}
		m.addAttribute("uList", userList);
		m.addAttribute("key1", "Ravi you go to office!!");*/
		return "Success";

	}

 }
}
