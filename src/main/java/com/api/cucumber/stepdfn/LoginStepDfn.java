package com.api.cucumber.stepdfn;

import java.util.List;

import com.api.cucumber.pages.LoginPage;
import com.api.cucumber.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class LoginStepDfn extends ProjectMethods{
	//@Given("^User is at the login page of the application$")
	public void user_is_at_the_login_page_of_the_application() throws Throwable {
		startApp("chrome");
	}

	
	//@When("^User login with the following username and password with data in excel at \"([^\"]*)\"$")
	public void user_login_with_the_following_username_and_password_with_data_in_excel_at(@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
		//System.out.println(table.toString());
		
		List<List<String>> data = table.raw();
		
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).toString());
		}
		new LoginPage()
		.typeUserName(data.get(1).get(0).toString());
		
	}
	
	

}
