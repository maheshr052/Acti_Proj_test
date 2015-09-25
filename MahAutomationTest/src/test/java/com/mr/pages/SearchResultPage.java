package com.mr.pages;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mr.common.NKConstants;

public class SearchResultPage {
	
	WebDriver uiDriver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/*UI Elements Initialization*/
	By naukriLogo = By.xpath("//a[@class='nLogo fl']");
	By headerIcons = By.xpath("//span[contains(@class,'topIcon jobs')]");
	By tabs = By.xpath("//div[@class='topBand']//ul[@class='tabs']/li");
	By employerZoneLink = By.xpath("//a[contains(.,'Employer Zone')]");
	By buyOnlineLink = By.xpath("//a[(@class='immediate') and contains(.,'Buy Online')]");
	By searchResultHead = By.xpath("//div[@class='row srp_head']");
	By searchResultBody = By.xpath("//div[contains(@id,'15')]");
	By advancedSearchLink = By.xpath("//div[@class='advnLink']/a[contains(.,'Advanced Search')]");
	By refineSection = By.xpath("//div[@class='refine']");
	By recentSearchSection = By.xpath("//div[@class='wgtCont recentSearches dspN']");
	By registerNowForm = By.xpath("//form[@id='formpZero']");
	By naukriServices = By.xpath("//div [@id='right_ff_adpos']");
	By submitButton = By.xpath("//button[@id='clstr_btn']");
	By getJobsInbox = By.xpath("//form[@id='frmSSA']");
	By footerSection = By.xpath("//div[@class='footer anchorList']");
	By partnerSection = By.xpath("//div[@class='footer carousel']");
	By disclaimer = By.xpath("//div[contains(.,'All rights reserved @ 2015 Info Edge (India) Ltd.')]");
	By fressnessSection = By.xpath("//h2[contains(.,'Freshness')]");
	By location = By.xpath("//h3[contains(.,'Location')]");
	By industry = By.xpath("//h3[contains(.,'Industry')]");
	By salary = By.xpath("//h3[contains(.,'Salary')]");
	By education = By.xpath("//h3[contains(.,'Education')]");
	By employerType = By.xpath("//h3[contains(.,'Employer Type')]");
	By freshnessArrow = By.xpath("//div[@id='fresh_dd']//input[@class='sdTxt w85']");
	By freshnessDD = By.xpath("//div[@id='fresh_dd']//div[@class='sDrop']//ul");
	By freshnessUptoSelected = By.xpath("//li[contains(.,'Last 15 Days')]");
	By dates = By.xpath("//span[@class='date']");
	By locationDD = By.xpath("//a[@name='qcl[]']");
	By locationMoreLink = By.xpath("//span[(contains(.,'more') and (@head='Location'))]");
	By moreLocationsForm = By.xpath("//div[@class='ltCont']/div[@id='cluster']");
	By locationListHeader = By.xpath("//div[(@class='ltGlobalHd') and contains(.,'Location')]");
	By refineButton = By.xpath("//button[@id='clstr_refine']");
	//By locationClose = By.xpath("//a[@id='closeClstr']");
	By locationsCheckBoxes = By.xpath("//div[@id='clstr_Location']//a");
	By locPune = By.xpath("//div[@id='clstr_Location']//a[contains(.,'Pune')]");
	By locationContents = By.xpath("//span[@class='loc']/span");
	By industryDD = By.xpath("//a[@name='qci[]']");
	By salaryDD = By.xpath("//a[@name='qctc[]']");
	By salaryMoreLink = By.xpath("//span[(contains(.,'more') and (@head='Salary'))]");
	By moreSalaryForm = By.xpath("//div[@class='ltCont']/div[@id='cluster']");
	By salaryListHeader = By.xpath("//div[(@class='ltGlobalHd') and contains(.,'Salary')]");
	//By salaryRefineButton = By.xpath("//button[@id='clstr_refine']");
	//By salaryClose = By.xpath("//a[@id='closeClstr']");
	By salaryCheckBoxes = By.xpath("//div[@id='clstr_Salary']//a");
	By salaryRange = By.xpath("//div[@id='clstr_Salary']//a[contains(.,'0-3 Lakhs')]");
	By salaryContents = By.xpath("//span[@itemprop='baseSalary']");
	By educationDropDown = By.xpath("//div[@class='acord_cont open']/a");
	By educationDDBTech = By.xpath("//div[@class='acord_cont open']/a[contains(.,'B.Tech/ B.E.')]");
	By educationMoreLink = By.xpath("//span[(contains(.,'more') and (@head='Education'))]");
	By moreEducationForm = By.xpath("//div[@class='ltCont']/div[@id='cluster']");
	By educationListHeader = By.xpath("//div[(@class='ltGlobalHd') and contains(.,'Education')]");
	//By educationRefineButton = By.xpath("//button[@id='clstr_refine']");
	By morePopUpClose = By.xpath("//a[@id='closeClstr']");
	By educationCheckBoxes = By.xpath("//div[@id='clstr_Education']//a");
	By employerTypeDropDown = By.xpath("//div[@class='acord_cont open']/a[@name='qck[]']");
	//By employerTypeDDContents = By.xpath("//div[@class='acord_cont open']/a[@name='qck[]']");
	By jobCount = By.xpath("//span[@class='cnt']");
	By skillsAutoBox = By.xpath("//div[@id='skill']//div[@class='inpWrap']/input[@class='sugInp']");
	By skillsDisplayed = By.xpath("//span[@class='frst']");
	By detailedViewIcon = By.xpath("//span[@title='Detailed View']");
	By listViewIcon = By.xpath("//span[@title='Listing View']");
	By sortByDropdown = By.xpath("//div[@class='sortBy']");
	By sortByArrow = By.xpath("//div[@class='sortBy']//em[@class='downArrow']");
	By defaultSelectedDDItem = By.xpath("//span[@class='dropText']");
	By sortByDate = By.xpath("//li[contains(.,'Date')]");
	By sortByRelevance = By.xpath("//li[contains(.,'Relevance')]");
	By designation = By.xpath("//span[@class='desig']");
	By jobTypes = By.xpath("//span[contains(@class,'action jobType')]");
	By organization = By.xpath("//span[@class='org']");
	By experienceRequirement = By.xpath("//span[@itemprop='experienceRequirements']");
	By jobLocation = By.xpath("//span[@itemprop='jobLocation']");
	By skills = By.xpath("//span[@class='skill']");
	By otherDetails = By.xpath("//div[@class='other_details']");
	By saveJobs = By.xpath("//span[@title=' Save this job ']");
	By salaryDisplayed = By.xpath("//span[@itemprop ='baseSalary']");
	By recruitDetails = By.xpath("//div[@class='rec_details']");
	By nameYourSearch = By.xpath("//form[@id='frmSSA']//div[@class='field searchName']");
	By emailID = By.xpath("//form[@id='frmSSA']//div[@class='field email']");
	By saveButton = By.xpath("//form[@id='frmSSA']//input[@value='Save']");
	By searchBody = By.xpath("//a[@class='content']");
	By srchTitle = By.xpath("//a[@class='content']/span[1]");
	By hiringOrg = By.xpath("//span[@itemprop='hiringOrganization']");
	By jobTitle = By.xpath("//a[@class='content']/span[1]");
	By keyskills = By.xpath("//spn[@class='skill']");
	By jobDescription = By.xpath("//span[@class='desc']");
	By jobTypeSection = By.xpath("//h3[contains(.,'Job Type')]");
	By walkInJobTypeCheckbox = By.xpath("//a[contains(.,'Walkin Jobs')]");           //By.xpath("//a[@name='qcjt[]']"); 
	By companyJobscheckbox = By.xpath("//div[@class='acord_cont open']/a[contains(.,'Company Jobs')]");
	By consultantJobsCheckbox = By.xpath("//div[@class='acord_cont open']/a[contains(.,'Consultant Jobs')]");
	By softwareServicesIndustryCheckbox = By.xpath("//div[@class='acord_cont open']/a[contains(.,'IT-Software /  Software Services')]");
	By freshnessValue = By.xpath("//div[@class='dWrap']//input[@id='fresh_ddHid']");
	By jobLocationDisplayed = By.xpath("//span[@itemprop = 'jobLocation']");
	By locationBangalore = By.xpath("//a[(@name = 'qcl[]') and contains(.,'Bangalore')]");
	By itServicesIndustryPopUpcheckbox = By.xpath("//div[@class='acord_cont colCount_two multiColumn']/a[contains(.,'IT-Software /  Software Services')]");
	By industryMoreLink = By.xpath("//span[(@name='qci[]') and contains(.,'more')]");
	By morePopUpHeader = By.xpath("//div[@id='cluster']//div[@class='ltGlobalTtl']");
	By educationMCAPopUpCheckbox = By.xpath("//div[@class='acord_cont colCount_two multiColumn']/a[contains(.,'MCA')]");
	By salaryRangeSelected = By.xpath("//div[@class='acord_cont open']/a[1]");
	By salaryMorePopUpRange = By.xpath("//div[@class='acord_cont colCount_two multiColumn']/a[1]");
	By locationSelected = By.xpath("//a[contains(.,'Pune')]");
	
	
	
