package com.mr.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TermsAndConditions
{
WebDriver uiDriver;
By termsandcon=By.cssSelector(".hd3");

	
	public TermsAndConditions(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	
	/*************************************************************************************************************************************/
	public String  verifyTermstext() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
		String actualResult = null;
		try 
		{
			 actualResult= uiDriver.findElement(termsandcon).getText();
			String expectedresult="Terms and Condition";
			//Assert.assertEquals(actualResult, expectedresult, "Terms are not Matching");
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
		}
		
		return actualResult;
		
	}

	/*************************************************************************************************************************************/

}
