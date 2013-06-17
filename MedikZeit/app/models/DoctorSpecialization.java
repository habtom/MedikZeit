package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class DoctorSpecialization  extends Model {
    public int specializationID;
    public String specializationName;
    public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean Status;
    
    @OneToOne
    public Doctor docID;
    
    public DoctorSpecialization ( int specializationID, String specializationName, boolean Status) {
    	this.specializationID = specializationID;
    	this.specializationName = specializationName;
    	this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
        this.Status = Status;
    }
    	
}

