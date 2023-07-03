package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.annuaire.models.Notification;


//repository that extends CrudRepository  

public interface NotificationRepository extends CrudRepository<Notification, Integer>  
{  
}  