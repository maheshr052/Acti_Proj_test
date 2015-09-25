package com.mr.test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mr.pages.HomePage;
import com.mr.pages.JobSeekerLoginPage;
import com.mr.pages.LoginNaukriPage;
import com.mr.pages.MyNaukriPage;
import com.mr.util.BaseTestObject;

public class ReddyTest extends BaseTestObject
{
	boolean flag=false;

	public HomePage objHomePage;
	public JobSeekerLoginPage objJobSeekerLoginPage;
	public MyNaukriPage objMyNaukriPage;
	public LoginNaukriPage objLoginNaukriPage;

	//@Parameters({"browserType","url"})
	@Test
	public void verifyhomesitelogo() throws Exception
	{
		objHomePage=new HomePage(uiDriver);
		flag=objHomePage.verifySiteLogo();
		Assert.assertTrue(flag,"Sitelogo is not displayed");
		objJobSeekerLoginPage=objHomePage.clickOnLoginbutton();
		objJobSeekerLoginPage.username("@gmail.com");
		objJobSeekerLoginPage.password("");
		objMyNaukriPage=objJobSeekerLoginPage.loginButton();
		objLoginNaukriPage=objMyNaukriPage.verifyMyNaukriLinkAndClickOnLogOut();
		objHomePage=objLoginNaukriPage.clickOnSiteLogo();
		
	}
	
}
