package com.mr.pages;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecruitNaukriPage 
{
	
WebDriver uiDriver;
	
By youeorder=By.xpath("//div[@class='greyBdrCrt']/span");

By clickher=By.xpath("//a/strong");

String actual_Result=null;
String expected_Result=null;
String parent_window=null;
boolean flag=false;

	public RecruitNaukriPage(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return
	 * @throws Exception
	 */
	public String  verifyourorder() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
	
		try 
		{
			actual_Result= uiDriver.findElement(youeorder).getText();
			expected_Result="Your Order Details";
			//Assert.assertEquals(actualResult, expectedresult, "Terms are not Matching");
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
		}
		
		return actual_Result;
		
	}
	
	/*************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return
	 * @throws Exception
	 */
	public LoginNaukriPage  clickONClickhere() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
		
		try 
		{
			parent_window= uiDriver.getWindowHandle();
			uiDriver.findElement(clickher).click();
			for (String childclick : uiDriver.getWindowHandles()) 
			{
				uiDriver.switchTo().window(childclick);
			}
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
		}
		
		return new LoginNaukriPage(uiDriver);
		
	}
	/*************************************************************************************************************************************/

}
