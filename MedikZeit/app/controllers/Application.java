package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	 
		public static void userSignup(){
	    	render();
	    }
	    
	    public static void doAddUser(User user) {
	    	
	    	user.save();
	    	userProfile(user.id);
	    }
		
	    public static void userProfile(Long id) {
	    	User user = User.findById(id);
	    	render(user);
	    }
	    
		public static void index() {
	        render();
		}
    
		public static void listAllDoctors() {
			List<Doctor> doctors = Doctor.findAll();
			render(doctors);
		}
    
    

}