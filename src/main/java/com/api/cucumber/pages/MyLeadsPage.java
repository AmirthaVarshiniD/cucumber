package com.api.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{

	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleClickOnCreateLead;
	@And("Click Create Lead")
	public CreateLeadPage clickCreateLead() {
		click(eleClickOnCreateLead);
		return new CreateLeadPage();		
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleClickOnFindLead;
	public FindLeadPage clickFindLead() {
		click(eleClickOnFindLead);
		return new FindLeadPage();
	}
	
//	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
//	private WebElement eleClickOnMergeLead;
//	public MergeLeadPage clickMergeLead() {
//		click(eleClickOnMergeLead);
//		return new MergeLeadPage();
//	}

}
