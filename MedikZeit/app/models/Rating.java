package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class Rating extends Model {
	public int ratingID;
	public int ratingValue;
	public String comment;
    public DateTime dateAdded;
	public DateTime dateEdited;
	public DateTime dateDeleted;
	public boolean status;
	
	@ManyToOne
	public User patientID;
    public Doctor docID;
	public Rating ( int ratingID, Doctor docID, User patientID, int ratingValue, String comment, boolean status) {
	   this.ratingID =ratingID;
	   this.patientID = patientID;
	   this.docID = docID;
	   this.ratingValue =ratingValue;
	   this.comment = comment;
	   this.dateAdded = new DateTime();
	   this.dateEdited = new  DateTime();
       this.dateDeleted = new DateTime();
	   this.status = status;
	   
	}
    
}
