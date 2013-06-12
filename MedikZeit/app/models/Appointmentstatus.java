package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Appointmentstatus extends Model {
	public int statusID; 
	public String statusName;
	public Date dateAdded;
	public Date	dateEdited;
	public Date	dateDeleted;
	public boolean status;
	
	public Appointmentstatus ( int statusID, String statusName, Date dateAdded, Date dateEdited, Date dateDeleted, boolean status){
		this.statusID =statusID;
		this.statusName = statusName;
		this.dateAdded = dateAdded;
		this.dateEdited = dateEdited;
		this.dateDeleted = dateDeleted;
		this.status = status;
		
		
		

		
	}
	
}
    

