package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class TravelSteps extends DriverFactory {
	
	@Given("^User navigates to website \"([^\"]*)\"$")
	public void user_navigates_to_website(String url) {
		getDriver().get(url);
	}

	@And("^User clicks on register link$")
	public void user_clicks_on_register_link() throws Throwable {
		newToursPage.clickOnRegisterlink();
	}

	@When("^User enters a valid firstname \"([^\"]*)\"$")
	public void user_enters_a_valid_firstname(String firstname) throws Throwable {
		newToursPage.enterFirstName(firstname);
	}

	@When("^User enters a valid lastname \"([^\"]*)\"$")
	public void user_enters_a_valid_lastname(String lastname) throws Throwable {
		newToursPage.enterLastName(lastname);
	}

	@When("^User enters a valid phone number \"([^\"]*)\"$")
	public void user_enters_a_valid_phone_number(String phoneNumber) throws Throwable {
		newToursPage.enterPhoneNumber(phoneNumber);
	}

	@When("^User enters a valid email address \"([^\"]*)\"$")
	public void user_enters_a_valid_email_address(String emailAddress) throws Throwable {
		newToursPage.enterEmailAddress(emailAddress);
	}

	@And("^User enters a valid address \"([^\"]*)\"$")
	public void user_enters_a_valid_address(String address) throws Throwable {
		newToursPage.enterAddress(address);
	}

	@And("^User enters a valid city \"([^\"]*)\"$")
	public void user_enters_a_valid_city(String city) throws Throwable {
		newToursPage.enterCity(city);
	}

	@And("^User enters a valid state \"([^\"]*)\"$")
	public void user_enters_a_valid_state(String state) throws Throwable {
		newToursPage.enterState(state);
	}

	@And("^User enters a valid postal code \"([^\"]*)\"$")
	public void user_enters_a_valid_postal_code(String postalCode) throws Throwable {
		newToursPage.enterPostalCode(postalCode);
	}

	@And("^User selects country as India$")
	public void user_selects_country_as_India() throws Throwable {
		newToursPage.selectCountry();
	}

	@When("^User enters a valid username \"([^\"]*)\"$")
	public void user_enters_a_valid_username(String userName) throws Throwable {
		newToursPage.enterUserName(userName);
	}

	@When("^User enters a valid password \"([^\"]*)\"$")
	public void user_enters_a_valid_password(String password) throws Throwable {
		newToursPage.enterPassword(password);
	}

	@When("^User enters the same \"([^\"]*)\" in the confirm password field$")
	public void user_enters_the_same_in_the_confirm_password_field(String confirmPassword) throws Throwable {
		newToursPage.enterConfirmPassword(confirmPassword);
	}

	@When("^User clicks on the submit button")
	public void user_clicks_on_the_submit() throws Throwable {
		newToursPage.clickOnSubmitButton();
	}

	@Then("^User should be successfully registered$")
	public void user_should_be_successfully_registered() throws Throwable {
		newToursPage.verifySuccessfullyRegistered();
	}

	
}
