Feature: As a new user I would like to create the new account
Background:
	Given user is successfully navigated to url "http://automationpractice.com/index.php"
	When user clicks on sign in link
@dev
 Scenario Outline: create new account
	And Enter the already existing "<Username>" in the email field
	And click on the Create account Button
	Then An error message should be displayed by the application "<Enabled>"
	And verify the text of the error is "<ErrorMessage>" in case of error message is "<Enabled>"
	
	Examples:
	|		Username		  |						 ErrorMessage							  |Enabled|
	|test@gmail.com			  |An account using this email address has already been registered|	true  |
	|testingpurpose@gmail.com |An account using this email address has already been registered|	false |
	|mahesh@gmail.com		  |An account using this email address has already been registered|	true  |
	|ust@gmail.com			  |An account using this email address has already been registered|	false |
	|kreigy1310garg@gmail.com |An account using this email address has already been registered|	false |
	
