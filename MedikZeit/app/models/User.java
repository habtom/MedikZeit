package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class User extends Model {
	public String email;
    public String password;
    public String Firstname;
    public String Lastname;
    public int ID;
    public boolean gender;
    public String PhoneNumber;
    public boolean Insurance;
    public int Usertype;
    public int adressID;
    public Date dateAdded;
    public Date dateEdited;
    public Date dateDeleted;
    public boolean Status;
    
    public User(String email, String password, String Firstname, String Lastname, int ID, boolean gender, String PhoneNumber, boolean Insurance, int Usertype, int adressID, Date dateAdded, Date dateEdited, Date dateDeleted, boolean Status) {
        this.email = email;
        this.password = password;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.ID = ID;
        this.gender = gender;
        this.PhoneNumber = PhoneNumber;
        this.Insurance = Insurance;
        this.Usertype = Usertype;
        this.adressID = adressID;
        this.dateAdded = dateAdded;
        this.dateEdited = dateEdited;
        this.dateDeleted = dateDeleted;
        this.Status = Status;
    }
}

        	
        
        
        
       
    
   
    
    
    

