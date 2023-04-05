package Hospitality.PlanYourTripProject.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import Hospitality.PlanYourTripProject.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
    @Transactional
	void deleteUserByUserid(Long id);

	 Optional<User> findUserByUserid(Long userid);
    
}
