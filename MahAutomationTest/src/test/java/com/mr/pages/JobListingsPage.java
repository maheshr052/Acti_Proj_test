package com.mr.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JobListingsPage {
	
	WebDriver uiDriver;
	
	public JobListingsPage(WebDriver driver){
		this.uiDriver = driver; 
	}
	
	/* UI Elements Initialization*/
	By educationRequirementsUG= By.xpath("//div[@itemprop='educationRequirements']/p[1]/span");
	By applyOnCompanyWebsite = By.xpath("//div[@class='sumAct']//button[contains(.,'Apply on Company Website')]");
	By loginToApply = By.xpath("//div[@class='sumAct']/button[@class='loginBtn']");
	By registerAndApply = By.xpath("//div[@class='sumAct']/button[@id='trigAAR']");
	By industryIT = By.xpath("//div[@class='jDisc mt20']/p[2]//a[1]");
	By industrySoftware = By.xpath("//div[@class='jDisc mt20']/p[2]//a[2]");
	By educationRequirementsPG= By.xpath("//div[@itemprop='educationRequirements']/p[2]/span");
	
	
	
	/*Variables Initialization*/
	boolean flag = false;
	
    public void switchToNewWindow() throws InterruptedException{
		
		Set<String>windowNames = uiDriver.getWindowHandles();
		for(String winName: windowNames){
			Thread.sleep(3000);
			uiDriver.switchTo().window(winName);
		}
	}
	public boolean verifyEducationRequirementsUG(){
		flag = uiDriver.findElement(educationRequirementsUG).isDisplayed();
		Assert.assertTrue(flag, "Education Requirements is not displayed");
		return flag;
	}
	
	public void verifyEducationSelectedUG(String eduSel){
		verifyEducationRequirementsUG();
		String education = uiDriver.findElement(educationRequirementsUG).getText().trim();
		System.out.println(education);
		if(education.contains(eduSel)){
			System.out.println("Selected Education matches with the displayed Education");
		}else{
			System.out.println("Selected Education doesnot match with the displayed Education");
		}
		
	}
	
	public boolean verifyEmployerTypeCompanyJobs(){
		flag = uiDriver.findElement(applyOnCompanyWebsite).isDisplayed();
		Assert.assertTrue(flag, "Employer type CompanyJobs selected doesnot matches with the displayed value");
		System.out.println("Employer type CompanyJobs selected is verified");
		return flag;
		
	}
	
	public boolean verifyLoginToApplyButton(){
		flag = uiDriver.findElement(loginToApply).isDisplayed();
		Assert.assertTrue(flag, "LoginToApply button is not displayed");
		return flag;
		
	}
	
	public boolean verifyRegisterAndApplyButton(){
		flag = uiDriver.findElement(registerAndApply).isDisplayed();
		Assert.assertTrue(flag, "RegisterAndApply button is not displayed");
		return flag;
		
	}
	
	public void verifyEmployerTypeConsultant(){
		boolean flag1 = verifyLoginToApplyButton();
		boolean flag2 = verifyRegisterAndApplyButton();
		if(flag1 && flag2){
			System.out.println("Employer type ConsultantJobs selected matches with the displayed value");			
		}else{
			System.out.println("Employer type ConsultantJobs selected doesnot matches with the displayed value");
		}
	}
	
	public void verifyIndustryType(String industryTypeSelected){
		String indusType1 = uiDriver.findElement(industryIT).getText().trim();
		String indusType2 = uiDriver.findElement(industrySoftware).getText().trim();
		if((industryTypeSelected.contains(indusType1)) && (industryTypeSelected.contains(indusType2)) ){
			System.out.println("Industry type selected matches with the displayed value");			
		}else{
			System.out.println("Industry type selected doesnot match with the displayed value");
		}
	}
	
	public boolean verifyEducationRequirementsPG(){
		flag = uiDriver.findElement(educationRequirementsPG).isDisplayed();
		Assert.assertTrue(flag, "Education Requirements is not displayed");
		return flag;
	}
	
	public void verifyEducationSelectedPG(String eduSel){
		verifyEducationRequirementsPG();
		String education = uiDriver.findElement(educationRequirementsPG).getText().trim();
		//System.out.println(education);
		if(education.contains(eduSel)){
			System.out.println("Selected Education matches with the displayed Education");
		}else{
			System.out.println("Selected Education doesnot match with the displayed Education");
		}
		
	}
    
	public void closeWindow(){
		uiDriver.close();
	}
}
