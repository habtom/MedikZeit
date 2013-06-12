package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Rating extends Model {
	public int ratingID;
    public int patientID;
    public int doctorID;
	public int ratingValue;
	public String comment;
    public Date dateAdded;
	public Date dateEdited;
	public Date dateDeleted;
	public boolean status;
	
	public Rating ( int ratingID, int patientID, int doctorID, int ratingValue, String comment, Date dateAdded, Date dateEdited, Date dateDeleted, boolean status) {
	   this.ratingID =ratingID;
	   this.patientID = patientID;
	   this.doctorID = doctorID;
	   this.ratingValue =ratingValue;
	   this.comment = comment;
	   this.dateAdded = dateAdded;
	   this.dateEdited = dateEdited;
	   this.dateDeleted = dateDeleted;
	   this.status = status;
	   
	}
    
}
