package com.mr.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CompleteMyProfilePage {
	WebDriver uiDriver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/*UI Element Initialization*/
	/*UI Element Initialization*/
	By registrationSuccessfulMsg = By.xpath("//div[(@class='grnbor fleft') and contains(.,'Congratulations') and contains(.,'Your account has been created.')]");
	By basicProfileSavedMessage = By.xpath("//div[(@class='grnbor fleft') and contains(.,'Your basic profile is now saved.')]");
	By completeYourprofilemessage = By.xpath("//div[(@class='padL10') and contains(.,'complete your profile')]");
	By uploadPhotoSection = By.xpath("//div[(@class='cls padLR10') and contains(.,'Upload Photo')]");
	By educationDetailsSection = By.xpath("//div[(@class='cls padLR10') and contains(.,'Education Details')]");
	By completeMyProfileButton = By.xpath("//input[@id='submit']");
	By errorSpecialization = By.xpath("//select[@id='ugspec']");
	By errorInstitution = By.xpath("//div[(@id='error_uginst') and contains(.,'Please select institute.')]");
	By resumeHeadline = By.xpath("//input[@id='resumeheadline']");
	By errorYearCompletion = By.xpath("//div[(@id='error_ugyear') and contains(.,'Please select actual or expected year of completion.')]");
	By desiredJob = By.xpath("//div[(@class='cls padLR10') and contains(.,'Desired Job')]");
	By itSkills = By.xpath("//div[(@class='cls padLR10') and contains(.,'IT Skills')]");
	By personalDetails = By.xpath("//div[(@class='cls padLR10') and contains(.,'Personal Details')]");
	By workAuthorization = By.xpath("//div[(@class='cls padLR10') and contains(.,'Work Authorization')]");
	By languagesKnown = By.xpath("//div[(@class='cls padLR10') and contains(.,'Languages Known')]");
	By affirmativeAction = By.xpath("//div[(@class='cls padLR10') and contains(.,'Affirmative Action')]");
	By specializationDropdown = By.xpath("//select[@id='ugspec']");
	By institutionDropdown = By.xpath("//select[@id='uginst']");
	By yearOfCompletionDropdown = By.xpath("//select[@id='ugyear']");
	
	public CompleteMyProfilePage(WebDriver driver){
		this.uiDriver = driver;
	}
	
	
	/*Variable Initialization*/
	boolean flag = false;
	
	
	/**This method will help us to verify Resume Headline Text Field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyResumeHeadlineTextField(){
		flag = uiDriver.findElement(resumeHeadline).isDisplayed();
		Assert.assertTrue(flag, "Resume Headline text field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Basic Profile Saved Message
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyBasicProfileSavedMessage(){
		flag = uiDriver.findElement(basicProfileSavedMessage).isDisplayed();
		Assert.assertTrue(flag, "Basic Profile Saved Message is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Complete Your profile message
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCompleteYourprofileMessage(){
		flag = uiDriver.findElement(completeYourprofilemessage).isDisplayed();
		Assert.assertTrue(flag, "Complete Your Profile message is not displayed");
		return flag;
	}
	
	
	/**This method will help us to verify Upload Photo Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyUploadPhotoSection(){
		flag = uiDriver.findElement(uploadPhotoSection).isDisplayed();
		Assert.assertTrue(flag, "Upload Photo Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education Details section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationDetailsSection(){
		flag = uiDriver.findElement(educationDetailsSection).isDisplayed();
		Assert.assertTrue(flag, "Education Details section is not displayed");
		return flag;
	}
	

	/**This method will help us to verify Education Details section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCompleteMyProfileButton(){
		flag = uiDriver.findElement(completeMyProfileButton).isDisplayed();
		Assert.assertTrue(flag, "Complete MyProfile Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Specialization Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySpecializationError(){
		flag = uiDriver.findElement(errorSpecialization).isDisplayed();
		Assert.assertTrue(flag, "Specialization Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Institution Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyInstitutionError(){
		flag = uiDriver.findElement(errorInstitution).isDisplayed();
		Assert.assertTrue(flag, "Institution Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Year Completion Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyYearCompletionError(){
		flag = uiDriver.findElement(errorYearCompletion).isDisplayed();
		Assert.assertTrue(flag, "Year Completion Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Desired Job Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDesiredJobSection(){
		flag = uiDriver.findElement(desiredJob).isDisplayed();
		Assert.assertTrue(flag, "Desired Job Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills Section
	 * @author Senthil
	 * @return flag
	 */
	/*public boolean verifySkillsSection(){
		flag = uiDriver.findElement(skills).isDisplayed();
		Assert.assertTrue(flag, "Skills Section is not displayed");
		return flag;
	}*/
	
	/**This method will help us to verify Personal Details section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPersonalDetailsSection(){
		flag = uiDriver.findElement(personalDetails).isDisplayed();
		Assert.assertTrue(flag, "Personal Details section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Work Authorization section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyWorkAuthorizationSection(){
		flag = uiDriver.findElement(workAuthorization).isDisplayed();
		Assert.assertTrue(flag, "Work Authorization section is not displayed");
		return flag;
	}
	

	/**This method will help us to verify Languages Known section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLanguagesKnownSection(){
		flag = uiDriver.findElement(languagesKnown).isDisplayed();
		Assert.assertTrue(flag, "Languages Known section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Affirmative Action section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyAffirmativeActionSection(){
		flag = uiDriver.findElement(affirmativeAction).isDisplayed();
		Assert.assertTrue(flag, "Affirmative Action section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Specialization Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySpecializationDropdown(){
		flag = uiDriver.findElement(specializationDropdown).isDisplayed();
		Assert.assertTrue(flag, "Specialization Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Institution Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyInstitutionDropdown(){
		flag = uiDriver.findElement(institutionDropdown).isDisplayed();
		Assert.assertTrue(flag, "Institution Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Year Of Completion Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyYearOfCompletionDropdown(){
		flag = uiDriver.findElement(yearOfCompletionDropdown).isDisplayed();
		Assert.assertTrue(flag, "Year Of Completion Dropdown is not displayed");
		return flag;
	}
		
	/**This method will help us to Select a value from Specialization Dropdown
	 * @author Senthil
	 * @param  spName "Computers"
	 * @throws Exception 
	 */	
	public void selectSpecialization(String spName) throws Exception{
		Log.info("Before Selecting a value from Specialization Dropdown");
		try{
			verifySpecializationDropdown();
			new Select((WebElement) specializationDropdown).selectByVisibleText(spName);
			Log.info("After Selecting a value from Specialization Dropdown");			
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING A VALUE FROM SPECIALIZATION DROPDOWN:::"+"\n selectSpecialization()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Select a value from Institution Dropdown
	 * @author Senthil
	 * @param  insName  "Anna University" 
	 * @throws Exception 
	 * 
	 */	
	public void selectInstitution(String insName) throws Exception{
		Log.info("Before Selecting a value from Institution Dropdown");
		try{
			verifyInstitutionDropdown();
			new Select((WebElement) institutionDropdown).selectByVisibleText(insName);
			Log.info("After Selecting a value from Institution Dropdown");			
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING A VALUE FROM INSTITUTION DROPDOWN:::"+"\n selectInstitution()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Select a value from Year Of Completion Dropdown
	 * @author Senthil
	 * @param  yoc  "2005" 
	 * @throws Exception 
	 * 
	 */	
	public void selectYearOfCompletion(String yoc) throws Exception{
		Log.info("Before Selecting a value from Year Of Completion Dropdown");
		try{
			verifyYearOfCompletionDropdown();
			new Select((WebElement) yearOfCompletionDropdown).selectByVisibleText(yoc);
			Log.info("After Selecting a value from Year Of Completion Dropdown");			
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING A VALUE FROM YEAR OF COMPLETION DROPDOWN:::"+"\n selectYearOfCompletion()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to click on Complete MyProfile Button
	 * @author Senthil
	 * @return void 
	 * @throws Exception 
	 * 
	 */	
	public void clickOnCompleteMyProfileButton() throws Exception{
		Log.info("Before clicking on Complete MyProfile Button");
		try{
			verifyCompleteMyProfileButton();
			uiDriver.findElement(completeMyProfileButton).click();
			Log.info("After clicking on Complete MyProfile Button");			
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON COMPLETE MY PROFILE BUTTON:::"+"\n  clickOnCompleteMyProfileButton()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to verify IT Skills Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyITSkillsSection(){
		flag = uiDriver.findElement(itSkills).isDisplayed();
		Assert.assertTrue(flag, "IT Skills Section is not displayed");
		return flag;
	}
	
	
	
	
	
	
	

}
