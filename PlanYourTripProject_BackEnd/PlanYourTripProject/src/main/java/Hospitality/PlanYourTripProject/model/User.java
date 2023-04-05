package Hospitality.PlanYourTripProject.model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="user")
public class User  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id",nullable=false)
    private Long userid;
	private String state;
    private String hotel;
    private String username;
    private String email;
    private long phoneNo;
    private int adults;
    private int children;
    private float amount;
	private String  check_in_date; 
	private String  check_out_date; 
	
    
 
    
    
    public Long getUserid() {
		return userid;
	}






	public void setUserid(Long userid) {
		this.userid = userid;
	}






	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}






	public long getPhoneNo() {
		return phoneNo;
	}






	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}












	public String getEmail() {
		return email;
	}






	public void setEmail(String email) {
		this.email = email;
	}






	public int getAdults() {
		return adults;
	}






	public void setAdults(int adults) {
		this.adults = adults;
	}






	public int getChildren() {
		return children;
	}






	public void setChildren(int children) {
		this.children = children;
	}






	public float getAmount() {
		return amount;
	}






	public void setAmount(float amount) {
		this.amount = amount;
	}






	public String getCheck_in_date() {
		return check_in_date;
	}






	public void setCheck_in_date(String check_in_date) {
		this.check_in_date = check_in_date;
	}






	public String getCheck_out_date() {
		return check_out_date;
	}






	public void setCheck_out_date(String check_out_date) {
		this.check_out_date = check_out_date;
	}






	public String getState() {
		return state;
	}






	public void setState(String state) {
		this.state = state;
	}






	public String getHotel() {
		return hotel;
	}






	public void setHotel(String hotel) {
		this.hotel = hotel;
	}






	

	




	public User(Long userid, String username, long phoneNo, int age, String email, int adults, int children,
			float amount, String check_in_date, String check_out_date, String state, String hotel) {
		super();
		this.userid = userid;
		this.username = username;
		this.phoneNo = phoneNo;
		this.email = email;
		this.adults = adults;
		this.children = children;
		this.amount = amount;
		this.check_in_date = check_in_date;
		this.check_out_date = check_out_date;
		this.state = state;
		this.hotel = hotel;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}






	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", phoneNo=" + phoneNo 
				+ ", email=" + email + ", adults=" + adults + ", children=" + children + ", amount=" + amount
				+ ", check_in_date=" + check_in_date + ", check_out_date=" + check_out_date + ", state=" + state
				+ ", hotel=" + hotel + "]";
	}

		
    
    
}
