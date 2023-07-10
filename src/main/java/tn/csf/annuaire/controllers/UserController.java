package tn.csf.annuaire.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/usersbyspeciality/{id}")  
		private List<User> getUsersBySpeciality(@PathVariable("id") int id)   
		{  
			return uS.getUsersBySpeciality(id);  
		}  

		//creating a get mapping that retrieves the detail of a specific article  
		@GetMapping("/usersbyusername/{username}")  
		private Optional<User> getUsersByUsername(@PathVariable("username") String username)   
		{  
			return uS.getUsersByUsername(username);  
		}  	
	
		@GetMapping("/usersbyspecialityandemail")  
		private List<User> getUsersBySpecialityAndEmail(@RequestParam int id,
				@RequestParam String email)   
		{  
			return uS.getUsersBySpecialityAndByEmail(id, email);  
		}  
		
}