	public SearchResultPage(WebDriver driver){
		this.uiDriver = driver;
	}
	
	
	/*Variable Initialization*/
	boolean flag = false;
	
	public void switchToParentWindow(String winName){
		uiDriver.switchTo().window(winName);
	}
	
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
	public void verifyHeaderIcons(){
		boolean flag = false;
		List<WebElement> headerIcon = uiDriver.findElements(headerIcons);
		int countIcons = 0;
		String iconsArray[] = {"jobs","jobs Recr","jobs Comp","jobs Serv","jobs More","jobs Login"};
		for(WebElement icon:headerIcon ){
			String iconName = icon.getAttribute("class");
			if(iconName.contains(iconsArray[countIcons])){
				flag = true;
			}else{
				flag = false;
			    break;
			}
			countIcons++;			
		}
		Assert.assertTrue(flag, "Expected Header Icons are not displayed");
		
		
	}
	
	/**This method will help us to verify Tabs
	 * @author Senthil
	 * @return flag
	 */
	public void verifyTabs(){
		boolean flag = false;
		List<WebElement> tabsDisplayed = uiDriver.findElements(tabs);
		int countTabs = 0;
		String tabsArray[] = {"All Jobs","IIT/IIM Jobs","Govt. Jobs","International Jobs"};
		for(WebElement tab:tabsDisplayed ){
			String tabName = tab.getText().trim();
			if(tabName.equals(tabsArray[countTabs])){
				flag = true;
			}else{
				flag = false;
				break;
			}
			countTabs++;			
		}
		Assert.assertTrue(flag, "Expected Tabs are not displayed");
		
	}
	
	/**This method will help us to verify EmployerZone link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmployerZoneLink(){
		flag = uiDriver.findElement(employerZoneLink).isDisplayed();
		Assert.assertTrue(flag, "EmployerZone link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Buy Online link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyBuyOnlineLink(){
		flag = uiDriver.findElement(buyOnlineLink).isDisplayed();
		Assert.assertTrue(flag, "Buy Online link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Search Result Head
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySearchResultHead(){
		flag = uiDriver.findElement(searchResultHead).isDisplayed();
		Assert.assertTrue(flag, "Search Result Head is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Search Result Head
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationSelected(){
		flag = uiDriver.findElement(locationSelected).isDisplayed();
		Assert.assertTrue(flag, "Location Selected is not displayed");
		return flag;
	}
	
	
	
	/**This method will help us to verify Search Result Body
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySearchResultBody(){
		flag = uiDriver.findElement(searchResultBody).isDisplayed();
		Assert.assertTrue(flag, "Search Result Body is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Advanced Search Link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyAdvancedSearchLink(){
		flag = uiDriver.findElement(advancedSearchLink).isDisplayed();
		Assert.assertTrue(flag, "Advanced Search Link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Refine Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRefineSection(){
		flag = uiDriver.findElement(refineSection).isDisplayed();
		Assert.assertTrue(flag, "Refine Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Recent Search Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRecentSearchSection(){
		flag = uiDriver.findElement(recentSearchSection).isDisplayed();
		Assert.assertTrue(flag, "Recent Search Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify RegisterNow Form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRegisterNowForm(){
		flag = uiDriver.findElement(registerNowForm).isDisplayed();
		Assert.assertTrue(flag, "RegisterNow Form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Naukri Services
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNaukriServices(){
		flag = uiDriver.findElement(naukriServices).isDisplayed();
		Assert.assertTrue(flag, "Naukri Services section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Submit Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySubmitButton(){
		flag = uiDriver.findElement(submitButton).isDisplayed();
		Assert.assertTrue(flag, "Submit Button is not displayed");
		return flag;
	}
	
	public void getJobsInboxDisplayed(){
		Actions action = new Actions(uiDriver);
		action.moveToElement(uiDriver.findElement(submitButton)).build().perform();
		verifyGetJobsInbox();
		
	}
	
	/**This method will help us to verify GetJobs Inbox form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyGetJobsInbox(){
		flag = uiDriver.findElement(getJobsInbox).isDisplayed();
		Assert.assertTrue(flag, "GetJobs Inbox form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Footer Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFooterSection(){
		flag = uiDriver.findElement(footerSection).isDisplayed();
		Assert.assertTrue(flag, "Footer Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Partner Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPartnerSection(){
		flag = uiDriver.findElement(partnerSection).isDisplayed();
		Assert.assertTrue(flag, "Partner Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Disclaimer
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDisclaimer(){
		flag = uiDriver.findElement(disclaimer).isDisplayed();
		Assert.assertTrue(flag, "Disclaimer is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Fressness Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyfressnessSection(){
		flag = uiDriver.findElement(fressnessSection).isDisplayed();
		Assert.assertTrue(flag, "Fressness Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationSection(){
		flag = uiDriver.findElement(location).isDisplayed();
		Assert.assertTrue(flag, "Location Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Industry Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIndustrySection(){
		flag = uiDriver.findElement(industry).isDisplayed();
		Assert.assertTrue(flag, "Industry Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalarySection(){
		flag = uiDriver.findElement(salary).isDisplayed();
		Assert.assertTrue(flag, "Salary Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationSection(){
		flag = uiDriver.findElement(education).isDisplayed();
		Assert.assertTrue(flag, "Education Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify EmployerType Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmployerTypeSection(){
		flag = uiDriver.findElement(employerType).isDisplayed();
		Assert.assertTrue(flag, "EmployerType Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Fressness
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFressnessArrow(){
		flag = uiDriver.findElement(freshnessArrow).isDisplayed();
		Assert.assertTrue(flag, "Fressness Arrow is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Freshness Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFressnessDropdown(){
		flag = uiDriver.findElement(freshnessDD).isDisplayed();
		Assert.assertTrue(flag, "Freshness Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Freshness Dropdown Contents
	 * @author Senthil
	 * @return flag
	 */
	public void verifyFressnessDropdownContents(){
		boolean flag1 = false;
		String fressArray[] = {"Select","Last 30 Days","Last 15 Days","Last 7 Days","Last 3 Days","Last 1 Day"};
		String fressnesstext = uiDriver.findElement(freshnessDD).getText();
		System.out.println("Freshness text ::"+fressnesstext);
		if((fressnesstext.contains(fressArray[0])) && (fressnesstext.contains(fressArray[1])) && (fressnesstext.contains(fressArray[2])) && (fressnesstext.contains(fressArray[3])) && ( fressnesstext.contains(fressArray[4])) && (fressnesstext.contains(fressArray[5]))){
			flag1 = true;						
		}else{
			flag1 = false;
			
		}
		Assert.assertTrue(flag1, "Expected contents are not displayed in the Fressness Dropdown");
	
	}
	
