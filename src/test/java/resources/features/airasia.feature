Feature: Flight Search on AirAsia

@airasia
Scenario Outline: Verifying error message by entering invalid credentials
	Given User naviges to "<url>" website
	And User verifies the title
	When User verify and click on the login button
	When User enters an invalid email address
	And User enters an invalid password
	When User clicks on the login "<button>"
	Then User verify the error message 
	
	Examples: 
	|		 	 	url	   			  |				button		 	|
	| https://www.airasia.com/en/home |  	button[type='submit']	|
	