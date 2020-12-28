package com.toolsqa.methods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.toolsqa.hooks.Hooks;


public class WebActions {
	
	WebDriver driver;
	
	static int idCounter = 0;
	public static String strImgName;
	public static ArrayList<String> listaImgs = new ArrayList<String>();
	
	
	// Métodos
	
	public WebDriverWait waiter()
	{		
		WebDriverWait waiter = new WebDriverWait(Hooks.driver, 15);
		return waiter;
			
	}//waiter
		
		
	public void selectByVisibleText(WebElement cmbElement, String visibleText)
	{		
		Select selector = new Select(cmbElement);
		selector.selectByVisibleText(visibleText);
			
	}//selectByVisibleText
	
	
	public void scrollUP()
	{
		JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
		js.executeScript("window.scrollBy(0,-300)");
	
	}//scrollUP
	
	
	public void scrollDown()
	{	
		JavascriptExecutor js = (JavascriptExecutor)Hooks.driver;
		js.executeScript("window.scrollBy(0,300)");			
	
	}//scrollDown
	
	
	public void takeScreenShot()
	{
		File imageName;
		idCounter = idCounter + 1;
		
		File myScreenShot=((TakesScreenshot)Hooks.driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(myScreenShot, imageName = new File("C:\\Automation\\Evidences\\img\\"+"ss_"+idCounter+"_"+System.currentTimeMillis()+".jpg"));
			strImgName = imageName.getName();
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}//takeScreenShot
	
	
	public void sendToArray(String strImgName)
	{
		listaImgs.add(strImgName);
	}//sendToArray

}//WebActions
