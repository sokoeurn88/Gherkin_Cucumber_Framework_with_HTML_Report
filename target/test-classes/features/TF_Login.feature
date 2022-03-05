@Login @Smoke 
Feature: Techfios login functionality validation 

@Scenario1 
Scenario Outline: 1 User should be able to login with valid credentials 
	Given User is on Techfios login page 
	When User enter user name as "<username>" 
	When User enter password as "<password>" 
	And User click on Signin button 
	Then User should land on Dashboard page 
	Examples:
	|username|password|
	|demo@techfios.com|abc123|
	|demo@techfios.com|abc124|
	|demo4@techfios.com|abc123|
	|demo4@techfios.com|abc124|