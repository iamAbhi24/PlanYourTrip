package Hospitality.PlanYourTripProject.userscontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Hospitality.PlanYourTripProject.SignUP.model.Users;
import Hospitality.PlanYourTripProject.service.UsersService;

@RestController
@CrossOrigin
public class UsersController {
    
	@Autowired
	UsersService usersservice;
	
	
	   @PostMapping("/signup")
	   public ResponseEntity<?> addNewUsers(@RequestBody Users users){
		   if(usersservice.getUsersByEmail(users.getEmail())==null) {
			   Users u = usersservice.addNewUsers(users);
			   return ResponseEntity.ok(u);
		   }
		   return ResponseEntity.badRequest().body(null);
	   }
	

	   
	   
	     @PostMapping("/signin")
         public Users signinUser(@RequestBody Users users) throws Exception {
			String tempEmailId=users.getEmail();
			String tempPassword=users.getPassword();
			Users userObj=null;
			if(tempEmailId !=null && tempPassword != null ) {
				userObj= usersservice.FetchUsersByEmailAndPassword(tempEmailId, tempPassword);
				 	 
			}
			if(userObj == null) {
				throw new Exception("Invalid Creditionals");
			}
			return	userObj;
			
		}
}
