package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;

public class AirasiaSteps extends DriverFactory {

	@Given("^User naviges to \"([^\"]*)\" website$")
	public void user_naviges_to_website(String url) {
		getDriver().get(url);
	}

	@And("^User verifies the title$")
	public void user_verifies_the_title() throws Throwable {
		searchFlightsPage.confirmWebsiteWasLaunchedSuccessfully();
	}

	@When("^User clicks on flights Icon$")
	public void user_clicks_on_Icon() throws Throwable {
		searchFlightsPage.clickonFlightsIcon();
	}

	@When("^User enters origin as Bengaluru\\(BLR\\)$")
	public void user_enters_origin_as_Bengaluru_BLR() throws Throwable {
		searchFlightsPage.enterOriginLocation();
	}

	@When("^User enters destination as Pune$")
	public void user_enters_destination_as_Pune() throws Throwable {
		searchFlightsPage.enterDestinationLocation();
	}

	@And("^User selects the dates$")
	public void user_selects_the_dates() throws Throwable {
		searchFlightsPage.enterDates();
	}

	@And("^User selects return date as One Way$")
	public void user_selects_return_date_as_One_Way() throws Throwable {
		searchFlightsPage.selectOneWayTrip();
	}

	@And("^User clicks on confirm button$")
	public void user_clicks_on_confirm_button() throws Throwable {
		searchFlightsPage.clickOnConfirmbutton();
	}
	
	@When("^User clicks on the search \"([^\"]*)\"$")
	public void user_clicks_on_the_search(String searchButton) throws Throwable {
		BasePage basePage = new BasePage();
		basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.cssSelector(searchButton));
		getDriver().findElement(By.cssSelector(searchButton)).click();
	}

	@Then("^User should be successfully navigated to the search flight page$")
	public void user_should_be_successfully_navigated_to_the_search_flight_page() throws Throwable {
		searchFlightsPage.confirmSuccessfullyNavigatedToSearchFlightPage();
	}
	
	//======================================================================================

	@When("^User verify and click on the login button$")
	public void user_verifies_the_login_button() throws Throwable {
		searchFlightsPage.verifyAndClickOnLoginButton();
	}

	@When("^User enters an invalid email address$")
	public void user_enters_an_invalid_email_address() throws Throwable {
		searchFlightsPage.enterInvalidEmailAddress();
	}

	@And("^User enters an invalid password$")
	public void user_enters_an_invalid_password() throws Throwable {
		searchFlightsPage.enterInvalidPassword();
	}

	@When("^User clicks on the login \"([^\"]*)\"$")
	public void user_clicks_on_the_login(String loginButton) throws Throwable {
		getDriver().findElement(By.cssSelector(loginButton)).click();
	}

	@Then("^User verify the error message$")
	public void user_verify_the_error_message() throws Throwable {
		searchFlightsPage.verifyErrorMessage();
	}

}
