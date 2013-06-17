package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class Appointmentstatus extends Model {
	public int statusID; 
	public String statusName;
	public DateTime dateAdded;
	public DateTime	dateEdited;
	public DateTime	dateDeleted;
	public boolean status;
	
	@OneToOne
	public Appointment appointmentID;
	
	public Appointmentstatus ( int statusID, String statusName, Appointment appointmentID, boolean status){
		this.statusID =statusID;
		this.statusName = statusName;
		this.appointmentID = appointmentID;
		this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
		this.status = status;
		
		
		

		
	}
	
}
    

