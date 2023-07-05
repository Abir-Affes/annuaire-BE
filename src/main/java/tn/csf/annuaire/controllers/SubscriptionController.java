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

import tn.csf.annuaire.models.Subscription;
import tn.csf.annuaire.services.SubscriptionServices;


//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class SubscriptionController {

	@Autowired  
	SubscriptionServices subscriptionService;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/subscriptions")
	private List<Subscription> getAllSubscriptions()   
	{  
		return subscriptionService.getAllSubscriptions();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/subscriptions/{id}")  
	private Subscription getSubscription(@PathVariable("id") int id)   
	{  
		return subscriptionService.getSubscriptionsById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/subscriptions/{id}")  
	private void deleteSubscription(@PathVariable("id") int id)   
	{  
		subscriptionService.delete(id);  
	} 

	//create new article
	@PostMapping("/subscriptions")  
	private int saveSubscription(@RequestBody Subscription s)   
	{  
		subscriptionService.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/subscriptions")  
	private Subscription update(@RequestBody  Subscription s)   
	{  
		subscriptionService.saveOrUpdate(s);  
		return s;  
	}  
}
