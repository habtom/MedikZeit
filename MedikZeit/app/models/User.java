package models;

import java.util.*;

import javax.persistence.*;

import org.joda.time.DateTime;
 
import play.Play;
import play.db.jpa.*;
import play.data.validation.*;
import play.libs.Codec;
 
@Entity
public class User extends Model {
 
    @Email
    @Required
    public String email;
    @Required
    public String password;
    public String firstname;
    public String lastname;
    public boolean gender;
    public String phoneNumber;
    public boolean insurance;
    public int userType;
    public DateTime dateAdded;
    public DateTime dateEdited;
    public DateTime dateDeleted;
    public boolean status;
    
    @OneToOne
    public Adress addressID;
    
    public User(Adress addressID, String email, String password, String firstname, String lastname, boolean gender, String phoneNumber, boolean insurance, int userType, boolean status) {
        this.email = email;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.insurance = insurance;
        this.userType = userType;
        this.dateAdded = new DateTime();
		this.dateEdited = new  DateTime();
		this.dateDeleted = new DateTime();
        this.status = status;
    }
    
    public static User connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }
    
    public boolean checkPassword(String password) {
        //return password.equals(Codec.hexMD5(password));
        return this.password.equals(password);
    }

    public boolean isAdmin() {
        return userType == 1 ? true : false;
    }
    
    
    public static User findByEmail(String email) {
        return find("email", email).first();
    }

    public static List<User> findAll(int page, int pageSize) {
        return User.all().fetch(page, pageSize);
    }

    public static boolean isEmailAvailable(String email) {
        return findByEmail(email) == null;
    }   
}