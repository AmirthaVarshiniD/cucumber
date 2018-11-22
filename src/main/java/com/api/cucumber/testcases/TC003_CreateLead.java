package com.api.cucumber.testcases;

import com.api.cucumber.transform.ExcelDataToDataTable;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import java.util.List;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@Given("Create Lead - Enter details")
	public void logn(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
List<List<String>> data = table.raw();
		
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).toString());
		}
		new com.api.cucumber.pages.LoginPage()
		.typeUserName(data.get(1).get(0).toString())
		.typePassword(data.get(1).get(1).toString())
		.clickLogin();
	}
	
	@When("^Enter Lead details from excel at \"([^\"]*)\"$")
		public void createLeAD(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
			List<List<String>> data = table.raw();
			
			for(int i=0;i<data.size();i++){
				System.out.println(data.get(i).toString());
			}
			new com.api.cucumber.pages.HomePage()	
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(data.get(1).get(1).toString())
		.enterFirstName(data.get(1).get(1).toString())
		.enterLastName(data.get(1).get(1).toString())
		.clickCreateLead();
		/*.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLead()
		.verifyFirstName();*/
				
	}

}
