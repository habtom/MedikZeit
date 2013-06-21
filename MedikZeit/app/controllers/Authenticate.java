package controllers;

import play.classloading.ApplicationClasses.ApplicationClass;
import play.data.validation.Valid;
import play.mvc.Controller;
import models.*;

public class Authenticate extends Controller {
	
	private static void doLoginLogic(String email) {
		session.put("user", email);
	}
	
	public static void register() {
		render();
	}
	
	public static void doRegister(@Valid User user) {
		//if error --> Register else save
		if (!user.validateAndSave()) {
			params.flash();
			validation.keep();
			register();
		}
		//no errors --> log user
		doLoginLogic(user.email);
		Authenticate.myIndex();
	}
	
	public static void login() {
		
		render();
	
	}
	
	public static void doLogin(String email, String password) {
		if (User.isValidLogin(email, password)) {
			doLoginLogic(email);
			Authenticate.myIndex();
		} else {
			validation.addError("email", "User email or Password was incorrect");
			validation.keep();
			login();
		}
	}
	
	public static void logout() {
		session.remove("user");
		Application.index();
	}
	
	public static void myIndex() {
		if (session.get("user") == null) {
			Authenticate.login();
		}
        render();
	}
}

