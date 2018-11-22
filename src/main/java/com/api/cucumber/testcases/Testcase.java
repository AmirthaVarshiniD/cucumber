package com.api.cucumber.testcases;

import java.util.List;

import com.api.cucumber.pages.LoginPage;
import com.api.cucumber.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Testcase {
	
	@When("^User login with the following username and password with data in excel at \"([^\"]*)\"$")
	public void check(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
List<List<String>> data = table.raw();
		
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).toString());
		}
		new LoginPage()
		.typeUserName(data.get(1).get(0).toString())
		.typePassword(data.get(1).get(1).toString())
		.clickLogin();	
	}
	@Then("^Success Login$")
	public void success_Login() throws Throwable {
	  System.out.println("Success");
	   // throw new PendingException();
	}

}
