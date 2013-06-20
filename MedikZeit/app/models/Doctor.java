package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class Doctor extends Model {
	public String docPrefix;
	public String docClinicName;
	public String docPhoto;
	public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
    
    @OneToOne
    public User userID;
    public DoctorSpecialization docSpecializationID;
    
    public Doctor ( User userID, DoctorSpecialization docSpecializationID, String docPrefix, String docClinicName, String docPhoto, boolean status){
      this.userID = userID;
      this.docSpecializationID = docSpecializationID;
      this.docPrefix = docPrefix;
      this.docClinicName = docClinicName;
      this.docPhoto = docPhoto;
      this.dateAdded = new DateTime();
	  this.dateEdited = new  DateTime();
	  this.dateDeleted = new DateTime();
      this.status = status;
  }
}
 
