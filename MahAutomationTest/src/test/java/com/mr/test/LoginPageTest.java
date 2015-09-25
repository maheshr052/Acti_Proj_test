package com.mr.test;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.thoughtworks.selenium.webdriven.commands.Click;

public class LoginPageTest
{

	public static final String login="//div[@class='headGNBWrap']//li//a[@title='Jobseeker Login']";
	public static final String email="//a[@id='eSel']";
	public static final String user="//a[@id='uSel']";
	public static final String emailid="//div[@id='eRow']//input[@id='eLogin']";
	public static final String password="pLogin";
	public static final String forgotpassword="//form[@id='lgnFrm']//div[6]//a";
	public static final String loginbutton="//form[@id='lgnFrm']//div[7]//button";
	public static final String registernow="//form[@id='lgnFrm']//div[8]//a";
	public static final String close="closeLB";
	public static final String expectedtext=".//*[@id='loginLB']/div[1]/div";
	public static final String mynaukri="//div[@id='mainHeader']/div/div/ul[2]/li[2]/a";
	public static final String logout="//a[@class='logout']";
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		/*super.setUp();*/
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
	}
	
	@Test(enabled=true,priority=0)
	
	public void JobSeekerLogin() throws InterruptedException{
		
		WebElement Login=driver.findElement(By.xpath(login));
		Login.click();
		Thread.sleep(3000);
		WebElement JobSeeker=driver.findElement(By.xpath(expectedtext));
		Thread.sleep(3000);
		String Actual="Jobseeker Login".toLowerCase().trim();
		String JobseekerExpected=JobSeeker.getText().toLowerCase().trim();
		System.out.println(JobseekerExpected);
		Assert.assertEquals(Actual, JobseekerExpected, "Job Seeker Login Page is not displayed");
		closeWindow();
		}
	@Test(enabled=true,priority=1)
	public void JobSeekerLoginPopup() throws InterruptedException
	{
		WebElement Login=driver.findElement(By.xpath(login));
		Login.click();
		Thread.sleep(3000);
	WebElement Email=driver.findElement(By.xpath(email));
	Thread.sleep(4000);
	boolean Emailflag=Email.isDisplayed();
	Assert.assertTrue(Emailflag, "Email is not displayed");
	
	WebElement User=driver.findElement(By.xpath(user));
	boolean Userflag=User.isDisplayed();
	Assert.assertTrue(Userflag,"User is not displayed");
	
	WebElement EmailId=driver.findElement(By.xpath(emailid));
	Thread.sleep(2000);
	boolean EmailIdflag=EmailId.isDisplayed();
	Assert.assertTrue(EmailIdflag, "Email Id Filed is not displayed");
	String EmailIdAttribute=EmailId.getAttribute("placeholder");
	System.out.println(EmailIdAttribute);
	String EmailIdAttributeExpected="Enter your active Email ID";
	Assert.assertEquals(EmailIdAttribute, EmailIdAttributeExpected, "Email Id is not present");
	
	WebElement Password=driver.findElement(By.id(password));
	boolean Passwordflag=Password.isDisplayed();
	Assert.assertTrue(Passwordflag, "Password Fiedl is not present");
	String PasswordAttribute=Password.getAttribute("placeholder");
	System.out.println(PasswordAttribute);
	String PasswordExpected="Enter your password";
	Assert.assertEquals(PasswordAttribute, PasswordExpected, "Password is not present");
	
	WebElement ForgotPassword=driver.findElement(By.xpath(forgotpassword));
	boolean ForgotPasswordflag=ForgotPassword.isDisplayed();
	Assert.assertTrue(ForgotPasswordflag, "Forgot Pasword is not displayed");
	
	WebElement Loginbutton=driver.findElement(By.xpath(loginbutton));
	boolean Loginbuttonflag=Loginbutton.isDisplayed();
	Assert.assertTrue(Loginbuttonflag, "Login button is not displayed");
	
	
	WebElement RegisterNow=driver.findElement(By.xpath(registernow));
	boolean RegisterNowflag=RegisterNow.isDisplayed();
	Assert.assertTrue(RegisterNowflag, "Register Now is not displayed");
	
	WebElement Close=driver.findElement(By.id(close));
	boolean Closefalg=Close.isDisplayed();
	Assert.assertTrue(Closefalg, "Close button is not displayed");
	closeWindow();
	}
	
	@Test(enabled=true,priority=2)
	public void InvalidLogin() throws InterruptedException {
		
		WebElement Login=driver.findElement(By.xpath(login));
		if (Login.isDisplayed()) {
			Login.click();
			Thread.sleep(4000);
		}
		Thread.sleep(3000);
		WebElement EmailId=driver.findElement(By.xpath(emailid));
		EmailId.sendKeys("xyz@gg.com");
		
		WebElement Password=driver.findElement(By.id(password));
		Password.sendKeys("udisandi2368769");  
		
		WebElement Loginbutton=driver.findElement(By.xpath(loginbutton));
		Loginbutton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement error=driver.findElement(By.xpath("//i[@id='fLogin_err']"));
		String ActualText=error.getText().trim();
		System.out.println(ActualText);
		String ExpectedText="Invalid Details. Please check the EmailID-Password combination.".trim();
		Assert.assertEquals(ActualText, ExpectedText, "Error message is not displayed");
		closeWindow();
		
		}
	@Test(enabled=true,priority=3)
	public void ValidLogin() throws InterruptedException {
		Thread.sleep(4000);
		WebElement Login=driver.findElement(By.xpath(login));
		if (Login.isDisplayed()) {
			Login.click();
			Thread.sleep(4000);
		}
		Thread.sleep(3000);
		WebElement EmailId=driver.findElement(By.xpath(emailid));
		EmailId.sendKeys("uthkarsh.venkat@gmail.com");
		
		WebElement Password=driver.findElement(By.id(password));
		Password.sendKeys("Udisandi2368769@");
		
		WebElement Loginbutton=driver.findElement(By.xpath(loginbutton));
		Loginbutton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(6000);
		logoutact();
		
		String LoginTitle=driver.getTitle().trim();
		String ActualTitle="Mynaukri".trim();
		Assert.assertEquals(ActualTitle, LoginTitle, "Login Page Title is not displayed");
	
		WebElement sitelogo=driver.findElement(By.cssSelector("html body div.lng_wrapper span.logo a img"));
		sitelogo.click();
		
	}
	@Test(enabled=true,priority=4)
	public void Logout() throws InterruptedException{
		Thread.sleep(4000);
		WebElement Login=driver.findElement(By.id("login_Layer"));
		Assert.assertTrue(Login.isEnabled(), "Login button is not displayed on Home page");
		if (Login.isDisplayed()) {
			Login.click();
			Thread.sleep(8000);
		}
		Thread.sleep(6000);
		WebElement EmailId=driver.findElement(By.xpath(emailid));
		EmailId.sendKeys("uthkarsh.venkat@gmail.com");
		
		WebElement Password=driver.findElement(By.id(password));
		Password.sendKeys("Udisandi2368769@");
		
		WebElement Loginbutton=driver.findElement(By.xpath(loginbutton));
		Loginbutton.click();
		Thread.sleep(6000);
		logoutact();
		Thread.sleep(3000);
		WebElement sitelogo=driver.findElement(By.cssSelector("html body div.lng_wrapper span.logo a img"));
		sitelogo.click();
		
		
		}
	
	@Test(enabled=true,priority=5)
	public void LoginUserName() throws InterruptedException {
		Thread.sleep(3000);
		WebElement Login=driver.findElement(By.id("login_Layer"));
		Login.click();
		Thread.sleep(3000);
		WebElement Username=driver.findElement(By.xpath(user));
		Username.click();
		
		WebElement userfield=driver.findElement(By.xpath("//input[@id='uLogin']"));
		userfield.sendKeys("uthkarsh.venkat");
		
		WebElement Password=driver.findElement(By.id(password));
		Password.sendKeys("Udisandi2368769@");
		
		WebElement Loginbutton=driver.findElement(By.xpath(loginbutton));
		Loginbutton.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement InvalidText=driver.findElement(By.xpath("//i[@id='fLogin_err']"));
		String Actual="Invalid Details. Please check the Username-Password combination.".trim();
		String Expected=InvalidText.getText().trim();
		
		Assert.assertEquals(Actual, Expected, "Details are not valid");
		}
	
	
	public void closeWindow() throws InterruptedException{
		
		WebElement element = driver.findElement(By.id("closeLB"));
		if (element.isEnabled()) {
			element.click();
			Thread.sleep(3000);
			}
	}
		public void logoutact() throws InterruptedException
		{
			WebElement Mynaukri=driver.findElement(By.xpath(mynaukri));
			WebElement Logout=driver.findElement(By.xpath(logout));
			Actions action=new Actions(driver);
			action.moveToElement(Mynaukri).build().perform();
			Logout.click();
			Thread.sleep(3000);
		}
		

	}
	
	



