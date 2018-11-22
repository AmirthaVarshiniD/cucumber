package com.api.cucumber.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/main/java/com/api/cucumber/featurefile/TC003.feature"},
		glue = {"wdMethods","com.api.cucumber"},
		dryRun = false,
		monochrome = true
		)
public class RunTest {

}
