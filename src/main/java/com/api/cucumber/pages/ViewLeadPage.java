package com.api.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVerifyFirstName;
	public void verifyFirstName(String data) {
		verifyExactText(eleVerifyFirstName, data);	
	}
	
	@FindBy(how = How.XPATH,using="//div[text()='View Lead']")
	WebElement eleVerifyTitle;
	public ViewLeadPage verifyPageTitle(String data) {
		verifyTitle(data);
		return new ViewLeadPage();
	}

	/*@FindBy(how = How.XPATH, using="//a[text()='Edit']")
	WebElement eleClickOnEditButton;
	public EditLeadPage clickEdit() {
		click(eleClickOnEditButton);
		return new EditLeadPage();
	}*/

	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	WebElement eleVerifyCName;
	public ViewLeadPage verifyCompanyName(String data) {
		verifyPartialText(eleVerifyCName, data);
		return new ViewLeadPage();
	}
	
	@FindBy(how = How.XPATH,using="//a[text()='Delete']")
	WebElement eleDeleteButton;
	public MyLeadsPage clickDelete()
	{
		click(eleDeleteButton);
		return new MyLeadsPage();
	}
	
	/*@FindBy(how=How.LINK_TEXT,using = "Duplicate Lead")
	WebElement eleDuplicateButton;
	public DuplicateLeadPage clickDuplicate()
	{
		click(eleDuplicateButton);
		return new DuplicateLeadPage();
	}
*/




}

