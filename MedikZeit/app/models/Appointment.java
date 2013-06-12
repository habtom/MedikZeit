package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Appointment extends Model {
	public int appointmentID;
	public int patientID;
	public int doctorID;
	public Date appointmentTime;
	public int statusID;
	public int appointmentType;
	public Date dateAdded;
	public Date dateEdited;
	public Date	dateDeleted;
	public boolean status;
	
	public Appointment ( int appointmentID, int patientID, int doctorID, Date appointmentTime, int statusID, int appointmentType, Date dateAdded, Date dateEdited, Date dateDeleted, boolean status) {
		this.appointmentID = appointmentID;
		this.patientID = patientID;
		this.doctorID = doctorID;
		this.appointmentTime = appointmentTime;
		this.statusID =statusID;
		this.appointmentType =appointmentType;
		this.dateAdded = dateAdded;
		this.dateEdited = dateEdited;
		this.dateDeleted = dateDeleted;
		this.status =status;
		}
     
		
		
		

}
    
