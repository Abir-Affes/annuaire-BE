package tn.csf.annuaire.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.annuaire.models.User;
import tn.csf.annuaire.services.UserServices;

@RestController 
@CrossOrigin(origins = "*")
public class UserController {

	@Autowired  
	UserServices uS;  
	
	
	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/users")
	private List<User> getAllUsers()   
	{  
		return uS.getAllUsers();  
	} 
	
	
}
