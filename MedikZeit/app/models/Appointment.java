package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.sql.Time;
import java.util.*;

@Entity
public class Appointment extends Model {
	public int appointmentID;
	public Date appointmentDate; 
	public Time appointmentTime;
	public int statusID;
	public String appointmentReason;
	public DateTime dateAdded;
	public DateTime dateEdited;
	public DateTime	dateDeleted;
	public boolean status;
	
	@ManyToOne
	public User patientID;
	public Doctor docID;
	
	public Appointment ( int appointmentID, User patientID, Doctor docID, Date appointmentDate, Time appointmentTime, int statusID,String appointmentReason, boolean status) {
		this.appointmentID = appointmentID;
		this.patientID = patientID;
		this.docID = docID;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = appointmentTime;
		this.statusID = statusID;
		this.appointmentReason = appointmentReason;
		this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
		this.status = status;
		}

}
    
