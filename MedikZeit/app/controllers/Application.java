package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

	    
	    
		public static void index() {
	        render();
		}

 		public static void listDoctors(String doctorSpecialization, String city, String insurance) {
 			List<Doctor> doctors = Doctor.find("user.address.city = ?1 and user.insurance.insurance = ?2 and docSpecialization.specializationName = ?3", city, insurance, doctorSpecialization).fetch();
 			System.out.println(doctors.size());
 			render(doctors);
    	}

    
		public static void listAllDoctors() {
			List<Doctor> doctors = Doctor.findAll();
			render(doctors);
		}
    
    

}
