package tn.csf.annuaire.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.csf.annuaire.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);

	List<User> findBySpeciality_id(Integer speciality_id);
	
	List<User> findBySpeciality_idAndEmail(Integer speciality_id, String email);
	
}