	/**This method will help us to verify Fressness Upto Selected
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFressnessSelected(){
		flag = uiDriver.findElement(freshnessUptoSelected).isDisplayed();
		Assert.assertTrue(flag, "Fressness Selected is not displayed");
		return flag;
	}
	
	/**This method will help us to verify dates
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDates(){
		flag = uiDriver.findElement(dates).isDisplayed();
		Assert.assertTrue(flag, "Dates are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationDropdown(){
		flag = uiDriver.findElement(locationDD).isDisplayed();
		Assert.assertTrue(flag, "Location dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location MoreLink
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationMoreLink(){
		flag = uiDriver.findElement(locationMoreLink).isDisplayed();
		Assert.assertTrue(flag, "Location MoreLink is not displayed");
		return flag;
	}
	
	/**This method will help us to verify More Locations Form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMoreLocationsForm(){
		flag = uiDriver.findElement(moreLocationsForm).isDisplayed();
		Assert.assertTrue(flag, "More Locations Form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location List Header
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationListHeader(){
		flag = uiDriver.findElement(locationListHeader).isDisplayed();
		Assert.assertTrue(flag, "Location List Header is not displayed");
		return flag;
	}
	
	/**This method will help us to verify PopUp Refine Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPopUpRefineButton(){
		flag = uiDriver.findElement(refineButton).isDisplayed();
		Assert.assertTrue(flag, "Refine Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify More PopUp Close
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMorePopUpClose(){
		flag = uiDriver.findElement(morePopUpClose).isDisplayed();
		Assert.assertTrue(flag, "More PopUp Close is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location CheckBoxes
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationCheckBoxes(){
		boolean flag = false;
		List<WebElement> locationcheckBoxes =  uiDriver.findElements(locationsCheckBoxes);
		for(WebElement chkBox : locationcheckBoxes){
			if(chkBox.isDisplayed()){
				flag = true;
			}else{
				flag = false;
			}
		}
		Assert.assertTrue(flag, "Location CheckBoxes are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Pune
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationPune(){
		flag = uiDriver.findElement(locPune).isDisplayed();
		Assert.assertTrue(flag, "Location Pune is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Bangalore
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationBangalore(){
		flag = uiDriver.findElement(locationBangalore).isDisplayed();
		Assert.assertTrue(flag, "Location Bangalore is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Contents
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationContents(){
		flag = uiDriver.findElements(locationContents).isEmpty();
		Assert.assertFalse(flag, "Location Contents are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Industry Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIndustryDD(){
		flag = uiDriver.findElement(industryDD).isDisplayed();
		Assert.assertTrue(flag, "Industry Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Industry More link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIndustryMoreLink(){
		flag = uiDriver.findElement(industryMoreLink).isDisplayed();
		Assert.assertTrue(flag, "Industry More link is not displayed");
		return flag;
	}
	
	
	/**This method will help us to verify Salary Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryDD(){
		flag = uiDriver.findElement(salaryDD).isDisplayed();
		Assert.assertTrue(flag, "Salary Dropdown is not displayed");
		return flag;
	}
	
	
	
	/**This method will help us to verify Salary More PopUp Range
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryMorePopUpRange(){
		flag = uiDriver.findElement(salaryMorePopUpRange).isDisplayed();
		Assert.assertTrue(flag, "Salary More PopUp Range is not displayed");
		return flag;
	}
	
	
	/**This method will help us to verify Salary MoreLink
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryMoreLink(){
		flag = uiDriver.findElement(salaryMoreLink).isDisplayed();
		Assert.assertTrue(flag, "Salary MoreLink is not displayed");
		return flag;
	}
	
	/**This method will help us to verify More Salary Form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMoreSalaryForm(){
		flag = uiDriver.findElement(moreSalaryForm).isDisplayed();
		Assert.assertTrue(flag, "More Salary Form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary List Header
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryListHeader(){
		flag = uiDriver.findElement(salaryListHeader).isDisplayed();
		Assert.assertTrue(flag, "Salary List Header is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Refine Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryRefineButton(){
		flag = uiDriver.findElement(refineButton).isDisplayed();
		Assert.assertTrue(flag, "Salary Refine Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Close(X)
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryClose(){
		flag = uiDriver.findElement(morePopUpClose).isDisplayed();
		Assert.assertTrue(flag, "Salary Close(X) is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary CheckBoxes
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryCheckBoxes(){
		flag = uiDriver.findElements(salaryCheckBoxes).isEmpty();
		Assert.assertFalse(flag, "Salary CheckBoxes are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Range
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryRange(){
		flag = uiDriver.findElement(salaryRange).isDisplayed();
		Assert.assertTrue(flag, "Salary Range is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Contents
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryContents(){
		flag = uiDriver.findElements(salaryContents).isEmpty();
		Assert.assertFalse(flag, "Salary Contents are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education DropDown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationDD(){
		flag = uiDriver.findElement(educationDropDown).isDisplayed();
		Assert.assertTrue(flag, "Education DropDown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education Dropdown Contents
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationDDContents(){
		flag = uiDriver.findElements(educationDropDown).isEmpty();
		Assert.assertFalse(flag, "Education Dropdown are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education MoreLink
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationMoreLink(){
		flag = uiDriver.findElement(educationMoreLink).isDisplayed();
		Assert.assertTrue(flag, "Education MoreLink is not displayed");
		return flag;
	}
	
	/**This method will help us to verify More Education Form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMoreEducationForm(){
		flag = uiDriver.findElement(moreEducationForm).isDisplayed();
		Assert.assertTrue(flag, "More Education Form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education List Header
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationListHeader(){
		flag = uiDriver.findElement(educationListHeader).isDisplayed();
		Assert.assertTrue(flag, "Education List Header is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education Refine Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationRefineButton(){
		flag = uiDriver.findElement(refineButton).isDisplayed();
		Assert.assertTrue(flag, "Education Refine Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education Close(X)
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationClose(){
		flag = uiDriver.findElement(morePopUpClose).isDisplayed();
		Assert.assertTrue(flag, "Education Close(X) is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Education CheckBoxes
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEducationCheckBoxes(){
		flag = uiDriver.findElements(educationCheckBoxes).isEmpty();
		Assert.assertFalse(flag, "Education CheckBoxes are not displayed");
		return flag;
	}
	
	/**This method will help us to verify Employer Type DropDown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmployerTypeDD(){
		flag = uiDriver.findElement(employerTypeDropDown).isDisplayed();
		Assert.assertTrue(flag, "Employer Type DropDown is not displayed");
		return flag;
	}
	
	
	
	/**This method will help us to verify More PopUp Header
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMorePopUpHeader(){
		flag = uiDriver.findElement(morePopUpHeader).isDisplayed();
		Assert.assertTrue(flag, "More PopUp Header is displayed");
		return flag;
	}
	
	/**This method will help us to Get More PopUp Header title
	 * @author Senthil
	 * @return flag
	 */
	public String getMorePopUpHeaderTitle(){
		verifyMorePopUpHeader();
		String popUpTitle = uiDriver.findElement(morePopUpHeader).getText().trim();
		return popUpTitle;
		
	}
	
