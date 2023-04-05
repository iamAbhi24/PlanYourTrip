package Hospitality.PlanYourTripProject.SignUP.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name =  "login_users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Users {

	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;

	@Id
	private String email;   
	
	private String password;

	
	
	public Users() {
		
	}
	
	public Users(String name,  String email, String password) {
		super();
		this.name = name;
		this.email = email; 
		this.password = password;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setCreatePassword(String password) {
		this.password = password;
	}

	

	
}
