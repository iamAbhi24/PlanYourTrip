package Hospitality.PlanYourTripProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospitality.PlanYourTripProject.SignUP.model.Users;
import Hospitality.PlanYourTripProject.SignUP.repo.UsersRepo;

@Service
public class UsersService {
     
	
	@Autowired
	UsersRepo usersrepo;
	
	public Users addNewUsers(Users users) {
		return usersrepo.save(users);
	}
	
	public Users getUsersByEmail(String email) {
		 
		 if(usersrepo.findByEmail(email).size()==0)
		 {
			 return null;
		 }
		 return usersrepo.findByEmail(email).get(0);
				 
	}

	public Users FetchUsersByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return usersrepo.findByEmailAndPassword(email, password);
	}


}