	/**This method will help us to Verify PopUp Header title
	 * @author Senthil
	 * @return flag
	 */
	public void verifyPopUpHeaderTitle(String titleDisplayed,String titleExpected){
		Assert.assertEquals(titleDisplayed, titleExpected, "The PopUp Titles doesnot match");
	}
	
	
		
	/**This method will help us to verify Job Count
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobCount(){
		flag = uiDriver.findElement(jobCount).isDisplayed();
		Assert.assertTrue(flag, "Job Count is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills Auto Suggest Box
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkillsAutoBox(){
		flag = uiDriver.findElement(skillsAutoBox).isDisplayed();
		Assert.assertTrue(flag, "Skills Auto Suggest Box is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills Displayed
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyskillsDisplayed(){
		flag = uiDriver.findElement(skillsDisplayed).isDisplayed();
		Assert.assertTrue(flag, "Skills Displayed is not displayed");
		return flag;
	}
	
	/**This method will help us to verify DetailedView Icon
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDetailedViewIcon(){
		flag = uiDriver.findElement(detailedViewIcon).isDisplayed();
		Assert.assertTrue(flag, "DetailedView Icon is not displayed");
		return flag;
	}
	
	/**This method will help us to verify ListView Icon
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyListViewIcon(){
		flag = uiDriver.findElement(listViewIcon).isDisplayed();
		Assert.assertTrue(flag, "ListView Icon is not displayed");
		return flag;
	}
	
	/**This method will help us to verify SortBy Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySortByDropdown(){
		flag = uiDriver.findElement(sortByDropdown).isDisplayed();
		Assert.assertTrue(flag, "SortBy Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify SortBy Arrow
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySortByArrow(){
		flag = uiDriver.findElement(sortByArrow).isDisplayed();
		Assert.assertTrue(flag, "SortBy Arrow is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Default Selected Dropdown Item
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDefaultSelectedDDItem(){
		flag = uiDriver.findElement(defaultSelectedDDItem).isDisplayed();
		Assert.assertTrue(flag, "Default Selected Dropdown Item is not displayed");
		return flag;
	}
	
	/**This method will help us to verify SortBy Date
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySortByDate(){
		flag = uiDriver.findElement(sortByDate).isDisplayed();
		Assert.assertTrue(flag, "SortBy Date is not displayed");
		return flag;
	}
	
	/**This method will help us to verify SortBy Relevance
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySortByRelevance(){
		flag = uiDriver.findElement(sortByRelevance).isDisplayed();
		Assert.assertTrue(flag, "SortBy Relevance is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Designation
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDesignation(){
		flag = uiDriver.findElement(designation).isDisplayed();
		Assert.assertTrue(flag, "Designation is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Job Types
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobTypes(){
		flag = uiDriver.findElements(jobTypes).isEmpty();
		Assert.assertFalse(flag, "Job Types is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Organization
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyOrganization(){
		flag = uiDriver.findElement(jobTypes).isDisplayed();
		Assert.assertTrue(flag, "Job Types is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Experience Requirement
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyExperienceRequirement(){
		flag = uiDriver.findElement(experienceRequirement).isDisplayed();
		Assert.assertTrue(flag, "Experience Requirement is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Job Location
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobLocation(){
		flag = uiDriver.findElements(jobLocation).isEmpty();
		Assert.assertFalse(flag, "Job Location is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkills(){
		flag = uiDriver.findElements(skills).isEmpty();
		Assert.assertFalse(flag, "Skills is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Other Details
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyOthDetails(){
		flag = uiDriver.findElement(otherDetails).isDisplayed();
		Assert.assertTrue(flag, "Other Details is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Save Jobs option
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySaveJobs(){
		flag = uiDriver.findElements(saveJobs).isEmpty();
		Assert.assertFalse(flag, "Save Jobs option is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Range
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryRangeDisplayed(){
		flag = uiDriver.findElement(salaryDisplayed).isDisplayed();
		Assert.assertTrue(flag, "Salary Range is not displayed in Search result section");
		return flag;
	}
	
	/**This method will help us to verify Recruit Details
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRecruitDetails(){
		flag = uiDriver.findElements(recruitDetails).isEmpty();
		Assert.assertFalse(flag, "Recruit Details is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Name Your Search field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNameYourSearch(){
		flag = uiDriver.findElement(nameYourSearch).isDisplayed();
		Assert.assertTrue(flag, "Name Your Search field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify EmailID field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmailID(){
		flag = uiDriver.findElement(emailID).isDisplayed();
		Assert.assertTrue(flag, "EmailID field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Save Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySaveButton(){
		flag = uiDriver.findElement(saveButton).isDisplayed();
		Assert.assertTrue(flag, "Save Button is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify Search Body
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySearchBody(){
		flag = uiDriver.findElement(searchBody).isDisplayed();
		Assert.assertTrue(flag, "Search Body is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify Search Title
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySearchTitle(){
		flag = uiDriver.findElement(srchTitle).isDisplayed();
		Assert.assertTrue(flag, "Search Title is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify Hiring Organization
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyHiringOrg(){
		flag = uiDriver.findElement(hiringOrg).isDisplayed();
		Assert.assertTrue(flag, "Hiring Organization is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify JobType Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobTypeSection(){
		flag = uiDriver.findElement(jobTypeSection).isDisplayed();
		Assert.assertTrue(flag, "JobType Section is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify WalkIn JobType Checkbox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyWalkInJobTypeCheckbox(){
		flag = uiDriver.findElement(walkInJobTypeCheckbox).isDisplayed();
		Assert.assertTrue(flag, "WalkIn JobType Checkbox is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify Salary Range Selected
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryRangeSelectedCheckbox(){
		flag = uiDriver.findElement(salaryRangeSelected).isDisplayed();
		Assert.assertTrue(flag, "Salary Range Selected Checkbox is not displayed");
		return flag;
	}
	
	
	/**This method will help us to Verify ITServices Industry PopUp checkbox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyITServicesIndustryPopUpcheckbox(){
		flag = uiDriver.findElement(itServicesIndustryPopUpcheckbox).isDisplayed();
		Assert.assertTrue(flag, "ITServices Industry PopUp checkbox is not displayed");
		return flag;
	}
	
	/**This method will help us to Verify Software Services Industry checkbox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySoftwareServicesIndustryCheckbox(){
		flag = uiDriver.findElement(softwareServicesIndustryCheckbox).isDisplayed();
		Assert.assertTrue(flag, "Software Services Industry checkbox is not displayed");
		return flag;
	}
	
	/**This method helps us to verify JobTitle
	 * @author Senthil
	 * @param exp 
	 * @return flag
	 */
	public boolean verifyJobTitle(){
		flag = uiDriver.findElement(jobTitle).isDisplayed();
		Assert.assertTrue(flag, "Job Title is not displayed");
		return flag;
		
	}
	
