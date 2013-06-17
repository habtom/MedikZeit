package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class Adress extends Model {
	public int addressID;
	public String city;
	public int zipCode;
	public String streetName;
	public int streetNumber;
	public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
    
    
    
    public Adress ( int addressID, String city, int zipCode, String streetName, int streetNumber, boolean Status) {
    	this.addressID = addressID;
    	this.city = city;
    	this.zipCode = zipCode;
    	this.streetName = streetName;
    	this.streetNumber = streetNumber;
    	this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
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
    
    		
  
   
    
