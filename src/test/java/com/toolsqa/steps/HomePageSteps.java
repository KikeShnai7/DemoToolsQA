package com.toolsqa.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps extends BaseSteps {
	
	@Given("^He abierto el sitio web de ToolsQA Demo$")
	public void he_abierto_el_sitio_web_de_ToolsQA_Demo() {
		
		objHomePage.LanzarApp("https://demoqa.com/");
	}
	
	
	@When("^Ingreso al login de la seccion Book Store$")
	public void ingreso_al_login_de_la_seccion_Book_Store() throws Exception {
	    
		objHomePage.GoToLogin();
	}

}