	/**This method helps us to verify Job Location Displayed
	 * @author Senthil
	 * @param exp 
	 * @return flag
	 */
	public boolean verifyJobLocationDisplayed(){
		flag = uiDriver.findElement(jobLocationDisplayed).isDisplayed();
		Assert.assertTrue(flag, "Job Location is not displayed");
		return flag;
		
	}
	
		
	/**This method helps us to verify JobTitle
	 * @author Senthil
	 * @param exp 
	 * @return flag
	 */
	public void verifyJobTitleResult(int exp){
		boolean flag1 = false;
		List<WebElement>searchbdy = uiDriver.findElements(searchBody);
		for(WebElement jobs : searchbdy){
			String jobTitleText = jobs.getText().trim();
			jobTitleText = jobTitleText.toLowerCase();
			System.out.println(jobTitleText);
		/*	String jobDescriptionText = jobs.getText().trim();
			jobTitleText = jobTitleText.toLowerCase();
			System.out.println(jobTitleText);*/
			
			//String skillUp = Constants.SKILL.toUpperCase();
			if(jobTitleText.contains(NKConstants.SKILL)){
				flag1=true;
			}else{
				flag1=false;
				break;
			}
		}
		if(flag1==false){
			System.out.println("Job is not displayed on basis of Search Skill selected by the jobseeker");
		}
		
	}
	
	/**This method helps us to verify JobLocation
	 * @author Senthil
	 * @return flag
	 */
	public void verifyJobLocations(){
		boolean flag1 = false;
		List<WebElement>jobLoc = uiDriver.findElements(jobLocation);
		for(WebElement jobLocn : jobLoc){
			String jobLocText = jobLocn.getText().trim();
			jobLocText = jobLocText.toLowerCase();
			System.out.println(jobLocText);
			if(jobLocText.contains(NKConstants.LOCATION)){
				flag1=true;
			}else{
				flag1=false;
				break;
			}
		}
		Assert.assertTrue(flag1, "Job is not displayed on basis of Location selected by the jobseeker");
			
	}	
	
	/**This method helps us to verify Experience
	 * @author Senthil
	 * @param exps 
	 * @return flag
	 * @throws Exception 
	 */
	public void verifyExperience(int exps) throws Exception{
		//hp.selectExperienceDropdown();
	    
		boolean flag1 = false;
		List<WebElement> expReq= uiDriver.findElements(experienceRequirement);
		for(WebElement exp : expReq){
			String expText = exp.getText().trim();
			System.out.println(expText);
			int expL = expText.charAt(0);
			int expH = expText.charAt(2);		
			//int exps = Integer.parseInt(expD);			
			if((expL<=exps) ||(expH>=exps)){
				flag1=true;
			}else{
				flag1=false;
				break;
			}
		}
		if(flag1==false){
			System.out.println("Job is not displayed on basis of Location selected by the jobseeker");
		}
		
	}	
	
//...........................................................................................	
	public void verifyExp(int experience){
		boolean flag1 = false;
		List<WebElement> expReq = uiDriver.findElements(experienceRequirement);
		for(WebElement exp : expReq){
			String expText = exp.getText().trim();
			String split[] = expText.split("yrs");
			String split1[] = split[0].split("-");
			int value = Integer.parseInt(split1[0].trim());
			int value1 = Integer.parseInt(split1[1].trim());
			if (value1>=experience) {
				flag1=true;
			}else{
				flag1=false;
				break;
			}
		}
		Assert.assertTrue(flag1, "Job is not displayed on basis of location selected");
	}
				
			
	
//...........................................................................................	
	public void verifyJobTitleSelected(){
		boolean flag1 = false;
		List<WebElement> jobTitleContent = uiDriver.findElements(jobTitle);
		for(WebElement jobTit : jobTitleContent){
			String jobtitleText = jobTit.getAttribute("title").trim();
			if((jobtitleText.contains("Walkin"))||(jobtitleText.contains("Walk-in"))||(jobtitleText.contains("Walk-ins"))){
				flag1=true;
			}else{
				flag1=false;
				break;
			}
		}
		if(flag){
			System.out.println("Job title is refined by the Job type selected");
		}else{
			System.out.println("Job title is not refined by the Job type selected");
		}
		
		
	}
	
//...........................................................................................
	
	/**This method helps us to verify CompanyJobs Checkbox
	 * @author Senthil
	 * @param exp 
	 * @return flag
	 */
	public boolean verifyCompanyJobsCheckbox(){
		flag = uiDriver.findElement(companyJobscheckbox).isDisplayed();
		Assert.assertTrue(flag, "CompanyJobs Checkbox is not displayed");
		return flag;
		
	}
	
//............................................................................................	

	//...........................................................................................
	
		/**This method helps us to verify ConsultantJobs Checkbox Checkbox
		 * @author Senthil
		 * @param exp 
		 * @return flag
		 */
		public boolean verifyConsultantJobsCheckbox(){
			flag = uiDriver.findElement(consultantJobsCheckbox).isDisplayed();
			Assert.assertTrue(flag, "ConsultantJobs Checkbox is not displayed");
			return flag;
			
		}
		
	//............................................................................................	
	
	/**This method will help us to Mousehover on Submit Button
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void mousehoverOnSubmitButton() throws Exception{
		Log.info("Before Mousehovering on Submit Button");
		try{
		verifySubmitButton();
		Actions action = new Actions(uiDriver);
		action.moveToElement((WebElement) submitButton).build().perform();
		Log.info("After Mousehovering on Submit Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE MOUSEHOVERING ON SUBMIT BUTTON"+"\n mousehoverOnSubmitButton()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Freshness Arrow
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnFreshnessArrow() throws Exception{
		Log.info("Before Clicking on Freshness Arrow");
		try{
			verifyFressnessArrow();
			uiDriver.findElement(freshnessArrow).click();
			Log.info("After Clicking on Freshness Arrow");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON FRESHNESS ARROW:::"+"\n clickOnFreshnessArrow()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Submit Fressness Selected
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void SubmitFressnessSelected() throws Exception{
		Log.info("Before Submiting Freshness Selected");
		try{
			verifyFressnessSelected();
			uiDriver.findElement(freshnessUptoSelected).submit();
			Log.info("After Submiting Freshness Selected");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SUBMITTING FRESHNESS SELECTED:::"+"\n SubmitFressnessSelected()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Location
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnLocation() throws Exception{
		Log.info("Before Clicking on Location");
		try{
			verifyLocationSection();
			uiDriver.findElement(location).click();
			Log.info("After Clicking on Location");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LOCATION:::"+"\n clickOnLocation()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Location More link
	 * @author Senthil
	 * @return 
	 * @throws Exception 
	 * 
	 */
	public SearchResultPage clickOnLocationMoreLink() throws Exception{
		Log.info("Before Clicking on Location More link");
		try{
			verifyLocationMoreLink();
			uiDriver.findElement(locationMoreLink).click();
			Log.info("After Clicking on Location More link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LOCATION MORE LINK:::"+"\n clickOnLocationMoreLink()"+e.getLocalizedMessage());
		}
		return null;
		
	}
	
