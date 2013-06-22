package models;

import play.*;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.sql.Time;
import java.util.*;

@Entity
public class Appointment extends Model {
	
	@Required
	public Date appointmentTime;
	@ManyToOne
	public AppointmentStatus status;
	@ManyToOne
	public AppointmentType appointmentType;
	@ManyToOne
	public User patient;
	@ManyToOne
	public Doctor doctor;

	
	public String toString()
	{
		return "Patient: " + patient.firstname + " " + patient.lastname + " Doctor: " + doctor.user.firstname + " " + doctor.user.lastname + " Appointment time: " + appointmentTime; 
	}
	
}
    
