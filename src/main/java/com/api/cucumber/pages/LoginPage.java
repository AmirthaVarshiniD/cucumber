package com.api.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}	

	@FindBy(how = How.NAME, using = "USERNAME")
	WebElement eleUserName;

	@FindBy(how = How.ID, using ="password")
	WebElement elePassword;

	@FindBy(how = How.CLASS_NAME, using="decorativeSubmit")
	WebElement eleLogin;
	
	@And("^enter the userName is \"([^\"]*)\"$")
	public LoginPage typeUserName(String data) {
		type(eleUserName, data);
		return this;
	}
	
	@And("enter the Password as (.*)")
	public LoginPage typePassword(String data) {
		type(elePassword, data);
		return this;
	}
	
	@And("click on the login button")
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	










}