	/**This method will help us to Click on More PopUp Close(X)
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnMorePopUpClose() throws Exception{
		Log.info("Before Clicking on More PopUp Close(X)");
		try{
			verifyMorePopUpClose();
			uiDriver.findElement(morePopUpClose).click();
			Log.info("After Clicking on More PopUp Close(X)");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON MORE POPUP CLOSE(X):::"+"\n clickOnMorePopUpClose()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Location Pune
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnLocationPune() throws Exception{
		Log.info("Before Clicking on Location Pune");
		try{
			verifyLocationPune();
			uiDriver.findElement(locPune).click();
			Log.info("After Clicking on Location Pune");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LOCATION PUNE:::"+"\n clickOnLocationPune()"+e.getLocalizedMessage());
		}
		
	}
	
	public String getLocationPuneSelected(){
		String locatePune = uiDriver.findElement(locPune).getText().trim();
		String locaPune[] = locatePune.split(" ");
		String locationPuneSelected = locaPune[0].trim();
		return locationPuneSelected;
	}
	
	/**This method will help us to Click on PopUp Refine Button
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnPopUpRefineButton() throws Exception{
		Log.info("Before Clicking on PopUp Refine Button");
		try{
			verifyPopUpRefineButton();
			uiDriver.findElement(refineButton).click();
			Log.info("After Clicking on PopUp Refine Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON PopUp REFINE BUTTON:::"+"\n clickOnPopUpRefineButton()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Location Bangalore
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnLocationBangalore() throws Exception{
		Log.info("Before Clicking on Location Bangalore");
		try{
			verifyLocationBangalore();
			uiDriver.findElement(locationBangalore).click();
			Log.info("After Clicking on Location Bangalore");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LOCATION BANGALORE:::"+"\n clickOnLocationBangalore()"+e.getLocalizedMessage());
		}
		
	}
	
	public String getLocationBangaloreSelected(){
		String locateBlore = uiDriver.findElement(locationBangalore).getText().trim();
		String locateBangalore = locateBlore.substring(0, 9).trim();
		return locateBangalore;
	}
	
	/**This method will help us to Click on Industry
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnIndustry() throws Exception{
		Log.info("Before Clicking on Industry");
		try{
			verifyIndustrySection();
			uiDriver.findElement(industry).click();
			Log.info("After Clicking on Industry");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON INDUSTRY:::"+"\n clickOnIndustry()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Salary
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSalary() throws Exception{
		Log.info("Before Clicking on Salary");
		try{
			verifySalarySection();
			uiDriver.findElement(salary).click();
			Log.info("After Clicking on Salary");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SALARY:::"+"\n clickOnSalary()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Salary More link
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSalaryMoreLink() throws Exception{
		Log.info("Before Clicking on Salary More link");
		try{
			verifySalaryMoreLink();
			uiDriver.findElement(salaryMoreLink).click();
			Log.info("After Clicking on Salary More link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SALARY MORE LINK:::"+"\n clickOnSalaryMoreLink()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Salary Close(X)
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSalaryClose() throws Exception{
		Log.info("Before Clicking on Salary Close(X)");
		try{
			verifySalaryClose();
			uiDriver.findElement(morePopUpClose).click();
			Log.info("After Clicking on Salary Close(X)");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SALARY CLOSE(X):::"+"\n clickOnSalaryClose()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Salary Refine Button
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSalaryRefineButton() throws Exception{
		Log.info("Before Clicking on Salary Refine Button");
		try{
			verifySalaryRefineButton();
			uiDriver.findElement(refineButton).click();
			Log.info("After Clicking on Salary Refine Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SALARY REFINE BUTTON:::"+"\n clickOnSalaryRefineButton()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Education
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnEducation() throws Exception{
		Log.info("Before Clicking on Education");
		try{
			verifyEducationSection();
			uiDriver.findElement(education).click();
			Log.info("After Clicking on Education");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON EDUCATION:::"+"\n clickOnEducation()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Education More link
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnEducationMoreLink() throws Exception{
		Log.info("Before Clicking on Education More link");
		try{
			verifyEducationMoreLink();
			uiDriver.findElement(educationMoreLink).click();
			Log.info("After Clicking on Education More link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON EDUCATION MORE LINK:::"+"\n clickOnEducationMoreLink()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Education Close(X)
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnEducationClose() throws Exception{
		Log.info("Before Clicking on Education Close(X)");
		try{
			verifyEducationClose();
			uiDriver.findElement(morePopUpClose).click();
			Log.info("After Clicking on Education Close(X)");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON EDUCATION CLOSE(X):::"+"\n clickOnEducationClose()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on Employer Type
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnEmployerType() throws Exception{
		Log.info("Before Clicking on Employer Type");
		try{
			verifyEmployerTypeSection();
			uiDriver.findElement(employerType).click();
			Log.info("After Clicking on Employer Type");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON EMPLOYER TYPE:::"+"\n clickOnEmployerType()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on SortBy Arrow
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSortByArrow() throws Exception{
		Log.info("Before Clicking on SortBy Arrow");
		try{
			verifySortByArrow();
			uiDriver.findElement(sortByArrow).click();
			Log.info("After Clicking on SortBy Arrow");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SORT BY ARROW:::"+"\n clickOnSortByArrow()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on SortBy Date
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSortByDate() throws Exception{
		Log.info("Before Clicking on SortBy Date");
		try{
			verifySortByDate();
			uiDriver.findElement(sortByDate).click();
			Log.info("After Clicking on SortBy Date");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SORT BY DATE:::"+"\n clickOnSortByDate()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on DetailedView Icon
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnDetailedViewIcon() throws Exception{
		Log.info("Before Clicking on DetailedView Icon");
		try{
			verifyDetailedViewIcon();
			uiDriver.findElement(detailedViewIcon).click();
			Log.info("After Clicking on DetailedView Icon");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING DETAILED VIEW ICON:::"+"\n clickOnDetailedViewIcon()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on LocationSelected
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnLocationSelected() throws Exception{
		Log.info("Before Clicking on LocationSelected");
		try{
			verifyLocationSelected();
			uiDriver.findElement(locationSelected).click();
			Log.info("After Clicking on LocationSelected");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING LOCATION SELECTED:::"+"\n clickOnLocationSelected()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on ListView Icon
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnListViewIcon() throws Exception{
		Log.info("Before Clicking on ListView Icon");
		try{
			verifyListViewIcon();
			uiDriver.findElement(listViewIcon).click();
			Log.info("After Clicking on ListView Icon");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING LIST VIEW ICON:::"+"\n clickOnListViewIcon()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on SearchBody
	 * @author Senthil
	 * @return 
	 * @throws Exception 
	 * @return void
	 */
	public JobListingsPage clickOnSearchBody() throws Exception{
		Log.info("Before Clicking on SearchBody");
		try{
			verifySearchBody();
			uiDriver.findElement(searchBody).click();
			Log.info("After Clicking on SearchBody");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SEARCH BODY"+"\n clickOnSearchBody()"+e.getLocalizedMessage());
		}
		 return new JobListingsPage(uiDriver);
		
	}	
		
		/**This method will help us to Click on SearchBody
		 * @author Senthil
		 * @throws Exception 
		 * @return void
		 */
		public void selectEducationType() throws Exception{
			Log.info("Before Selecting EducationType");
			try{
				verifyEducationDD();
				uiDriver.findElement(educationDDBTech).click();
				Log.info("After Selecting EducationType");
			}
			catch(Exception e){
				throw new Exception("FAILED WHILE SELECTING EDUCATION "+"\n selectEducationType()"+e.getLocalizedMessage());
			}
	}
	
		
		/**This method will help us to get selected Education type
		 * @author Senthil
		 * @throws Exception 
		 * @return void
		 */
		public String getSelectedEducationType() throws Exception{
		String eduSelected = uiDriver.findElement(educationDDBTech).getText().trim();	
		String educationSel = eduSelected.substring(0, 12).trim();
		String educanSel = educationSel.replace(" ", "");
		System.out.println(educanSel);
		return educanSel;
	
	}
		
