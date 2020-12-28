package com.toolsqa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginPageSteps extends BaseSteps {
	
	@And("Realizo el login con {string} y {string}")
	public void realizo_el_login_con_y(String user, String password) throws Exception {
		
		objLoginPage.Login(user, password);
	}
	
	@Then("Valido el ingreso al perfil {string}")
	public void valido_el_ingreso_al_perfil(String user) {
	    
		objLoginPage.ValidarLogin(user);
	}

}
