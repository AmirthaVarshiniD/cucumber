package com.api.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{

	public HomePage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using ="CRM/SFA")
	private WebElement eleCRMSFA;
	@Given ("Click CRMSFA")
	public MyHomePage clickCRMSFA() {
		click(eleCRMSFA);
		return new MyHomePage();		
	}

}
