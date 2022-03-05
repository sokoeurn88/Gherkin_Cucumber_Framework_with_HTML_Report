@OtherLogin 
Feature: Techfios other login functionality validation 

Background: 
	Given User is on Techfios login page 
	
@OtherScenario1 
Scenario: 1 User should not be able to login with invalid credentials 

	When User enter user name as "demo2@techfios.com" 
	When User enter password as "abc123" 
	And User click on Signin button 
	Then User should land on Dashboard page 
	
@OtherScenario2 
Scenario: 2 User should not be able to login with invalid credentials 

	When User enter user name as "demo@techfios.com" 
	When User enter password as "abc1234" 
	And User click on Signin button 
	Then User should land on Dashboard page 
	
@Scenario2 
Scenario: 2 User should be able to login with valid credentials 

	When User enter user name as "demo@techfios.com" 
	When User enter password as "abc1234" 
	And User click on Signin button 
	Then User should land on Dashboard page 
	
@Scenario3 
Scenario: 3 User should be able to login with valid credentials 

	When User enter user name as "demo4@techfios.com" 
	When User enter password as "abc123" 
	And User click on Signin button 
	Then User should land on Dashboard page 
	
@Scenario4 
Scenario: 4 User should be able to login with valid credentials 

	When User enter user name as "demo4@techfios.com" 
	When User enter password as "abc1234" 
	And User click on Signin button 
	Then User should land on Dashboard page 