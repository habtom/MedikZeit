package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class Doctor extends Model {
	public int userID;
	public int docID;
	public String docPrefix;
	public int docspecialisationID;
	public String docClinicName;
	public String docPhoto;
	public Date dateAdded;
    public Date dateEdited;
    public Date dateDeleted;
    public boolean Status;
    
    public Doctor ( int userID, int docID, String docPrefix, int docspecialisationID, String docClinicName, String docPhoto, Date dateAdded, Date dateEdited, Date dateDeleted, boolean Status){
      this.userID = userID;
      this.docID = docID;
      this.docPrefix = docPrefix;
      this. docspecialisationID =  docspecialisationID;
      this.docClinicName = docClinicName;
      this.docPhoto = docPhoto;
      this.dateAdded = dateAdded;
      this.dateEdited = dateEdited;
      this.dateDeleted = dateDeleted;
      this.Status = Status;
  }
}
 
