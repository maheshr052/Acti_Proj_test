package com.mr.pages;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class JobAlertCreatedPage {
	
	WebDriver uiDriver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/*UI Element Initialization*/
	/*By createJobAlertButton = By.xpath("//button[@id='cjaSubmit']");
	By errorKeySkills = By.xpath("//i[(@id='Sug_kwdsugg_err') and contains(.,'Keyskills should not be blank')]");
	By skillsAutoBox = By.xpath("//div[@id='kwdsugg']//input[@id='Sug_kwdsugg']");
	*/
	
	By naukriLogo = By.xpath("//a[@class='fl nLogo']");
	By headerIcons = By.xpath("//span[contains(@class,'topIcon jobs')]");
	By notifications = By.xpath("//a[contains(.,'Notifications')]");
	By myNaukriIcon = By.xpath("//li[contains(.,'My Naukri')]/a");
	By alertSuccessMessage = By.xpath("//div[(@class='cnt') and contains(.,'Your Job Alert')]");
	By logoutLink = By.xpath("//a[@class='logout']");
	
	public JobAlertCreatedPage(WebDriver driver){
		this.uiDriver = driver;
	}
	
	
	/*Variable Initialization*/
	boolean flag = false;
	
	
	
	/**This method will help us to verify Naukri Logo
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNaukriLogo(){
		flag = uiDriver.findElement(naukriLogo).isDisplayed();
		Assert.assertTrue(flag, "Naukri Logo is not displayed");
		return flag;
		
	} 
	
	/**This method will help us to verify Header Icons
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyHeaderIcons(){
		flag = uiDriver.findElements(headerIcons).isEmpty();
		Assert.assertFalse(flag, "Header Icons are not displayed");
		return flag;
		
	}
	
	
	/**This method will help us to verify Notifications Icon
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNotificationsIcon(){
		flag = uiDriver.findElement(notifications).isDisplayed();
		Assert.assertTrue(flag, "Notifications Icon is not displayed");
		return flag;
		
	}
	
	/**This method will help us to verify MyNaukri Icon
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMyNaukriIcon(){
		flag = uiDriver.findElement(myNaukriIcon).isDisplayed();
		Assert.assertTrue(flag, "MyNaukri Icon is not displayed");
		return flag;
		
	}
	
	/**This method will help us to verify Alert Success Message
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyAlertSuccessMessage(){
		flag = uiDriver.findElement(alertSuccessMessage).isDisplayed();
		Assert.assertTrue(flag, "Alert Success Message is not displayed");
		return flag;
		
	}
	
	/**This method will help us to verify Logout Link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLogoutLink(){
		flag = uiDriver.findElement(logoutLink).isDisplayed();
		Assert.assertTrue(flag, "Logout Link is not displayed");
		return flag;
		
	}
	
	/**This method will help us to Mousehover on MyNaukri Icon
	 * @author Senthil
	 * @return void
	 * @throws Exception 
	 */
	public void mouseOverOnMyNaukri() throws Exception{
		  Log.info("Before Mousehovering on MyNaukri Icon");
		  try{
		  verifyMyNaukriIcon();
		  Actions action = new Actions(uiDriver);
		  action.moveToElement(uiDriver.findElement(myNaukriIcon)).build().perform();
		  Log.info("After Mouseovering on MyNaukri Icon");
		  }
		  catch(Exception e){
			  throw new Exception("FAILED WHILE MOUSE HOVERING ON MYNAUKRI ICON:::"+"\n mouseOverOnMyNaukri()"+e.getLocalizedMessage());
		  }
	}
	
	

	/**This method will help us to Click on Logout Link
	 * @author Senthil
	 * @return void
	 * @throws Exception 
	 */
	public void clickOnLogoutLink() throws Exception{
		Log.info("Before Clicking on Logout link");
		try{
			mouseOverOnMyNaukri();
			Thread.sleep(1000);
			verifyLogoutLink();
			uiDriver.findElement(logoutLink).click();
			Thread.sleep(3000);
			Log.info("After Clicking on Logout link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LOGOUT LINK:::"+"\n  clickOnLogoutLink()"+e.getLocalizedMessage());
		}
		
	}	
		
	


	
		
	


	
	
	
	
	
	
	
	
	
	
	
	

}
