package com.mr.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mr.util.BasePageObject;

public class MyNaukriPage extends BasePageObject
{

	//WebDriver uiDriver;
	
	public MyNaukriPage(WebDriver driver)
	{
		//this.uiDriver=driver;
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	By mynaukrilbl= By.xpath("//ul[@class='rghtSec fr menu logged']/li[2]/a");
	By logoutlink=By.xpath("//div[@class='subMenu']/ul/li[5]/a");
	
	boolean flag=false;
	String actual_Result;
	String expected_Result;
	String Parent_window;
	/****************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * verifys the mynaukri head is displayed on the Page
	 */
	public boolean verifyMyNaukriHead() throws Exception
	{
		Log.info("Verification of My naukri Text");
		try 
		{
			
			flag= uiDriver.findElement(mynaukrilbl).isDisplayed();
			Assert.assertTrue(flag, "MY Naukri text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE MY NAUKRI " + "\n verifymynaukritext" +e.getLocalizedMessage());
		}
	}
	
	/****************************************************************************************************************************************/
	/**
	 * 
	 * @author manjunathr
	 * @return loginnaukripage
	 * @throws Exception
	 * This method will verifys the mynaukri and move object to logout and click on logout button and object will move to login naukri page
	 */
	public LoginNaukriPage verifyMyNaukriLinkAndClickOnLogOut() throws Exception
	{
		Log.info("Clciking on My naukri link button");
		
		
			try 
			{
				Actions act= new Actions(uiDriver);
				verifyMyNaukriHead();
				WebElement mynaukrimenu= uiDriver.findElement(mynaukrilbl);
				act.moveToElement(mynaukrimenu);
				Thread.sleep(4000);
				WebElement childlink= uiDriver.findElement(logoutlink);
				act.moveToElement(childlink);
				act.click().build().perform();
				
				
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON MY NAUKRI LINK BUTTON" + "\n clickOnMyNaukrilinknbutton" +e.getLocalizedMessage());
			}
		return new LoginNaukriPage(uiDriver);
	}
	
}
