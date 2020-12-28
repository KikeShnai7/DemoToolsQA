package com.toolsqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	// Declaración de Elementos
	WebDriver driver;
	
	@FindBy(id="userName")
	WebElement txtUser;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	@FindBy(id="userName-value")
	WebElement lblUserName;
		
	// Constructor method
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}// Constructor method
	
	// Métodos
	
	public void Login(String user, String password) throws InterruptedException
	{
		// Verificación
		Assert.assertTrue(txtUser.isDisplayed());
		
		//Login
		txtUser.sendKeys(user);
		txtPassword.sendKeys(password);
		
		Thread.sleep(2000);
		
		btnLogin.click();
	}
	
	
	public void ValidarLogin(String user)
	{
		String strUserName = lblUserName.getText();
		System.out.println("Usuario mostrado: "+strUserName);
		
		Assert.assertTrue(strUserName.equals(user));
	}

}