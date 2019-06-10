package com.login.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.whatsapp.DAO.ILoginDao;
import com.whatsapp.DAOImpl.LoginHiberDatImpl;
import com.whatsapp.DAOImpl.LoginJdbcDaoImpl;
import com.whatsapp.controller.AddPojos;
import com.whatsapp.controller.RegisterController;
@Controller
public class UserEditController {
	
	final static Logger logger=Logger.getLogger(UserEditController.class);
	@RequestMapping(value="/editUser", method=RequestMethod.POST)
	public String deleteUserInformation(@RequestParam("mailIdToEdit") String email, Model model) {
		logger.debug("editUser triggered!!" + email);
		
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
		
		//session.close();
		
		return "Profile";

}
	@RequestMapping(value="/fetchAllRecords")
	public String getAllRecords(Model m)
	{
		ILoginDao dao=new LoginJdbcDaoImpl();
		List<AddPojos> allUsers=dao.getAllUsers();
	    m.addAttribute("uList",allUsers );
		return "Profile";
		
	}
}