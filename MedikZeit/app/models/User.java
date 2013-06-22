package models;

import java.util.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import javax.annotation.*;
 
import play.Play;
import play.db.jpa.*;
import play.data.validation.*;
import play.libs.Codec;
 
@Entity
public class User extends Model {
 
    @Email(message = "invalid.email")
    @Required(message = "no.email")
    public String email;
    
    @Password
    @Transient
    public String password;
    public String passwordHash;
    
    @Required(message = "no.firstname")
    public String firstname;
    
    @Required(message = "no.lastname")
    public String lastname;
    
    public boolean gender;
    public String phoneNumber;
    

    
    @ManyToOne
    public Insurance insurance;
    

    @ManyToOne
    public UserType userType;
    @OneToOne
    public Address address;

    
    public void setPassword(String password) {
    	this.password = password;
    	this.passwordHash = Codec.hexMD5(password);
    }
    
    public static boolean isValidLogin(String email, String password) {
    	
    	return (count("email=? AND PasswordHash=?", email, Codec.hexMD5(password)) == 1);
    }
}
