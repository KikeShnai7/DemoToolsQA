package com.toolsqa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.toolsqa.methods.WebActions;

public class HomePage extends WebActions {
	
	// Declaración de Elementos
	WebDriver driver;
	
	@FindBy(xpath="//h5[text()='Book Store Application']")
	WebElement lnkBookStoreApp;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement btnLogin;
	
	// Constructor method
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}// Constructor method
	
	// Métodos
	
	public void LanzarApp(String url)
	{
		driver.get(url);
		
		// Verificación
		Assert.assertTrue(lnkBookStoreApp.isDisplayed());
	}
	
	
	public void GoToLogin() throws Exception
	{
		scrollDown();
		scrollDown();
		Thread.sleep(3000);
		
		//Click on Book Store Application
		lnkBookStoreApp.click();
		
		Thread.sleep(3000);
		scrollDown();
		scrollDown();
		Thread.sleep(2000);
		
		//Click on Login
		btnLogin.click();
	}

}
