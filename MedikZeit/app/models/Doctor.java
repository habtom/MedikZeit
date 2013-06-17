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
	public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
    
    @ManyToOne
    public User userID;
    
    public Doctor ( User userID, int docID, String docPrefix, String docClinicName, String docPhoto, boolean status){
      this.userID = userID;
      this.docID = docID;
      this.docPrefix = docPrefix;
      this.docClinicName = docClinicName;
      this.docPhoto = docPhoto;
      this.dateAdded = new DateTime();
	  this.dateEdited = new  DateTime();
	  this.dateDeleted = new DateTime();
      this.status = status;
  }
}
 
