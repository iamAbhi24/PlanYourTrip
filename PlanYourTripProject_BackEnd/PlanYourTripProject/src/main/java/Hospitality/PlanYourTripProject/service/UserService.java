package Hospitality.PlanYourTripProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Hospitality.PlanYourTripProject.exception.UserNotFoundException;
import Hospitality.PlanYourTripProject.model.User;
import Hospitality.PlanYourTripProject.repo.UserRepo;
@Service
public class UserService {
    private final UserRepo userrepo;
@Autowired
public UserService(UserRepo userrepo) {
	this.userrepo=userrepo;
}
  public User addUser(User user) {
	  return userrepo.save(user);
  }
  public List<User> findAllUser(){
	  return userrepo.findAll();
  }
  public User findUserById(Long Userid) {
	  return userrepo.findUserByUserid(Userid).orElseThrow(() ->  new UserNotFoundException ("User by id"+Userid+"Was not found"));
  }
  public User UpdateUser(User user) {
	  return userrepo.save(user);
  }
   public void deleteUser(Long Userid) {
	   userrepo.deleteUserByUserid(Userid);
   }
   
}