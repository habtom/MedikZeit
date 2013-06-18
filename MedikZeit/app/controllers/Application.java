package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {
	
	/*public static void findDoctor() {
		render();
	}*/

    public static void index() {
    	List<Doctor> doctors = Doctor.findAll();
        render(doctors);
    }
    
    

}