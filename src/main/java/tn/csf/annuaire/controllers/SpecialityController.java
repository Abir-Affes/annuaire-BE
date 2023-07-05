package tn.csf.annuaire.controllers;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.annuaire.models.Speciality;
import tn.csf.annuaire.services.SpecialityServices;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class SpecialityController {

	@Autowired  
	SpecialityServices specialityService;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/specialities")
	private List<Speciality> getAllSpecialities()   
	{  
		return specialityService.getAllSpecialties();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/specialities/{id}")  
	private Speciality getSpeciality(@PathVariable("id") int id)   
	{  
		return specialityService.getSpecialtiesById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/specialities/{id}")  
	private void deleteSpeciality(@PathVariable("id") int id)   
	{  
		specialityService.delete(id);  
	} 

	//create new article
	@PostMapping("/specialities")  
	private int saveSpeciality(@RequestBody Speciality s)   
	{  
		specialityService.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/specialities")  
	private Speciality update(@RequestBody  Speciality s)   
	{  
		specialityService.saveOrUpdate(s);  
		return s;  
	}  
}
