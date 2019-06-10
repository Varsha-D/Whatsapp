package com.whatsapp.DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatsapp.DAO.ILoginDao;
import com.whatsapp.controller.AddPojos;

public class LoginJdbcDaoImpl implements ILoginDao {
	final static Logger logger=Logger.getLogger(LoginJdbcDaoImpl.class);
	 public List<AddPojos> getUserByUserNameAndPassword(String username,String password)
	{
		logger.info("Entered into getUserByUserNameAndPassword :: LoginJdbcDaoImpl");
		List<AddPojos> list=new ArrayList();

		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		PreparedStatement ps = con.prepareStatement("select * from user where email=? and pwd=?");
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs=ps.executeQuery();
	while (rs.next())
	{
		AddPojos user=new AddPojos();
		user.setEmail(rs.getString("email"));
		user.setName(rs.getString("name"));
		user.setMobile(rs.getString("mobile"));
		user.setCity(rs.getString("city"));
		user.setPwd(rs.getString("pwd"));
		list.add(user);
	}
		} catch (Exception e) {
			logger.error("Exception occured while fetching user data based on userName and password", e);
		}
			logger.info("Exit from the getUserByUserNameAndPassword :: LoginJdbcDaoImpl");
			return list;
	}
	 public List<AddPojos> getAllUsers()
	 {
		 logger.info("Entered into getAllUsers :: LoginJdbcDaoImpl");
			List<AddPojos> list=new ArrayList();

			try {
				Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			PreparedStatement ps = con.prepareStatement("select * from user");
			ResultSet rs=ps.executeQuery();
		while (rs.next())
		{
			AddPojos user=new AddPojos();
			user.setEmail(rs.getString("email"));
			user.setName(rs.getString("name"));
			user.setMobile(rs.getString("mobile"));
			user.setCity(rs.getString("city"));
			user.setPwd(rs.getString("pwd"));
			list.add(user);
		}
			} catch (Exception e) {
				logger.error("Exception occured while fetching user data based on userName and password", e);
			}
				logger.info("Exit from the getAllUsers :: LoginJdbcDaoImpl"); 
		         return list;
	 }
}
