package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ThirdStep extends DriverFactory {
	WebDriver driver = Hooks.driver;
	String dirPath = System.getProperty("user.dir");

	@Given("^user is successfully navigated to url \"([^\"]*)\"$")
	public void user_is_successfully_navigated_to_url(String url) throws IOException, InterruptedException {
		driver.get(url);
		Assert.assertEquals("My Store", driver.getTitle());
		//		thirdPage.testVerifySuccessfullyNavigatedToURL(url);
	}

	@When("^user clicks on sign in link$")
	public void user_clicks_on_sign_in_link() throws IOException {
		driver.findElement(By.cssSelector("a.login")).click();
		//		thirdPage.clickOnSignInLink();
	}

	@And("^Enter the already existing \"([^\"]*)\" in the email field$")
	public void enter_the_already_existing_in_the_email_field(String emailId) throws IOException, InterruptedException {
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.id("SubmitCreate"));
		Actions actions = new Actions(driver);
		actions.moveToElement(email).perform();
		driver.findElement(By.cssSelector("input[name='email_create']")).sendKeys(emailId);
		//		thirdPage.enterEmailAddress(emailId);
	}

	@And("^click on the Create account Button$")
	public void click_on_the_Create_account_Button() throws Throwable {
		driver.findElement(By.cssSelector("button#SubmitCreate")).click();
		//		thirdPage.clickOnCreateAnAccountButton();
	}

	@Then("^An error message should be displayed by the application \"([^\"]*)\"$")
	public void an_error_message_should_be_displayed_by_the_application(String expected) throws InterruptedException {
		if(expected.equalsIgnoreCase("true")||expected.equalsIgnoreCase("yes"))
		{
			Thread.sleep(3000);
			Assert.assertTrue(driver.findElement(By.id("create_account_error")).isDisplayed());
		}
		else
		{
			System.out.println("It should not be displayed.");
		}
	}

	@And("^verify the text of the error is \"([^\"]*)\" in case of error message is \"([^\"]*)\"$")
	public void verify_the_text_of_the_error_is_in_case_of_error_message_is(String errorMessage, String expected) throws Throwable {
		Thread.sleep(3000);
		if(expected=="true")
		{
			String text = driver.findElement(By.id("create_account_error")).getText();
			Assert.assertEquals(errorMessage, text);
		}
	}


}
