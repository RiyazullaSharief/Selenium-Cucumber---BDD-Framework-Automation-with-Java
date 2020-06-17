package pageObjects;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class AutomationPractice_Page extends BasePage {
	public @FindBy(css = "a.login") WebElement button_SignIn;
	public @FindBy(css = "input[name='email_create']") WebElement textfield_EmailAddress;
	public @FindBy(css = "button#SubmitCreate") WebElement button_CreateAnAccount;
	public @FindBy(css = "span.navigation_page") WebElement registrationPage;
	public @FindBy(css = "div.radio-inline") List<WebElement> radioButton;
	public @FindBy(css = "input#customer_firstname") WebElement textfield_FirstName;
	public @FindBy(css = "input#customer_lastname") WebElement textfield_LastName;
	public @FindBy(css = "input#passwd") WebElement textfield_Password;
	public @FindBy(css = "select#days") WebElement dropDownDays;
	public @FindBy(css = "select#months") WebElement dropDownMonths;
	public @FindBy(css = "select#years") WebElement dropDownYears;
	public @FindBy(css = "input#address1") WebElement textfield_Address;
	public @FindBy(css = "input#city") WebElement textfield_City;
	public @FindBy(css = "select#id_state") WebElement dropDown_State;
	public @FindBy(css = "input#postcode") WebElement textfield_PostalCode;
	public @FindBy(css = "select#id_country") WebElement dropDown_Country;
	public @FindBy(css = "input#phone_mobile") WebElement textfield_PhoneNumber;
	public @FindBy(css = "span.navigation_page") WebElement registrationSuccessful;
	
	
	public AutomationPractice_Page() throws IOException {
		super();
	}

	public AutomationPractice_Page clickOnSignInButton() throws IOException {
		button_SignIn.click();
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterEmailAddress() throws IOException {
		String email = RandomStringUtils.random(5, "abcdefghijklmnopqrstuvwxyz") + "@" + "mail.com";
		scrollToElementByWebElementLocator(textfield_EmailAddress);
		textfield_EmailAddress.sendKeys(email);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page clickOnCreateAnAccountButton() throws IOException {
		button_CreateAnAccount.click();
		return new AutomationPractice_Page();
	}

	public void validateRegistrationPage() throws InterruptedException {
		getDriver().getCurrentUrl().contains("account-creation");
		//Assert.assertEquals("Authentication", registrationPage.getText());
	}
	
	public AutomationPractice_Page clickOnRadioButton() throws IOException, InterruptedException {
		Thread.sleep(3000);
		radioButton.get(0).click();
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterFirstName() throws IOException {
		Faker faker = new Faker();
		String firstName = faker.name().firstName().replaceAll("'", "");
		textfield_FirstName.sendKeys(firstName);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterLastName() throws IOException {
		Faker faker = new Faker();
		String lastName = faker.name().lastName().replaceAll("'", "");
		textfield_LastName.sendKeys(lastName);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterPassword() throws IOException {
		textfield_Password.sendKeys("Password1");
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterDateMonthAndYearOfBirth() throws IOException {
		Random rand = new Random();
		//int randomNum = rand.nextInt((max - min) + 1) + min;
		int randomDate = rand.nextInt((31 - 1) + 1) + 1;
		String dd = Integer.toString(randomDate);
		Select drpDays = new Select(dropDownDays);
		drpDays.selectByValue(dd);
		
		int randomMonth = rand.nextInt((12 - 1) + 1) + 1;
		String mm = Integer.toString(randomMonth);
		Select drpMonths = new Select(dropDownMonths);
		drpMonths.selectByValue(mm);
		
		int randomYears = rand.nextInt((2020 - 1900) + 1) + 1900;
		String yy = Integer.toString(randomYears);
		Select drpyears = new Select(dropDownYears);
		drpyears.selectByValue(yy);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterAddress(String add) throws IOException {
		textfield_Address.sendKeys(add);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterCity(String city) throws IOException {
		textfield_City.sendKeys(city);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterState(String state) throws IOException {
		Select drpState = new Select(dropDown_State);
		drpState.selectByVisibleText(state);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterPostalCode(String postalCode) throws IOException {
		textfield_PostalCode.sendKeys(postalCode);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page selectCountry(String country) throws IOException {
		Select drpCountry = new Select(dropDown_Country);
		drpCountry.selectByVisibleText(country);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page enterPhoneNumber() throws IOException {
		String phoneNumber = RandomStringUtils.random(10, "1234567890");
		textfield_PhoneNumber.sendKeys(phoneNumber);
		return new AutomationPractice_Page();
	}

	public AutomationPractice_Page verifyUserIsSuccessfullyRegistered() throws IOException {
		getDriver().getCurrentUrl().contains("controller=my-account");
		//Assert.assertEquals("My account", registrationSuccessful.getText());
		return new AutomationPractice_Page();
	}

	
}
