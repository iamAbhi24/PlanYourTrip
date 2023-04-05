package Hospitality.PlanYourTripProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Hospitality.PlanYourTripProject.model.User;
import Hospitality.PlanYourTripProject.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserResource {
	@Autowired
      UserService userService;
      
      public UserResource(UserService userService) {
    	  this.userService=userService;
      }
      @GetMapping("/all")
      public ResponseEntity<List<User>> getAllUser(){
    	  List<User>user=userService.findAllUser();
    	  return new ResponseEntity<>(user, HttpStatus.OK);
      }
      @GetMapping("/find/{Userid}")
      public ResponseEntity<User>getUserById(@PathVariable("Userid")Long Userid){
    	  User user=userService.findUserById(Userid);
    	  return new ResponseEntity<>(user, HttpStatus.OK);
      }
      
      @PostMapping("/add")
      public ResponseEntity<User>addUser(@RequestBody User user){
    	  User newuser=userService.addUser(user);
    	  return new ResponseEntity<>(newuser, HttpStatus.CREATED);
      }
     
      @PutMapping("/update")
      public ResponseEntity<User>updateUser(@RequestBody User user){
    	  User updateuser=userService.addUser(user);
    	  return new ResponseEntity<>(updateuser, HttpStatus.OK);
      }
      
      @DeleteMapping("/delete/{userid}")
      public ResponseEntity<?>deleteUser(@PathVariable("userid")Long userid){
    	  userService.deleteUser(userid);
    	  return new ResponseEntity<>(HttpStatus.OK);
      }

      
}
