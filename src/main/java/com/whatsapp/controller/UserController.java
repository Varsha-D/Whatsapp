package com.whatsapp.controller;


	import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.cfg.Configuration;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import com.whatsapp.controller.AddPojos;
	@Controller
	public class UserController {

		final static Logger logger=Logger.getLogger(RegisterController.class);
		@RequestMapping(value="/deleteUser", method=RequestMethod.POST)
		public String deleteUserInformation(@RequestParam("mailIdToDelete") String email, Model model) {
			logger.info("deleteUser triggered!!" + email);
			
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sf = configuration.buildSessionFactory();
			Session session = sf.openSession();
			
			Query query = session.createQuery("delete from AddPojos where email = :mail");
			query.setParameter("mail", email);
			query.executeUpdate();
			
			session.beginTransaction().commit();

			//Fetching updated user records from database and setting it into model object
			Query queryAllUsers = session.createQuery("from AddPojos");
			List<AddPojos> userList = queryAllUsers.list();
			model.addAttribute("uList", userList);
			
			session.close();
			
			return "Profile";
		}
		@RequestMapping(value="/editUser1", method=RequestMethod.POST)
		public String EditUserInformation(@RequestParam("mailIdToEdit") String email, Model model) {
			logger.debug("EditUser triggered!!" + email);
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sf = configuration.buildSessionFactory();
			Session session = sf.openSession();
			
			Query queryEditUsers = session.createQuery(" from AddPojos where email = :mail");
			queryEditUsers.setParameter("mail", email);
			List<AddPojos> userList = queryEditUsers.list();
			model.addAttribute("userObj", userList.get(0));
			return "editUser";
	}
		@RequestMapping(value="/UpdateUser")
		public String UpdateUserInformation(AddPojos user, Model model) {
			logger.info("update user details !!");
			logger.debug(user.getName());
			logger.debug(user.getMobile());
			logger.debug(user.getEmail());

			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sf = configuration.buildSessionFactory();
			Session session = sf.openSession();
			try {
               session.update(user);
   			session.beginTransaction().commit();
			}catch(StaleObjectStateException ex) {
				model.addAttribute("errormsg","The record has been modified by other user,Kindly take the latest and update");
				return"editUser";
			}catch(Exception e) {
				e.printStackTrace();
			}
   		//Fetching updated user records from database and setting it into model object
			Query queryAllUsers = session.createQuery("from AddPojos");
			List<AddPojos> userList = queryAllUsers.list();
			model.addAttribute("uList", userList);
			logger.info("User session ended");
			session.close();
			return "Profile";		

	}
}