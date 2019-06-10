package com.whatsapp.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatsapp.DAO.IRegDaoImpl;
import com.whatsapp.controller.AddPojos;

public class RegJdbcDaoImpl implements IRegDaoImpl {
	final static Logger logger=Logger.getLogger(RegJdbcDaoImpl.class);
	@RequestMapping(value="/userregister")
	public void saveUser(AddPojos user) throws Exception
	{
		logger.info("Entered into saveUser :: RegJdbcDaoImpl");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		PreparedStatement ps = con
				.prepareStatement("insert into user(email,name,mobile,city,pwd) values(?,?,?,?,?,?)");
		ps.setString(1, user.getEmail());
		ps.setString(2, user.getName());
		ps.setString(3, user.getMobile());
		ps.setString(4, user.getCity());
		ps.setString(5, user.getPwd());
		ps.setString(6, user.getRole());
		ps.executeUpdate();
	
		System.out.println("executed successsfully");
			con.close();
			logger.info("Exit from the saveUser :: RegJdbcDaoImpl");

	}


}
