Feature: Flight Search on AirAsia
	User should be able to search for flights
	
@airasia
Scenario Outline: Searching one way flight
	Given User naviges to "<url>" website
	And User verifies the title
	When User clicks on flights Icon
	When User enters origin as Bengaluru(BLR)
	When User enters destination as Pune
	And User selects the dates
	And User selects return date as One Way
	And User clicks on confirm button
	When User clicks on the search "<button>"
	Then User should be successfully navigated to the search flight page

Examples: 
	|		 	 	url	   			  |					button		 			|
	| https://www.airasia.com/en/home |  	div[aria-label='Clickable Search']	|
	
	
