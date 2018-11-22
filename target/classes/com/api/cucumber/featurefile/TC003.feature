Feature: Create new lead

Background:
Given User login with the following username and password with data in excel at "C:\Users\Vidhyuth\Downloads\PageObjectModel\PatternObjectModel\data\TC003.xlsx"
Scenario: Creating new Lead
 
When Enter Lead details from excel at "C:\Users\Vidhyuth\Downloads\CucumberTutorial-master\CucumberTutorial-master\TestData\TC003.xlsx"
Then Success Login