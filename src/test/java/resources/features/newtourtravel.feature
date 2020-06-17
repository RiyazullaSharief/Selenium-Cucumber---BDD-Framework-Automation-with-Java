Feature: Register users on newtours.demoaut.com website

@travel
Scenario Outline: Registering users
	Given User navigates to website "<url>"
	And User clicks on register link
	When User enters a valid firstname "<firstname>"
	When User enters a valid lastname "<lastname>"
	When User enters a valid phone number "<phone number>"
	When User enters a valid email address "<email address>"
	And User enters a valid address "<address>"
	And User enters a valid city "<city>"
	And User enters a valid state "<state>"
	And User enters a valid postal code "<postal code>"
	And User selects country as India
	When User enters a valid username "<username>"
	When User enters a valid password "<password>"
	When User enters the same "<password>" in the confirm password field
	When User clicks on the submit button
	Then User should be successfully registered

Examples: 
	|		 	 			url	   				 	 |firstname |lastname|phone number|		email address		 |			address			|	city	|	state	   |postal code|  username |  password  |
	| http://newtours.demoaut.com/mercurywelcome.php |  Felipa	|  Upton | 8345533678 |felipa.upton@mail.com 	 |#231, 1st cross, 2nd main	|Bangalore  |Karnataka	   |  560056   |felipa	   |hello@123	|
	| http://newtours.demoaut.com/mercurywelcome.php |  Shany	| Gibson | 7342315674 |shany.gibson@mail.com	 |#45, 11th cross, 1st main	|Mumbai	 	|Maharashtra   |  400004   |shany	   |welcome@123	|
	| http://newtours.demoaut.com/mercurywelcome.php |  Jones	| Green	 | 9876543456 |jones.green@mail.com		 |#212, 4th cross, 9th main	|New Delhi	|Delhi		   |  100021   |jones	   |master@123	|
	| http://newtours.demoaut.com/mercurywelcome.php | Albert	|Einstein| 9876677612 |albert.einstein@mail.com	 |#45, 17th cross, 5th main	|Chennai	|Tamil Nadu	   |  600005   |albert	   |great@123   |
	| http://newtours.demoaut.com/mercurywelcome.php | Stephen	|Hawking | 8976543223 |stephen.hawking@mail.com	 |#313, 3rd cross, 3rd main	|Pune		|Maharashtra   |  411006   |stephen	   |Mind@123	|
	| http://newtours.demoaut.com/mercurywelcome.php |  Cayla	|Reichel | 6754432345 |cayla.reichel@mail.com	 |#564, 2nd cross, 1st main	|Agra		|Uttar Pradesh |  223007   |cayla	   |King@123	|
	| http://newtours.demoaut.com/mercurywelcome.php |Riyazulla |Sharief | 9087654567 |riyazulla.sharief@mail.com|#7/1, 1st cross, 2nd main	|Bangalore	|Karnataka	   |  560022   |riyazulla  |Sweetlife@4	|
	| http://newtours.demoaut.com/mercurywelcome.php |Kaleemulla|Sharief | 8876513876 |kaleemulla.sharief@mailcom|#9/1, 1st cross, 9th main	|Bangalore  |Karnataka	   |  560022   |kaleemulla |Cisco@123 	|
	| http://newtours.demoaut.com/mercurywelcome.php | Mohammed	|Sharief | 8861538765 |mohammed.sharief@mail.com |#54, 14th cross, 1st main	|Hyderabad	|Telangana	   |  500011   |mohammed   |Rvce@123 	|
	| http://newtours.demoaut.com/mercurywelcome.php |  Armando	|  Batz  | 9087864621 |armando.batz@mail.com	 |#32, 12th cross, 4th main	|Noida	 	|Uttar Pradesh |  110096   |armando	   |Yellow@123	|
	
	
	
	