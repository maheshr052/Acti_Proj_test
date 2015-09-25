package com.mr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobSearchNaukriPage
{
	
	WebDriver uiDriver;
	
	public JobSearchNaukriPage(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
	By locationtextbox=By.xpath("//div/div[2]/input[@class='sugInp w135']");
	By locationname=By.xpath("//div[@class='count']/h1/span[3]");
	
	String actual_Result= null;
	String actual_Result1= null;
	String expected_Result=null;
	
	
	public void verifyLocationName() throws Exception
	{
		try 
		{
			actual_Result=uiDriver.findElement(locationtextbox).getText();
			System.out.println("Manjunath" + actual_Result);
			actual_Result1=uiDriver.findElement(locationname).getText();
			System.out.println(actual_Result1);
			
			
		} catch (Exception e) 
		{
			throw new Exception(" FAILED TO GET THE LOCATIONS NAME IN" +" verifylocationname" +e.getLocalizedMessage());
		}
		
	}

}
