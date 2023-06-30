package tn.csf.annuaire.security.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.Speciality;
import tn.csf.annuaire.repository.SpecialityRepository;



//defining the business logic  
@Service 

public class SpecialityServices {

	@Autowired  
	SpecialityRepository specialityRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Speciality> getAllSpecialties()   
	{  
		List<Speciality> specialities = new ArrayList<Speciality>();  
		specialityRepository.findAll().forEach(s -> specialities.add(s));  
		return specialities;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Speciality getSpecialtiesById(int id)   
	{  
		return specialityRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Speciality s)   
	{  
		specialityRepository.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		specialityRepository.deleteById(id);  
	} 

}