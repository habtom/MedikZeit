package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import org.joda.time.DateTime;

import java.util.*;

@Entity
public class Doctor extends Model {
	public int docID;
	public String docPrefix;
	public String docClinicName;
	public String docPhoto;
	public String city;
	public int zipCode;
	public String streetName;
	public int streetNumber;
	public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
    
    @OneToOne
    public User userID;
    public DoctorSpecialization docSpecializationID;
    
    public Doctor ( User userID, DoctorSpecialization docSpecializationID, int docID, String docPrefix, String docClinicName, String docPhoto,String city, int zipCode, String streetName, int streetNumber, boolean status){
      this.userID = userID;
      this.docSpecializationID = docSpecializationID;
      this.docID = docID;
      this.docPrefix = docPrefix;
      this.docClinicName = docClinicName;
      this.docPhoto = docPhoto;
      this.city = city;
      this.streetName = streetName;
      this.streetNumber = streetNumber;
      this.dateAdded = new DateTime();
	  this.dateEdited = new  DateTime();
	  this.dateDeleted = new DateTime();
      this.status = status;
  }
}
 
