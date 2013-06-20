package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.sql.Time;
import java.util.*;

@Entity
public class Appointment extends Model {
	public Date appointmentDate; 
	public Time appointmentTime;
	public int statusID;
	public String appointmentReason;
	public String statusName;
	public DateTime dateAdded;
	public DateTime dateEdited;
	public DateTime	dateDeleted;
	public boolean status;
	
	@ManyToOne
	public User userID;
	public Doctor docID;
	
	public Appointment (User userID, Doctor docID, Date appointmentDate, Time appointmentTime, String appointmentReason, String statusName, boolean status) {
		this.userID = userID;
		this.docID = docID;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.statusName = statusName;
		this.appointmentReason = appointmentReason;
		this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
		this.status = status;
		}

}
    
