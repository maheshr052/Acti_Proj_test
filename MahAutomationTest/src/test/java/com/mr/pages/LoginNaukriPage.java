package com.mr.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mr.util.BasePageObject;

public class LoginNaukriPage extends BasePageObject
{
	
	
	//WebDriver uiDriver;
	By termsandcon=By.cssSelector(".hd3");
	By forgetlink=By.partialLinkText("Forgot Password?");
	By siteLogo= By.cssSelector(".logo>a>img");
	By resetpwdtext=By.xpath("//h1");
	By myEmailidRad=By.id("rd_email");
	By emailidtextbox=By.id("forgotemail");
	By submitbtn=By.cssSelector(".blueBut1>button");
	
boolean flag=false;
		
		public LoginNaukriPage(WebDriver driver)
		{
			//this.uiDriver=driver;
			super(driver);
			
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
		public String  verifyFortgetpassword() throws Exception
		{
			Log.info("Verification for Post Your CV Button");
			String actualResult = null;
			try 
			{
				 actualResult= uiDriver.findElement(forgetlink).getText();
				String expectedresult="Forgot Password?";
				System.out.println("uthkrush");
				//Assert.assertEquals(actualResult, expectedresult, "Terms are not Matching");
			} catch (Exception e)
			{
				throw new Exception("FAILED WHILE VERIFING THE Terms Text" + "\n verifyTermstext "+e.getLocalizedMessage());
			}
			
			return actualResult;
			
		}
/**************************************************************************************************************************************************/
		/**
		 * @author manjunathr
		 * @return HomePage
		 * @throws Exception
		 * This method will click on site logo and redirects to Home Page
		 */
		public HomePage clickOnSiteLogo() throws Exception
		{
		Log.info("Clicking on Sitelogu Image");
			try 
			{
				uiDriver.findElement(siteLogo).click();
			} 
			catch (Exception e) {
				
				throw new Exception("FAILED CLICKON SITE " + "\nclickOnSiteLogo " +e.getLocalizedMessage());
			}
			return new HomePage(uiDriver);
		}
		//Forgot Password?
	
/**************************************************************************************************************************************************/

		public boolean verifyResetYourPasswordText() throws Exception
		{
			Log.info("Verifcation of Reset Password Text");
			try 
			{
				flag= uiDriver.findElement(resetpwdtext).isDisplayed();
				Assert.assertTrue(flag, "Reset Password Text Message is not displayed");
				return flag;
				
			} catch (Exception e) 
			{
			throw new Exception("FAILED WHILE VERIFYING THE RESET YOUR PASSWORD TEXT" + "\n verifyResetYourPasswordText" +e.getLocalizedMessage());
			}
		}
	/**************************************************************************************************************************************************/
		
		public boolean verifyIremeberMyEmailId() throws Exception
		{
			Log.info("Verification of I remember my email id radio button");
			
			try 
			{
				flag=uiDriver.findElement(myEmailidRad).isDisplayed();
				if (uiDriver.findElement(myEmailidRad).isSelected()) 
				{
					System.out.println("Selected");
				}
				Assert.assertTrue(flag, "Email id Radio button is not selected");
				return flag;
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE VERIFYING THE I REMEMBER EMAIL ID LINK" + "\nverifyIremeberMyEmailId " +e.getLocalizedMessage());
			}
		}
		/**************************************************************************************************************************************************/
		
		public void enterEmailID( String email) throws Exception
		{
			Log.info("Entering Email id");
			try 
			{
				uiDriver.findElement(emailidtextbox).sendKeys(email);
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHIEL ENTERING THE EMAIL ID " + "\n enterEmailID" + e.getLocalizedMessage());
			}
		}
		
		/**************************************************************************************************************************************************/
		
		public LoginNaukriPage clickOnSubmitButton() throws Exception
		{
			Log.info("Clicking on Submit button");
			try 
			{
				uiDriver.findElement(submitbtn).click();
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON SUBMIT BUTTON" + "\n clickOnSubmitButton" + e.getLocalizedMessage());
			}
			return this;
		}
		
}



