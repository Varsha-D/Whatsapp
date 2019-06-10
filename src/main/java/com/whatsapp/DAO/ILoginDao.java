package com.whatsapp.DAO;

import java.util.List;

import com.whatsapp.controller.AddPojos;

public interface ILoginDao {
public List<AddPojos> getUserByUserNameAndPassword(String userName, String password);
	
	public List<AddPojos> getAllUsers();


}
