package com.mr.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.mr.common.NKConstants;
import com.mr.common.NkCommon;
import com.mr.pages.HomePage;
import com.mr.pages.JobListingsPage;
import com.mr.pages.SearchResultPage;

public class SearchPageTest {
WebDriver uiDriver;
public String BASE_URL = "http://www.naukri.com/";
SearchResultPage objSearchResultPage;
HomePage objHomePage;
JobListingsPage objJobListingPage;
NkCommon objNKCommon;

	
	@BeforeClass
	public void setUp() throws InterruptedException{
		uiDriver = new FirefoxDriver();
		uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		uiDriver.manage().window().maximize();
		uiDriver.get(BASE_URL);
		Thread.sleep(4000);
	}
	
	@Test(priority = -1)
	public void popUpClose(){
		objNKCommon = new NkCommon(uiDriver);
		objNKCommon.closepopUp();
	}
	
	@Test(priority=0)
	public void verifySearchSection() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.verifySkillTextBox();
		objHomePage.verifyLocationTextBox();
		objHomePage.verifyExperiencedropdown();
		
		
	}
	
	@Test(priority=3)
	public void verifySearchBySkill() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterSkillEntry(NKConstants.SKILL);
		objHomePage.clickOnSearchButton();
		Thread.sleep(3000);
		SearchResultPage searchRes = new SearchResultPage(uiDriver);
	    String displayedSkill = searchRes.getSkillDisplayed();
		searchRes.verifySkillsSelectedAndDisplayed(NKConstants.SKILL,displayedSkill);
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void verifySearchByLocationField() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterLocation(NKConstants.LOCATION);
		objSearchResultPage = objHomePage.clickOnSearchButton();
		Thread.sleep(2000);
		SearchResultPage searchRes = new SearchResultPage(uiDriver);
		searchRes.verifyJobLocations();
		objHomePage.clickOnSiteLogo();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void verifySearchByExperienceField() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.enterSkillEntry(NKConstants.SKILL);
		objHomePage.SelectExperience();
		int exp = objHomePage.getSelectedYrsExp();
		objSearchResultPage = objHomePage.clickOnSearchButton();
		Thread.sleep(2000);
		objSearchResultPage.verifyExp(exp);
		Thread.sleep(2000);
		objHomePage.clickOnSiteLogo();
	}
	
	@Test(priority = 18)
	public void verifyRefineByJobTypeSection() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnJobTypeSection();
		Thread.sleep(1000);
		objSearchResultPage.clickOnWalkInJobTypeCheckbox();
		Thread.sleep(4000);
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(2000);
		objSearchResultPage.verifyJobTitleSelected();
		
	}
	
	@Test(priority = 16)
	public void verifyRefineByEducation() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnEducation();
		objSearchResultPage.selectEducationType();
		String educationSelected = objSearchResultPage.getSelectedEducationType();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(2000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEducationSelectedUG(educationSelected);
		objJobListingPage.closeWindow();
		Thread.sleep(1000);
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.selectEducationType();
		objSearchResultPage.clickOnEducation();
		
		
	}
	
	@Test(enabled=false) //not working
	public void verifyRefineByEmployerType() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnEmployerType();
		objSearchResultPage.verifyEmployerTypeDD();
		objSearchResultPage.clickOnCompanyJobsCheckbox();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(4000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEmployerTypeCompanyJobs();
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnCompanyJobsCheckbox();
		objSearchResultPage.clickOnConsultantJobsCheckbox();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);
		String parentWindow1 = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(4000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEmployerTypeConsultant();
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow1);
		
		
	}
	
	@Test(priority = 12)	
	public void verifyRefineByIndustryType() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnIndustry();
		objSearchResultPage.verifyIndustryDD();
		objSearchResultPage.clickOnSoftwareServicesIndustryCheckbox();
		String industryTypeSelected = objSearchResultPage.getIndusrtySelected();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(4000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyIndustryType(industryTypeSelected);
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnSoftwareServicesIndustryCheckbox();
		objSearchResultPage.clickOnIndustry();
		
	}
	
	@Test(priority = 13)
	public void verifyRefineByIndustryPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnIndustry();
		objSearchResultPage.verifyIndustryDD();
		objSearchResultPage.verifyIndustryMoreLink();
		objSearchResultPage.clickOnIndustryMoreLink();
		Thread.sleep(1000);
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnIndustryMoreLink();
		Thread.sleep(1000);
		String morePopUpTitle = objSearchResultPage.getMorePopUpHeaderTitle();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_INDUSTRYPOPUP);
		objSearchResultPage.clickOnITSoftwareServicesIndustryCheckbox();
		String industryTypeSelected = objSearchResultPage.getMorePopUpIndusrtySelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		Thread.sleep(4000);		
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(4000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyIndustryType(industryTypeSelected);
		objJobListingPage.closeWindow();
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnSoftwareServicesIndustryCheckbox();
		objSearchResultPage.clickOnIndustry();
		
	}
	
	@Test(priority = 17)
	public void verifyRefineByEducationPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnEducation();
		Thread.sleep(1000);
		objSearchResultPage.clickOnEducationMoreLink();
		Thread.sleep(1000);
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnEducationMoreLink();
		Thread.sleep(1000);
		String morePopUpTitle = objSearchResultPage.getMorePopUpHeaderTitle();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_EDUCATIONPOPUP);
		objSearchResultPage.clickOnMCAEducationPopUpCheckbox();
		String educationSelected = objSearchResultPage.getMorePopUpEducationSelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		Thread.sleep(3000);
		String parentWindow = uiDriver.getWindowHandle();
		objJobListingPage = objSearchResultPage.clickOnSearchBody();
		Thread.sleep(4000);
		objJobListingPage.switchToNewWindow();
		objJobListingPage.verifyEducationSelectedPG(educationSelected);
		objJobListingPage.closeWindow();
		Thread.sleep(4000);
		objSearchResultPage.switchToParentWindow(parentWindow);
		objSearchResultPage.clickOnEducation();
		
	}
		
	@Test(priority = 9)	
	public void verifyRefineByFreshness() throws Exception{	
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnFreshnessArrow();
		objSearchResultPage.verifyFressnessDropdown();
		Thread.sleep(1000);
		objSearchResultPage.verifyFressnessDropdownContents();
		objSearchResultPage.clickOnFreshnesSelected();
		int daysSelected = objSearchResultPage.getFreshnessSelected();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);
		objSearchResultPage.verifyDatePosted(daysSelected);
	}
	
	@Test(priority = 11)
	public void verifyRefineByLocationPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyLocationDropdown();
		objSearchResultPage.clickOnLocationMoreLink();
		Thread.sleep(1000);
		objSearchResultPage.verifyLocationCheckBoxes();
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnLocationMoreLink();
		Thread.sleep(1000);
		objSearchResultPage.clickOnLocationPune();
		String LocationSelected = objSearchResultPage.getLocationPuneSelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		Thread.sleep(1000);
		objSearchResultPage.verifyDisplayedJobLocations(LocationSelected);
		objSearchResultPage.clickOnLocationSelected();
		objSearchResultPage.clickOnLocation();
		
	}
	
	@Test(priority = 10)
	public void verifySearchByLocationSection() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.clickOnLocation();
		objSearchResultPage.verifyLocationDropdown();
		objSearchResultPage.clickOnLocationBangalore();
		String LocationSelected = objSearchResultPage.getLocationBangaloreSelected();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(3000);	     
		objSearchResultPage.verifyDisplayedJobLocations(LocationSelected);
		objSearchResultPage.clickOnLocationBangalore();
	}
	
	@Test (enabled = false)//(priority = 14)
	public void verifySearchBySalarySection() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifySalarySection();
		objSearchResultPage.clickOnSalary();
		objSearchResultPage.verifySalaryDD();
		objSearchResultPage.clickOnRefineSectionSalaryRange();
		String maximumSalarySelected = objSearchResultPage.getSalaryRangeSelected();
		objSearchResultPage.clickOnSubmitButton();
		Thread.sleep(4000);	
		objSearchResultPage.verifySalaryRangeDisplayed();
		objSearchResultPage.verifyRefineBySalarySelected(maximumSalarySelected);
		objSearchResultPage.clickOnRefineSectionSalaryRange();
		objSearchResultPage.clickOnSalary();
	}	
		
	@Test(enabled = false)//(priority = 15)
	public void verifySearchBySalaryPopUp() throws Exception{
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifySalarySection();
		objSearchResultPage.clickOnSalary();
		objSearchResultPage.verifySalaryDD();
		objSearchResultPage.clickOnSalaryMoreLink();
		objSearchResultPage.clickOnMorePopUpClose();
		objSearchResultPage.clickOnSalaryMoreLink();
		Thread.sleep(1000);
		String morePopUpTitle = objSearchResultPage.getMorePopUpHeaderTitle();
		objSearchResultPage.verifyPopUpHeaderTitle(morePopUpTitle, NKConstants.TITLE_SALARYPOPUP);
		objSearchResultPage.clickOnSalaryMorePopUpRange();
		String maximumSalarySelected = objSearchResultPage.getSalaryRangePopUPSelected();
		objSearchResultPage.clickOnPopUpRefineButton();
		Thread.sleep(4000);	
		objSearchResultPage.verifySalaryRangeDisplayed();
		objSearchResultPage.verifyRefineBySalarySelected(maximumSalarySelected);
		objSearchResultPage.clickOnSalary();
	}
		
	@Test(priority = 4)
	public void verifySearchResultsPage(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyNaukriLogo();
		objSearchResultPage.verifyHeaderIcons();
		objSearchResultPage.verifyTabs();
		objSearchResultPage.verifyEmployerZoneLink();
		objSearchResultPage.verifyBuyOnlineLink();
		objSearchResultPage.verifySearchResultHead();
		objSearchResultPage.verifySearchResultBody();
		objSearchResultPage.verifyAdvancedSearchLink();
		objSearchResultPage.verifyRefineSection();
		objSearchResultPage.verifyRecentSearchSection();
		objSearchResultPage.verifyRegisterNowForm();
		objSearchResultPage.verifySubmitButton();
		objSearchResultPage.getJobsInboxDisplayed();
		objSearchResultPage.verifyFooterSection();
		objSearchResultPage.verifyPartnerSection();
		objSearchResultPage.verifyDisclaimer();
		objSearchResultPage.verifyfressnessSection();
	}
	
	@Test(priority = 5)
	public void verifyRefineResultsSection(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyLocationSection();
		objSearchResultPage.verifyIndustrySection();
		objSearchResultPage.verifySalarySection();
		objSearchResultPage.verifyEducationSection();
		objSearchResultPage.verifyEmployerTypeSection();
		objSearchResultPage.verifyJobTypeSection();
		objSearchResultPage.verifySubmitButton();
			
	}
	
	@Test(priority = 8)
	public void verifySearchResultsSection(){
		objSearchResultPage = new SearchResultPage(uiDriver);
		objSearchResultPage.verifyJobCount();
		objSearchResultPage.verifyDetailedViewIcon();
		objSearchResultPage.verifyDetailedViewSelectedByDefault();
		objSearchResultPage.verifyListViewIcon();
		objSearchResultPage.verifySortByDropdown();
		String defaultSortByValue = objSearchResultPage.getDefaultSortByValue();
		objSearchResultPage.verifySortByDDDefault(defaultSortByValue,NKConstants.SORTBYDEFAULTSELECTION);
		objSearchResultPage.verifySortByArrow();
		objSearchResultPage.verifySortByDDDate();			
	}
	
	@Test(priority = 7)
	public void verifySearchDetailedViewResults() throws Exception{
		
		objSearchResultPage.clickOnDetailedViewIcon();
		objSearchResultPage.verifyResultBodyTitle();
		objSearchResultPage.verifyResultBodyOrganization();
		objSearchResultPage.verifyResultBodyExperienceRequirements();
		objSearchResultPage.verifyResultBodyJobLocation();
		objSearchResultPage.verifyResultBodykeySkills();
		objSearchResultPage.verifyResultBodyJobDescription();
		objSearchResultPage.verifyResultBodyOtherDetails();
		
	}
	
	@Test(priority = 6)
	public void verifySearchListingViewResults() throws Exception{
		
		objSearchResultPage.clickOnListViewIcon();
		objSearchResultPage.verifyResultBodyTitle();
		objSearchResultPage.verifyResultBodyOrganization();
		objSearchResultPage.verifyResultBodyExperienceRequirements();
		objSearchResultPage.verifyResultBodyJobLocation();
		objSearchResultPage.verifyResultBodyOtherDetails();		
		objSearchResultPage.verifyResultBodyJobDescForListingView();
		objSearchResultPage.verifyResultBodySkillsForListingView();
		
		
	}
	
	
	
	
	
	
	

	@AfterClass
	public void tearDown(){
		uiDriver.quit();
	}
}
