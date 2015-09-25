package com.mr.pages;

import java.sql.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.mr.common.NKConstants;

public class ResumeNaukriPage
{
	
WebDriver uiDriver;
	
	public ResumeNaukriPage(WebDriver driver)
	{
		this.uiDriver=driver;
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/* UI ELEMENTS */
	
	By resumetext= By.xpath("//div[7]/div/h2");
	By ResumeDisplay=By.xpath("//div[@class='wrap']/div/h2");
	By customersupportlink= By.partialLinkText("Customer Support service");
	
	//By siteLogo= By.cssSelector(".nLogo.fl>img");
	String pageTitle=null;
	String actual_Result=null;
	String expected_Result=null;
	String parent_window=null;
	
	/*************************************************************************************************************************************/
	
	public void verifyFastForwardHomePageTitle() throws Exception
	{
		Log.info("getting the on page titles");
		try 
		{
			pageTitle=uiDriver.getTitle().trim();
			Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_HOMEPAGE, "Home Page title is not matching or displayed as expected");
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED CLICKON SITE " + "\n verifyCareernavigatorHomePageTitle " +e.getLocalizedMessage());
		}
	}
	
	/*************************************************************************************************************************************/
	public String verifyGetResumeText() throws Exception
	{
		Log.info("Verification of Resume Text");
		try 
		{
			actual_Result =uiDriver.findElement(resumetext).getText();
			
			expected_Result="I need an impressive resume";
			Assert.assertEquals(actual_Result, expected_Result, "Both are not Matching");
			//div[@class='wrap']/div/h2
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE TEXT "+ "\n verifyGetResumeText" + e.getLocalizedMessage());
		}
		return actual_Result;
	}
	
	/*************************************************************************************************************************************/
	
	public ResumeNaukriPage clickOnCustomerSupportService() throws Exception
	{
		Log.info(" Clicking on Customer Support service ");
		try 
		{
			//parent_window=uiDriver.getWindowHandle();
			uiDriver.findElement(customersupportlink).click();
			
			for (String ChildCust : uiDriver.getWindowHandles())
			{
				uiDriver.switchTo().window(ChildCust);
				Thread.sleep(5000);
			}
			
			/*uiDriver.close();
			uiDriver.switchTo().window(parent_window);*/
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON CUSTOMER SUPPORT LINK" + "\n clickOnCustomerSupportService " +e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	
	
	/*************************************************************************************************************************************/
	public String verifyResumeDisplayText() throws Exception
	{
		Log.info("Verification of Resume Text");
		try 
		{
			actual_Result =uiDriver.findElement(ResumeDisplay).getText();
			
			expected_Result="Why Resume Display";
			Assert.assertEquals(actual_Result, expected_Result, "Both are not Matching");
			//div[@class='wrap']/div/h2
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE TEXT "+ "\n verifyGetResumeText" + e.getLocalizedMessage());
		}
		return actual_Result;
	}
}
