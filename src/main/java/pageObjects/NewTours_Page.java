package pageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTours_Page extends BasePage {
	public @FindBy(xpath = "//*[contains(text(),'REGISTER')]") WebElement registerLink;
	public @FindBy(xpath = "//input[@name='firstName']") WebElement textfield_FirstName;
	public @FindBy(xpath = "//input[@name='lastName']") WebElement textfield_LastName;
	public @FindBy(xpath = "//input[@name='phone']") WebElement textfield_PhoneNumber;
	public @FindBy(xpath = "//input[@name='userName']") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//input[@name='address1']") WebElement textfield_Address;
	public @FindBy(xpath = "//input[@name='city']") WebElement textfield_City;
	public @FindBy(xpath = "//input[@name='state']") WebElement textfield_State;
	public @FindBy(xpath = "//input[@name='postalCode']") WebElement textfield_PostalCode;
	public @FindBy(xpath = "//select[@name='country']") WebElement selectCountry;
	public @FindBy(xpath = "//input[@name='email']") WebElement textfield_UserName;
	public @FindBy(xpath = "//input[@name='password']") WebElement textfield_Password;
	public @FindBy(xpath = "//input[@name='confirmPassword']") WebElement textfield_ConfirmPassword;
	public @FindBy(xpath = "//input[@name='register']") WebElement submit_Button;
	public @FindBy(xpath = "//*[contains(text(),'Thank you for registering.')]") WebElement registrationSuccessMessage;


	public NewTours_Page() throws IOException {
		super();
	}

	public void clickOnRegisterlink() {
		registerLink.click();
	}

	public NewTours_Page enterFirstName(String firstName) throws Exception {
		sendKeysToWebElement(textfield_FirstName, firstName);
		return new NewTours_Page();
	}

	public NewTours_Page enterLastName(String lastname) throws Exception {
		sendKeysToWebElement(textfield_LastName, lastname);
		return new NewTours_Page();
	}

	public NewTours_Page enterPhoneNumber(String phoneNumber) throws Exception {
		sendKeysToWebElement(textfield_PhoneNumber, phoneNumber);
		return new NewTours_Page();
	}

	public NewTours_Page enterEmailAddress(String emailAddress) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, emailAddress);
		return new NewTours_Page();
	}

	public NewTours_Page enterAddress(String address) throws Exception {
		sendKeysToWebElement(textfield_Address, address);
		return new NewTours_Page();
	}

	public NewTours_Page enterCity(String city) throws Exception {
		sendKeysToWebElement(textfield_City, city);
		return new NewTours_Page();
	}

	public NewTours_Page enterState(String state) throws Exception {
		sendKeysToWebElement(textfield_State, state);
		return new NewTours_Page();
	}

	public NewTours_Page enterPostalCode(String postalCode) throws Exception {
		sendKeysToWebElement(textfield_PostalCode, postalCode);
		return new NewTours_Page();
	}

	public NewTours_Page selectCountry() throws Exception {
		clickOnTextFromDropdownList(selectCountry, "India");
		return new NewTours_Page();
	}

	public NewTours_Page enterUserName(String userName) throws Exception {
		sendKeysToWebElement(textfield_UserName, userName);
		return new NewTours_Page();
	}

	public NewTours_Page enterPassword(String password) throws Exception {
		sendKeysToWebElement(textfield_Password, password);
		return new NewTours_Page();
	}

	public NewTours_Page enterConfirmPassword(String confirmPassword) throws Exception {
		sendKeysToWebElement(textfield_ConfirmPassword, confirmPassword);
		return new NewTours_Page();
	}

	public NewTours_Page clickOnSubmitButton() throws IOException {
		submit_Button.submit();
		return new NewTours_Page();
	}

	public NewTours_Page verifySuccessfullyRegistered() throws IOException, InterruptedException {
		WaitUntilWebElementIsVisible(registrationSuccessMessage);
		String text="Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		Assert.assertEquals(text, registrationSuccessMessage.getText());
		return new NewTours_Page();
	}

}
