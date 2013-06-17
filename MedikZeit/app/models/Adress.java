package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Adress extends Model {
	public int ID;
	public String city;
	public int zipCode;
	public String streetName;
	public int streetNumber;
	public Date dateAdded;
    public Date dateEdited;
    public Date dateDeleted;
    public boolean status;
    
    public Adress ( int ID, String city, int zipCode, String streetName, int streetNumber, Date dateAdded, Date dateEdited, Date dateDeleted, boolean Status) {
    	this.ID = ID;
    	this.city = city;
    	this.zipCode = zipCode;
    	this.streetName = streetName;
    	this.streetNumber = streetNumber;
    	this.dateAdded = dateAdded;
    	this.dateEdited = dateEdited;
    	this.dateDeleted = dateDeleted;
    	this.status = status;
        }
    
    public int returnNum()
    {
    	return 2;
    }
    
    public int returnNum2()
    {
    	return 2;
    }
}
    
    		
  
   
    
