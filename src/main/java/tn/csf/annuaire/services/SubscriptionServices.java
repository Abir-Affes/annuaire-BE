package tn.csf.annuaire.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.Subscription;
import tn.csf.annuaire.repository.SubscriptionRepository;



//defining the business logic  
@Service 

public class SubscriptionServices {

	@Autowired  
	SubscriptionRepository subscriptionRepository;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Subscription> getAllSubscriptions()   
	{  
		List<Subscription> subscriptions = new ArrayList<Subscription>();  
		subscriptionRepository.findAll().forEach(s -> subscriptions.add(s));  
		return subscriptions;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Subscription getSubscriptionsById(int id)   
	{  
		return subscriptionRepository.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Subscription s)   
	{  
		subscriptionRepository.save(s);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		subscriptionRepository.deleteById(id);  
	} 

}