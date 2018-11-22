package com.api.cucumber.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class GeneralHooks extends SeMethods {
	
	//1.Create the public method
	//2. Use the @Before & @After annotations with the methods
	//3. Specify the package in the runner
	//4. Inject the Scenario Object in the hook method
	
	@Before
	public void Setup(Scenario sc) {
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		startResult();
		startTestModule(sc.getName(), sc.getId());	
		test = startTestCase(sc.getName());
		test.assignCategory("Smoke");
		test.assignAuthor("Amirtha");
		//startApp("chrome");	
	}
	
	@After
	public void tearDown(Scenario name){
		System.out.println("========After Hook===========");
		System.out.println("Name : " + name.getName());
		System.out.println("Status : " + name.getStatus());
	}
	
}
