package com.whatsapp.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.login.controller.UserEditController;

public class TwitterUtil {

	final static Logger logger=Logger.getLogger(UserEditController.class);

	public static boolean isValidNum(String mobileNumber) {
		logger.info("Ente the Details:");
		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher(mobileNumber);
		boolean isMatch = m.matches();
		return isMatch;
	}
public static boolean isValidPwd(String pwd){
	Pattern p = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
	Matcher m = p.matcher(pwd);
	boolean isMatch = m.matches();
	return isMatch;

}
	public static boolean isValidMail(String email) {
		Pattern p = Pattern.compile(
				"^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + "A-Z]{2,7}$");
		Matcher m = p.matcher(email);
		boolean isMatch = m.matches();
		logger.info("end of the session");
		return isMatch;
		
	}
	}

