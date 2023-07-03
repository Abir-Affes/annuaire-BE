package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.annuaire.models.Subscription;

//repository that extends CrudRepository  

public interface SubscriptionRepository extends CrudRepository<Subscription, Integer>  
{  
}  