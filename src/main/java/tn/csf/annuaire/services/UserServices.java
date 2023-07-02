package tn.csf.annuaire.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.csf.annuaire.models.User;

import tn.csf.annuaire.repository.UserRepository;

@Service 
public class UserServices {

	@Autowired  
	UserRepository uR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<User> getAllUsers()   
	{  
		List<User> users = new ArrayList<User>();  
		uR.findAll().forEach(s -> users.add(s));  
		return users;  	
	}  
}
