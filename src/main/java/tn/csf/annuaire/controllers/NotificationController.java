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

import tn.csf.annuaire.models.Notification;
import tn.csf.annuaire.services.NotificationServices;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class NotificationController {

	@Autowired  
	NotificationServices notificationService;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/notifications")
	private List<Notification> getAllNotifications()   
	{  
		return notificationService.getAllNotifications();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/notifications/{id}")  
	private Notification getNotification(@PathVariable("id") int id)   
	{  
		return notificationService.getNotificationsById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/notifications/{id}")  
	private void deleteNotification(@PathVariable("id") int id)   
	{  
		notificationService.delete(id);  
	} 

	//create new article
	@PostMapping("/notifications")  
	private int saveNotification(@RequestBody Notification n)   
	{  
		notificationService.saveOrUpdate(n);  
		return n.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/notifications")  
	private Notification update(@RequestBody  Notification n)   
	{  
		notificationService.saveOrUpdate(n);  
		return n;  
	}  
}