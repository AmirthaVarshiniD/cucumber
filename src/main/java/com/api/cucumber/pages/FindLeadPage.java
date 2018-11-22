package com.api.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public FindLeadPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(how=How.XPATH,using = "(//label[text() = 'First name:'])[3]/following::input[1]")
	private WebElement eleFirstName;

	public  FindLeadPage enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}

	@FindBy(how = How.XPATH,using = "//button[@class='x-btn-text'][text()='Find Leads']")
	WebElement eleFindLeadsButton;

	public FindLeadPage clickOnFindLead() {
		click(eleFindLeadsButton);
		return new FindLeadPage();
	}

	@FindBy(how = How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement eleFirstCell;
	public ViewLeadPage clickOnFirstCell() {
		click(eleFirstCell);
		return new ViewLeadPage();
	}

	@FindBy(how = How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement eleLeadIdText;
	public String captureLeadId()
	{
		String firstResLead = eleLeadIdText.getText();
		return firstResLead;
	}

	@FindBy(how= How.XPATH,using="//label[text()='Lead ID:']/following::input[1]")
	WebElement eleDeletedID;
	public FindLeadPage sendDeletedID(String data)
	{
		type(eleDeletedID, data);
		return this;
	}
	@FindBy(how = How.XPATH,using="//div[text()='No records to display']")
	WebElement eleVerifyDeleted;
	public FindLeadPage verifyDeletedID(String data)
	{
		verifyPartialText(eleVerifyDeleted, data);
		return this;
		
	}

}
