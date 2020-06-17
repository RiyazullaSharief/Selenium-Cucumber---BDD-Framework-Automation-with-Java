Feature: Searching for flights, Registering users and
Background:
	Given User navigates to "<url>" website
	When User clicks on sign in button
	
@automationpractice
Scenario Outline: Creating accounts
	When User enters a valid email address under create an account box
	And User clicks on create an account button
	And User validates you are on the registration page
	When User selects the title radio box
	When User enters a firstname
	When User enters a lastname
	When User enters a password
	When User selects date, month and year of birth
	And User enters an address "<address>"
	And User enters city "<city>"
	And User selects state "<state>"
	And User enters postal code "<postal code>"
	When User selects country "<country>"
	When User enters a phone number
	When User clicks on the register "<button>"
	Then Validate that user is successfully registered

Examples:
	|		 	 			url	   				|		  address		   |	city	|	 state 	  |	postal code|  	country	   |	   	button 	   	  |
	| http://automationpractice.com/index.php 	|  880 East End Road Homer |  Seldovia  | Alaska	  |	  99603    | United States | button#submitAccount |
	| http://automationpractice.com/index.php 	|  	200 ridgewood road	   |  Baltimore | Maryland   |	  21210    | United States | button#submitAccount |
	| http://automationpractice.com/index.php 	|	 210 W Broadway Ave	   |  Ritzville | Washington |	  99169    | United States | button#submitAccount |
	
