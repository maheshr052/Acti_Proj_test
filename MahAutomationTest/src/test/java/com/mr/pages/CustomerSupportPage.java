package com.mr.pages;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerSupportPage 
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	WebDriver uiDriver;
	public CustomerSupportPage(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
	String actual_Result=null;
	String expected_Result=null;
	String parent_window=null;
	boolean flag=false;
	
	/*************************************************************************************************************************************/
	public String getPageTitle() throws Exception
	{
		Log.info("Getting the Page title");
		try 
		{
			actual_Result=uiDriver.getTitle().trim();
			expected_Result="Customer Support Services – Naukri FastForward";
			
			Assert.assertEquals(actual_Result, expected_Result,"Customer Support Title is not Matching");
			
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE PAGE TITLE OF CUSTOMER SUPPORT SCREEN" + "\n getPageTitle" +e.getLocalizedMessage());
		}
		return actual_Result;
	}
	
	/*************************************************************************************************************************************/

}
