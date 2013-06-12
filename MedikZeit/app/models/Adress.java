package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Adress extends Model {
	public int ID;
	public String City;
	public int Zipcode;
	public String StreetName;
	public int StreetNumber;
	public Date dateAdded;
    public Date dateEdited;
    public Date dateDeleted;
    public boolean Status;
    
    public Adress ( int ID, String City, int Zipcode, String StreetName, int StreetNumber, Date dateAdded, Date dateEdited, Date dateDeleted,boolean Status) {
    	this.ID = ID;
    	this.City = City;
    	this.Zipcode = Zipcode;
    	this.StreetName =StreetName;
    	this.StreetNumber =StreetNumber;
    	this.dateAdded = dateAdded;
    	this.dateEdited = dateEdited;
    	this.dateDeleted = dateDeleted;
    	this.Status = Status;
        }
}
    
    		
  
   
    
