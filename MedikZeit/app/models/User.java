package models;

import java.util.*;

import javax.persistence.*;

import org.joda.time.DateTime;
 
import play.Play;
import play.db.jpa.*;
import play.data.validation.*;
import play.libs.Codec;
 
@Entity
public class User extends Model {
 
    @Email
    @Required
    public String email;
    
    @Required
    @Password
    @Transient
    public String password;
    public String passwordHash;
    
    @Required
    public String firstname;
    @Required
    public String lastname;
    public boolean gender;
    public String phoneNumber;
    public boolean insurance;
    public String city;
	public int zipCode;
	public String streetName;
	public int streetNumber;
    public int userType;
    public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
        
    public User(String email, String firstname, String lastname, boolean gender, String phoneNumber, boolean insurance, String city, int zipCode, String streetName, int streetNumber, int userType, boolean status) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.insurance = insurance;
        this.city = city;
    	this.zipCode = zipCode;
    	this.streetName = streetName;
    	this.streetNumber = streetNumber;
        this.userType = userType;
        this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
        this.status = status;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    	this.passwordHash = Codec.hexMD5(password);
    }
    
    public static boolean isValidLogin(String email, String password) {
    	
    	return (count("email=? AND PasswordHash=?", email, Codec.hexMD5(password)) == 1);
    }
}