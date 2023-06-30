package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.annuaire.models.Speciality;

//repository that extends CrudRepository  

public interface SpecialityRepository extends CrudRepository<Speciality, Integer>  
{  
}  