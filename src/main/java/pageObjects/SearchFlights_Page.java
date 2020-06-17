package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchFlights_Page extends BasePage {

	public @FindBy(css = "button#product-tile-flight") WebElement flights_Icon;
	public @FindBy(css = "div.css-1dbjc4n input.css-11aywtz") List<WebElement> fromAndToField;
	public @FindBy(css = "div[class*='r-1f6g80x']") List<WebElement> selectOneWay;
	public @FindBy(css = "div[class*='r-z07lbi r-z2wwpe r-rs99b7']") WebElement confirmButton;
	public @FindBy(css = "input[type='email']") WebElement emailId;
	public @FindBy(css = "input[type='password']") WebElement password;
	public @FindBy(css = "div.sso-error-message > div") WebElement errorMessage;
	
	
	public SearchFlights_Page() throws IOException {
		super();
	}

	public SearchFlights_Page confirmWebsiteWasLaunchedSuccessfully() throws IOException, InterruptedException {
		WaitUntilWebElementIsVisible(flights_Icon);
		String getCurrentPageTitle = getDriver().getTitle();
		Assert.assertEquals("Book Flights, Hotels, Deals & Activities Online | AirAsia", getCurrentPageTitle);
		return new SearchFlights_Page();
	}

	public SearchFlights_Page clickonFlightsIcon() throws InterruptedException, IOException {
		/*Boolean b = new BasePage().isElementClickable(flights_Icon);
		System.out.println("Value of b is: " + b);*/
		waitAndClickElement(flights_Icon);
		return new SearchFlights_Page();
	}

	public SearchFlights_Page enterOriginLocation() throws Exception {
		clickOnTextFromDropdownList(fromAndToField.get(0), "Bengaluru");
		return new SearchFlights_Page();
	}

	public SearchFlights_Page enterDestinationLocation() throws Exception {
		clickOnTextFromDropdownList(fromAndToField.get(1), "Pune");
		return new SearchFlights_Page();
	}

	public SearchFlights_Page enterDates() throws IOException {
		fromAndToField.get(2).click();
		fromAndToField.get(2).sendKeys("15/12/2020");
		return new SearchFlights_Page();
	}

	public SearchFlights_Page selectOneWayTrip() throws IOException {
		selectOneWay.get(1).click();
		return new SearchFlights_Page();
	}

	public SearchFlights_Page clickOnConfirmbutton() throws IOException {
		confirmButton.click();
		return new SearchFlights_Page();
	}

	public SearchFlights_Page confirmSuccessfullyNavigatedToSearchFlightPage() throws IOException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(getDriver(),20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id*='booking-summary-airasia-button']")));
		/*WebElement searchFlightPage = getDriver().findElement(By.cssSelector("button[id*='booking-summary-airasia-button']"));
		WaitUntilWebElementIsVisible(searchFlightPage);*/
		Assert.assertEquals("Select Cheap Flights Tickets | AirAsia", getDriver().getTitle());
		return new SearchFlights_Page();
	}

	//======================================================================================
	
	public SearchFlights_Page verifyAndClickOnLoginButton() throws IOException {
//		WebElement loginButton = getDriver().findElement(By.cssSelector("div.buttontop"));
		WebElement loginButton = getDriver().findElement(By.cssSelector("span#loginModal"));
		WaitUntilWebElementIsVisible(loginButton);
		loginButton.click();
		return new SearchFlights_Page();
	}

	public SearchFlights_Page enterInvalidEmailAddress() throws IOException {
		emailId.sendKeys("a@gmail.com");
		return new SearchFlights_Page();
	}

	public SearchFlights_Page enterInvalidPassword() throws IOException {
		password.sendKeys("India1234");
		return new SearchFlights_Page();
	}

	public SearchFlights_Page verifyErrorMessage() throws IOException, InterruptedException {
		WaitUntilWebElementIsVisible(errorMessage);
		System.out.println("Error Message: " + errorMessage.getText());
		Assert.assertEquals("Your log in attempts has been unsuccessful. As a security measure, we’ve locked your account and you’re required to reset your password.",
				errorMessage.getText());
		return new SearchFlights_Page();
	}

}
