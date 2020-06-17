package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;
import utils.DriverFactory;

public class AutomationPracticeSteps extends DriverFactory {

	@Given("^User navigates to \"([^\"]*)\" website$")
	public void user_navigates_to(String url) throws Throwable {
		automationPracticePage.getDriver().get(url);
	}

	@When("^User clicks on sign in button$")
	public void user_clicks_on_sign_in_button() throws Throwable {
		automationPracticePage.clickOnSignInButton();
	}

	@When("^User enters a valid email address under create an account box$")
	public void user_enters_a_valid_email_address_under_create_an_account_box() throws Throwable {
		automationPracticePage.enterEmailAddress();
	}

	@And("^User clicks on create an account button$")
	public void user_clicks_on_create_an_account_button() throws Throwable {
		automationPracticePage.clickOnCreateAnAccountButton();
	}

	@And("^User validates you are on the registration page$")
	public void user_validates_you_are_on_the_registration_page() throws Throwable {
		automationPracticePage.validateRegistrationPage();
	}

	@When("^User selects the title radio box$")
	public void user_selects_the_title_radio_box() throws Throwable {
		automationPracticePage.clickOnRadioButton();
	}

	@When("^User enters a firstname")
	public void user_enters_a_firstname() throws Throwable {
		automationPracticePage.enterFirstName();
	}

	@When("^User enters a lastname")
	public void user_enters_a_lastname() throws Throwable {
		automationPracticePage.enterLastName();
	}

	@When("^User enters a password$")
	public void user_enters_a_password() throws Throwable {
		automationPracticePage.enterPassword();
	}

	@When("^User selects date, month and year of birth$")
	public void user_selects_date_month_and_year_of_birth() throws Throwable {
		automationPracticePage.enterDateMonthAndYearOfBirth();
	}

	@And("^User enters an address \"([^\"]*)\"$")
	public void user_enters_an_address(String address) throws Throwable {
		automationPracticePage.enterAddress(address);
	}

	@And("^User enters city \"([^\"]*)\"$")
	public void user_enters_city(String city) throws Throwable {
		automationPracticePage.enterCity(city);
	}

	@And("^User selects state \"([^\"]*)\"$")
	public void user_selects_state(String state) throws Throwable {
		automationPracticePage.enterState(state);
	}

	@And("^User enters postal code \"([^\"]*)\"$")
	public void user_enters_postal_code(String postalCode) throws Throwable {
		automationPracticePage.enterPostalCode(postalCode);
	}

	@When("^User selects country \"([^\"]*)\"$")
	public void user_selects_country(String country) throws Throwable {
		automationPracticePage.selectCountry(country);
	}
	

	@When("^User enters a phone number$")
	public void user_enters_a_phone_number() throws Throwable {
		automationPracticePage.enterPhoneNumber();
	}

	@When("^User clicks on the register \"([^\"]*)\"$")
	public void user_clicks_on_the_register(String locator) throws Throwable {
		BasePage basePage = new BasePage();
		basePage.WaitUntilWebElementIsVisibleUsingByLocator(By.cssSelector(locator));
		getDriver().findElement(By.cssSelector(locator)).click();
	}
	
	@Then("^Validate that user is successfully registered$")
	public void validate_that_user_is_successfully_registered() throws Throwable {
		automationPracticePage.verifyUserIsSuccessfullyRegistered();
	}

}
