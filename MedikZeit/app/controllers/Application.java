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
	    	show(user.id);
	    }
		
	    public static void show(Long id) {
	    	
	    }
	    
		public static void index() {
	        render();
		}
    
		public static void listAllDoctors() {
			List<Doctor> doctors = Doctor.findAll();
			render(doctors);
		}
    
    

}