@DbLogin
Feature: Techfios other login functionality validation driving data from MySQL database 

Background: 
	Given User is on Techfios login page 	

@DbScenario1	
Scenario: User should be able to login with valid credentials and open a new account 

	When User enter "username" from mysql database		
	When User enter "password" from mysql database		
	And User click on Signin button 
	Then User should land on Dashboard page	