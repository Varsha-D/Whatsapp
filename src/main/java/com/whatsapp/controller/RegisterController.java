package com.whatsapp.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whatsapp.DAO.IRegDaoImpl;;

@Controller
public class RegisterController 
{
	final static Logger logger=Logger.getLogger(RegisterController.class);
	@Autowired
	IRegDaoImpl daoImpl;
	
	//@Qualifier(value="JdaEmp")
	@Autowired(required=false)
	EmployeePojo e1;
	
	//@Qualifier(value="JdaEmp")
	@Autowired(required=false)
	EmployeePojo e2;

	//@Qualifier(value="CTSEmp")
	@Autowired(required=false)
	EmployeePojo e3;
	
	//@Qualifier(value="CTSEmp")
	@Autowired(required=false)
	EmployeePojo e4;

		
	@RequestMapping(value="/TestIoc")
  public String saveTest()

  {
		logger.info("Entered into testIoc ::");
		System.out.println("Entered Employee Details ::");
		System.out.println("_________________________________________________________");

		System.out.println(e1.geteId()+"--"+e1.geteName()+"--"+e1.geteCity()+"--"+e1.geteSalary()+"--"+e1.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
				e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

				System.out.println(e2.geteId()+"--"+e2.geteName()+"--"+e2.geteCity()+"--"+e2.geteSalary()+"--"+e2.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
			    e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());
				System.out.println(e3.geteId()+"--"+e3.geteName()+"--"+e3.geteCity()+"--"+e3.geteSalary()+"--"+e3.geteCompany()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getIssuedCity()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getAdd().getPincode()+"--"+
						e3.getpPort().getAdd().getDept().getdId()+"--"+e3.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

						System.out.println(e4.geteId()+"--"+e4.geteName()+"--"+e4.geteCity()+"--"+e4.geteSalary()+"--"+e4.geteCompany()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getIssuedCity()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getAdd().getPincode()+"--"+
					    e4.getpPort().getAdd().getDept().getdId()+"--"+e4.getpPort().getAdd().getDept().getdName()+"--"+e4.getpPort().getAdd().getDept().getDloc());
		        

				System.out.println("_________________________________________________________");

		e1.seteId(100);
		e1.seteName("naina");
		e1.seteCity("pune");
		e1.seteSalary("70k");
		e1.getpPort().setPptId(56789);
		e1.getpPort().setIssuedCity("bangalore");
		e1.getpPort().getAdd().setCity("calcutta");
		e1.getpPort().getAdd().setPincode(700005); 
		e1.getpPort().getAdd().getDept().setdId(001);
		e1.getpPort().getAdd().getDept().setdName("agarwal");
		e1.getpPort().getAdd().getDept().setDloc("pune");


		System.out.println(e1.geteId()+"--"+e1.geteName()+"--"+e1.geteCity()+"--"+e1.geteSalary()+"--"+e1.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
		e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

		System.out.println(e2.geteId()+"--"+e2.geteName()+"--"+e2.geteCity()+"--"+e2.geteSalary()+"--"+e2.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
	    e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());
		System.out.println(e3.geteId()+"--"+e3.geteName()+"--"+e3.geteCity()+"--"+e3.geteSalary()+"--"+e3.geteCompany()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getIssuedCity()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getAdd().getPincode()+"--"+
				e3.getpPort().getAdd().getDept().getdId()+"--"+e3.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

				System.out.println(e4.geteId()+"--"+e4.geteName()+"--"+e4.geteCity()+"--"+e4.geteSalary()+"--"+e4.geteCompany()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getIssuedCity()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getAdd().getPincode()+"--"+
			    e4.getpPort().getAdd().getDept().getdId()+"--"+e4.getpPort().getAdd().getDept().getdName()+"--"+e4.getpPort().getAdd().getDept().getDloc());

		e2.seteId(101);
		e2.seteName("sai");
		e2.seteCity("goa");
		e2.seteSalary("50k");
		e2.getpPort().setPptId(12456);
		e2.getpPort().setIssuedCity("chennai");
		e1.getpPort().getAdd().setCity("bangalore");
		e1.getpPort().getAdd().setPincode(530068);
		e1.getpPort().getAdd().getDept().setdId(002);
		e1.getpPort().getAdd().getDept().setdName("nath");
		e1.getpPort().getAdd().getDept().setDloc("bangalore");

		
		System.out.println("_________________________________________________________");
		System.out.println(e1.geteId()+"--"+e1.geteName()+"--"+e1.geteCity()+"--"+e1.geteSalary()+"--"+e1.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
				e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

				System.out.println(e2.geteId()+"--"+e2.geteName()+"--"+e2.geteCity()+"--"+e2.geteSalary()+"--"+e2.geteCompany()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getIssuedCity()+"--"+e1.getpPort().getPptId()+"--"+e1.getpPort().getAdd().getPincode()+"--"+
			    e1.getpPort().getAdd().getDept().getdId()+"--"+e1.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());
				System.out.println(e3.geteId()+"--"+e3.geteName()+"--"+e3.geteCity()+"--"+e3.geteSalary()+"--"+e3.geteCompany()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getIssuedCity()+"--"+e3.getpPort().getPptId()+"--"+e3.getpPort().getAdd().getPincode()+"--"+
						e3.getpPort().getAdd().getDept().getdId()+"--"+e3.getpPort().getAdd().getDept().getdName()+"--"+e1.getpPort().getAdd().getDept().getDloc());

						System.out.println(e4.geteId()+"--"+e4.geteName()+"--"+e4.geteCity()+"--"+e4.geteSalary()+"--"+e4.geteCompany()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getIssuedCity()+"--"+e4.getpPort().getPptId()+"--"+e4.getpPort().getAdd().getPincode()+"--"+
					    e4.getpPort().getAdd().getDept().getdId()+"--"+e4.getpPort().getAdd().getDept().getdName()+"--"+e4.getpPort().getAdd().getDept().getDloc());

				System.out.println("_________________________________________________________");
		return "Register";
		
  }

	
	@RequestMapping(value="/userregister")
	public String saveUser(AddPojos user, Model model) throws Exception
	{
		
		
	logger.info("Register button Triggered!!");
		
		boolean isValidMail = TwitterUtil.isValidMail(user.getEmail());
		if (!isValidMail) {
			logger.debug("The entered email id is wrong please check it once!!" +user.getEmail());
			model.addAttribute("errormsg", "Entered Invalid Mail Id!! Please try with valid Mail Id");
			return "Register";
		}  

		boolean isValidpwd = TwitterUtil.isValidPwd(user.getPwd());
		if (!isValidpwd) {
			logger.debug("The entered password is wrong please check it once!!" +user.getPwd());
			model.addAttribute("errormsg", "Entered Invalid Password!! Please try with valid Password");
			return "Register";
		}
		
		boolean isValidMobile = TwitterUtil.isValidNum(user.getMobile());
		if (!isValidMobile) {
			logger.debug("The entered Mobile No is wrong please check it once!!" +user.getMobile());
			model.addAttribute("errormsg", "Entered Invalid mobile No!! Please try with valid mobile");
			return "Register";
		}
		//IRegDaoImpl daoImpl=new RegHiberDatImpl();
		daoImpl.saveUser(user);

		/*Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = configure.buildSessionFactory();// -->multiple connection will build										
		Session session = sf.openSession();
		try {
			String s=null;
			s.length();
			//logger.debug("valid string");
		}
		catch(Exception e) {
			logger.error("catched Exception",e);
		}
			session.save(user);
		session.beginTransaction().commit();
		logger.debug(user.getName()+""+user.getEmail()+""+user.getMobile()+""+user.getCity()+""+user.getPwd());
		session.close();	*/
		logger.debug(user.getName()+""+user.getEmail()+""+user.getMobile()+""+user.getCity()+""+user.getPwd());
		return "LoginPg";
	}

}
