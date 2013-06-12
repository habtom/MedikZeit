package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class DoctorSpecialization  extends Model {
    public int specializationID;
    public String specializationName;
    public Date dateAdded;
    public Date dateEdited;
    public Date dateDeleted;
    public boolean Status;
    
    public DoctorSpecialization ( int specializationID, String specializationName, Date dateAdded, Date dateEdited, Date dateDeleted, boolean Status) {
    	this.specializationID = specializationID;
    	this.specializationName = specializationName;
    	this.dateAdded = dateAdded;
        this.dateEdited = dateEdited;
        this.dateDeleted = dateDeleted;
        this.Status = Status;
    }
    	
}