	/**This method will help us to Click on JobType Section
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnJobTypeSection() throws Exception{
		Log.info("Before Clicking on JobType Section");
		try{
			verifyJobTypeSection();
			uiDriver.findElement(jobTypeSection).click();
			Log.info("Before Clicking on JobType Section");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON JOBTYPE SECTION"+"\n clickOnJobTypeSection()"+e.getLocalizedMessage());
		}
		
	
	}
	
	/**This method will help us to Click on WalkIn JobType Checkbox
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnWalkInJobTypeCheckbox() throws Exception{
		Log.info("Before Clicking on WalkIn JobType Checkbox");
		try{
			verifyWalkInJobTypeCheckbox();
			uiDriver.findElement(walkInJobTypeCheckbox).click();
			Log.info("Before Clicking on WalkIn JobType Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON WALKIN JOBTYPE CHECKBOX"+"\n clickOnWalkInJobTypeCheckbox()"+e.getLocalizedMessage());
		}
		
	
	}
	
	/**This method will help us to Click on Submit Button
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnSubmitButton() throws Exception{
		Log.info("Before Clicking on Submit Button");
		try{
			verifySubmitButton();
			uiDriver.findElement(submitButton).click();
			Log.info("After Clicking on Submit Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SUBMIT BUTTON"+"\n clickOnSubmitButton()"+e.getLocalizedMessage());
		}
		
	
	}
	
	
	/**This method will help us to Click on CompanyJobs Checkbox
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnCompanyJobsCheckbox() throws Exception{
		Log.info("Before Clicking on CompanyJobs Checkbox");
		try{
			verifyCompanyJobsCheckbox();
			uiDriver.findElement(companyJobscheckbox).click();
			Log.info("After clicking on CompanyJobs Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON COMPANYJOBS CHECKBOX"+"\n clickOnCompanyJobsCheckbox()"+e.getLocalizedMessage());
		}
		
	
	}
	
	/**This method will help us to Click on ConsultantJobs Checkbox
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnConsultantJobsCheckbox() throws Exception{
		Log.info("Before Clicking on ConsultantJobs Checkbox");
		try{
			verifyConsultantJobsCheckbox();
			uiDriver.findElement(consultantJobsCheckbox).click();
			Log.info("After Clicking on ConsultantJobs Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON CONSULLTANTJOBS CHECKBOX"+"\n clickOnConsultantJobsCheckbox()"+e.getLocalizedMessage());
		}
		
	
	}
	
	/**This method will help us to Click on IT Software Services Industry
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnITSoftwareServicesIndustryCheckbox() throws Exception{
		Log.info("Before Clicking on IT Software Services Industry Checkbox");
		try{			
			uiDriver.findElement(itServicesIndustryPopUpcheckbox).click();
			Log.info("After clicking on IT Software Services Industry Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON IT SOFTWARE SERVICES INDUSTRY CHECKBOX"+"\n clickOnITSoftwareServicesIndustryCheckbox()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Click on IT Software Services Industry
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnSoftwareServicesIndustryCheckbox() throws Exception{
		Log.info("Before Clicking on IT Software Services Industry Checkbox");
		try{			
			uiDriver.findElement(softwareServicesIndustryCheckbox).click();
			Log.info("After clicking on IT Software Services Industry Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON IT SOFTWARE SERVICES INDUSTRY CHECKBOX"+"\n clickOnITSoftwareServicesIndustryCheckbox()"+e.getLocalizedMessage());
		}
		
	}
	
	public String getIndusrtySelected(){
		String ssIndustry = uiDriver.findElement(softwareServicesIndustryCheckbox).getText().trim();
		return ssIndustry;
	}
	
	public String getMorePopUpIndusrtySelected(){
		String ssIndustry = uiDriver.findElement(itServicesIndustryPopUpcheckbox).getText().trim();
		return ssIndustry;
	}
	
	public String getMorePopUpEducationSelected(){
		String popUpEducation = uiDriver.findElement(educationMCAPopUpCheckbox).getText().trim();
		popUpEducation = popUpEducation.substring(0, 3).trim();
		return popUpEducation;
		
	}
	
	/**This method will help us to Click on MCA Education
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnMCAEducationPopUpCheckbox() throws Exception{
		Log.info("Before Clicking on MCA Education PopUp Checkbox");
		try{			
			uiDriver.findElement(educationMCAPopUpCheckbox).click();
			Log.info("After Clicking on MCA Education PopUp Checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON MCA EDUCATION POPUP CHECKBOX"+"\n clickOnMCAEducationPopUpCheckbox()"+e.getLocalizedMessage());
		}
		
	}
	
	
	/**This method will help us to select on Freshness Upto Selected
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnFreshnesSelected() throws Exception{
		Log.info("Before Clicking on Freshness Upto Selected");
		try{
			verifyFressnessSelected();
			uiDriver.findElement(freshnessUptoSelected).click();
			Log.info("After Clicking on Freshness Upto Selected");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON FRESHNESS SELECTED"+"\n clickOnFreshnesSelected()"+e.getLocalizedMessage());
		}
		
	
	}
	
	/**This method will help us to click on ITServices Industry PopUp checkbox
	 * @author Senthil
	 * @throws Exception 
	 * @return void
	 */
	public void clickOnITServicescheckbox() throws Exception{
		Log.info("Before Clicking on ITServices Industry PopUp checkbox");
		try{
			verifyITServicesIndustryPopUpcheckbox();
			uiDriver.findElement(itServicesIndustryPopUpcheckbox).click();
			Log.info("After Clicking on ITServices Industry PopUp checkbox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON IT SERVICES INDUSTRY POPUP CHECKBOX"+"\n clickOnITServicescheckbox()"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Click on Salary More PopUp Range
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnSalaryMorePopUpRange() throws Exception{
		Log.info("Before Clicking on Salary More PopUp Range");
		try{
			verifySalaryMorePopUpRange();
			uiDriver.findElement(salaryMorePopUpRange).click();
			Log.info("After Clicking on Salary More PopUp Range");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SALARY MORE POPUP RANGE:::"+"\n clickOnSalaryMorePopUpRange()"+e.getLocalizedMessage());
		}
		
	}
	

	public int getFreshnessSelected(){
		String daysUptoSelected = uiDriver.findElement(freshnessValue).getAttribute("value").trim();
		int selectedDays = Integer.parseInt(daysUptoSelected);
		return selectedDays;
	}
	
	/**This method will help us to Click on Industry More link
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnIndustryMoreLink() throws Exception{
		Log.info("Before Clicking on Industry More link");
		try{
			verifyIndustryMoreLink();
			uiDriver.findElement(industryMoreLink).click();
			Log.info("After Clicking on Industry More link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON INDUSTRY MORE LINK:::"+"\n clickOnIndustryMoreLink()"+e.getLocalizedMessage());
		}
		
	}
	
	
	
	public void verifyDisplayedJobLocations(String LocationSelected){
		boolean flag = false;
		verifyJobLocationDisplayed();
		List<WebElement> locDiplayed = uiDriver.findElements(jobLocationDisplayed);
		for(WebElement locDisp : locDiplayed){
			String locationDisplayed = locDisp.getText().trim();
			if(locationDisplayed.contains(LocationSelected)){
				flag = true;
			}else{
				flag = false;				
			}	
     	} 
		Assert.assertTrue(flag, "Location Displayed does not match with the location selected");
		
}	 
	
	public void verifyDatePosted(int daysSelected){
		boolean flag1 = false;
		List<WebElement> daysPosted = uiDriver.findElements(dates);
		for(WebElement dayPost : daysPosted){
		 String dayPosted = dayPost.getText().trim();	
		if((dayPosted.contains("Today")) || (dayPosted.contains("Few Hours Ago"))||(dayPosted.contains("Just Now"))){
			flag1 = true;
		}else{
			String daysArray[] = dayPosted.split("day");
			String day = daysArray[0].trim();
			int dayDisplayed = Integer.parseInt(day);
			if(dayDisplayed<=daysSelected){
				flag1 = true;
			}else{
				flag1 = false;
			}
		}
	}
		if(flag1){
			System.out.println("The Jobs Posted date displayed are within the range of selected dates ");
		}
		else{
			System.out.println("The Jobs Posted date displayed are not within the range of selected dates ");
	}
		}

	public String getSalaryRangeSelected() {
		String salRange = uiDriver.findElement(salaryRangeSelected).getText().trim();
		salRange = salRange.substring(0,3).trim();
		String[] salRangeArray = salRange.split("-");		
		String endSalarySelected = salRangeArray[1];
		return endSalarySelected;
		
		
	}
	

	/**This method will help us to Click on Salary Range in Refine by Salary section
	 * @author Senthil
	 * @throws Exception 
	 * 
	 */
	public void clickOnRefineSectionSalaryRange() throws Exception{
		Log.info("Before Clicking on Refine Section Salary Range");
		try{
			verifySalaryRangeSelectedCheckbox();
			uiDriver.findElement(salaryRangeSelected).click();
			Log.info("After Clicking on Refine Section Salary Range");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON REFINE SECTION SALARY RANGE:::"+"\n clickOnRefineSectionSalaryRange()"+e.getLocalizedMessage());
		}
		
	}

	public void verifyRefineBySalarySelected(String maximumSalarySelected) {
		List<WebElement> salaryContents = uiDriver.findElements(salaryDisplayed);
		for(WebElement salContent : salaryContents){
			
			String salaryDisplayed = salContent.getText().trim();
			if(salaryDisplayed.contains("Not disclosed")){
				System.out.println("Salary is displayed as:: Not disclosed");
			}else{			
			String salArray[] = salaryDisplayed.split("-");
			String startSalDisplayed = salArray[0].trim();
			String startSalComma = startSalDisplayed.replace(",", "").trim();
			int startingSalaryDisplayed = Integer.parseInt(startSalComma);
			int endingSalarySelected = Integer.parseInt(maximumSalarySelected);									
			endingSalarySelected = endingSalarySelected * 100000;				
			if(startingSalaryDisplayed <= endingSalarySelected){
				 flag = true;
			}else{
			     flag = false;
			     break;
			     }
			}
		}
		Assert.assertTrue(flag, "The Search result is not refined by Salary submitted by the Jobseeker.");
		
	}

	public String getSalaryRangePopUPSelected() {
		String salRange = uiDriver.findElement(salaryMorePopUpRange).getText().trim();
		salRange = salRange.substring(0,3).trim();
		String[] salRangeArray = salRange.split("-");		
		String endSalarySelected = salRangeArray[1];
		return endSalarySelected;
		
	}

	public void refreshPage() throws InterruptedException {
		uiDriver.navigate().refresh();	
		Thread.sleep(4000);	
	}
	
	public String getSkillDisplayed(){
		verifyskillsDisplayed();
		String skillDisplayed = uiDriver.findElement(skillsDisplayed).getText().toLowerCase().trim();
		return skillDisplayed;
		
	}

	public void verifySkillsSelectedAndDisplayed(String skill, String displayedSkill) {
		Assert.assertEquals(skill, displayedSkill, "Search keywords entered by the Job Seeker doesnot matches with the Skills Displayed");
		
	}

	public void verifyDetailedViewSelectedByDefault() {
		boolean flag = false;
		String detailedViewStatus = uiDriver.findElement(detailedViewIcon).getAttribute("class").trim();
		if(detailedViewStatus.contains("active")){
			flag = true;
		}else{
			flag = false;
	    }
		Assert.assertTrue(flag, "Detailed view is not selected by Default");
	}

	public void verifySortByDDDefault(String defaultSortByValue, String sortbydefaultselection) {
		Assert.assertEquals(defaultSortByValue, sortbydefaultselection, "Sort By Relevence is not selected by default ");
		
	}

	public String getDefaultSortByValue() {
		String defaultValue = uiDriver.findElement(defaultSelectedDDItem).getText().trim();
		return defaultValue;
	}

	public void verifySortByDDDate() {
		uiDriver.findElement(sortByArrow).click();
		verifySortByDate();
			
	}

	public void verifyResultBodyTitle() {
		List<WebElement> design = uiDriver.findElements(designation);
		 for(WebElement title : design){
			 boolean isTitleDisplayed = title.isDisplayed();
			 Assert.assertTrue(isTitleDisplayed, "Title/Designation is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyOrganization() {
		List<WebElement> organs = uiDriver.findElements(organization);
		 for(WebElement organization : organs){
			 boolean isOrganizationDisplayed = organization.isDisplayed();
			 Assert.assertTrue(isOrganizationDisplayed, "Organization is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyExperienceRequirements() {
		List<WebElement> experience = uiDriver.findElements(experienceRequirement);
		 for(WebElement exps : experience){
			 boolean isExperienceDisplayed = exps.isDisplayed();
			 Assert.assertTrue(isExperienceDisplayed, "Experience is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyJobLocation() {
		List<WebElement> locn = uiDriver.findElements(jobLocationDisplayed);
		 for(WebElement location : locn){
			 boolean isLocationDisplayed = location.isDisplayed();
			 Assert.assertTrue(isLocationDisplayed, "location is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodykeySkills() {
		List<WebElement> skill = uiDriver.findElements(skills);
		 for(WebElement keyskills : skill){
			 boolean isSkillsDisplayed = keyskills.isDisplayed();
			 Assert.assertTrue(isSkillsDisplayed, "keyskills is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyOtherDetails() {
		List<WebElement> othdetails = uiDriver.findElements(otherDetails);
		 for(WebElement otherDetails : othdetails){
			 boolean isOtherDetailsDisplayed = otherDetails.isDisplayed();
			 Assert.assertTrue(isOtherDetailsDisplayed, "OtherDetails is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyJobDescription() {
		List<WebElement> jobDesc = uiDriver.findElements(jobDescription);
		 for(WebElement jobDescription : jobDesc){
			 boolean isJobDescriptionDisplayed = jobDescription.isDisplayed();
			 Assert.assertTrue(isJobDescriptionDisplayed, "JobDescription is not displayed in Result body");
		 }
	}
	
	public void verifyResultBodyJobDescForListingView() {
		boolean	flag = uiDriver.findElement(jobDescription).isSelected();
		Assert.assertFalse(flag, "JobDescription is displayed in Result body for Listing view");
	 }
	
	public void verifyResultBodySkillsForListingView() {
		boolean	flag = uiDriver.findElement(skills).isSelected();
		Assert.assertFalse(flag, "Skills is displayed in Result body for Listing view");
	 }
	
	
}
		

     
