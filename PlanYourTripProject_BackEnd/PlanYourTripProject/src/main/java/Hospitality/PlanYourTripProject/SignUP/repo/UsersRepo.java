package Hospitality.PlanYourTripProject.SignUP.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Hospitality.PlanYourTripProject.SignUP.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, String> {
           public List<Users> findByEmail(String email);

		public Users findByEmailAndPassword(String email, String password);
}
