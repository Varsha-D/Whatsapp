package com.whatsapp.DAOImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.controller.UserEditController;
import com.whatsapp.DAO.ILoginDao;
import com.whatsapp.controller.AddPojos;
@Component
public class LoginHiberDatImpl implements ILoginDao {

	final static Logger logger=Logger.getLogger(LoginHiberDatImpl.class);
	 public List<AddPojos> getUserByUserNameAndPassword(String username,String password)
	 {
		
		logger.info("Entered into  getUserByUserNameAndPassword :: LoginHiberDatImpl");
		logger.debug(username+""+password);

		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();// -->multiple connection will build
		Session session = sf.openSession();
		Query q=session.createQuery("from AddPojos where email=:mail and pwd=:password ");
		q.setParameter("mail", username);
		q.setParameter("password", password);
		List ls=q.list();
		session.close();
		logger.info("Exit from getUserByUserNameAndPassword :: LoginHiberDatImpl");
		return ls;
	 }
	 public List<AddPojos> getAllUsers()
	 {
		 logger.info("Entered into  getAllUsers :: LoginHiberDatImpl");
			Configuration configure = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sf = configure.buildSessionFactory();// -->multiple connection will build
			Session session = sf.openSession();
			Query qAllUsers=session.createQuery("from AddPojos");
			List<AddPojos> userList=qAllUsers.list();
			session.close();
			logger.info("Exit from getAllUsers :: LoginHiberDatImpl");
			return userList;

	 }
}
