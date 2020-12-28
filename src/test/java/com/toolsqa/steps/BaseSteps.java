package com.toolsqa.steps;

import org.openqa.selenium.support.PageFactory;

import com.toolsqa.hooks.Hooks;
import com.toolsqa.pages.HomePage;
import com.toolsqa.pages.LoginPage;

public class BaseSteps {
	
	protected HomePage objHomePage;
	protected LoginPage objLoginPage;
	
	// Constructor method
	public BaseSteps()
	{
		objHomePage = new HomePage(Hooks.driver);
		PageFactory.initElements(Hooks.driver, objHomePage);
		
		objLoginPage = new LoginPage(Hooks.driver);
		PageFactory.initElements(Hooks.driver, objLoginPage);
		
	}// Constructor method
	
}