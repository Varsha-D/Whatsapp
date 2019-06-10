package com.whatsapp.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatsapp.DAO.IRegDaoImpl;
import com.whatsapp.controller.AddPojos;
import com.whatsapp.controller.RegisterController;

@SuppressWarnings("unused")
@Component
public class RegHiberDatImpl implements IRegDaoImpl{

	final static Logger logger=Logger.getLogger(RegHiberDatImpl.class);
	@RequestMapping(value="/userregister")
	public void saveUser(AddPojos user) throws Exception
	{
		logger.info("Entered into saveUser :: RegHiberDatImpl");
		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();// -->multiple connection will build										
		logger.debug("Session Factory Opened!! ");
		Session session = sf.openSession();
		logger.debug("Opened session !!");
		session.save(user);
		logger.debug("Parsed user object to databse");
		session.beginTransaction().commit();
		session.close();	
			logger.info("Exit from the saveUser :: RegHiberDatImpl");

	}

}
