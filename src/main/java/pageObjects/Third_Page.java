package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Third_Page extends BasePage {
	public @FindBy(css = "a.login") WebElement link_SignIn;
	public @FindBy(css = "input[name='email_create']") WebElement textfield_EmailAddress;
	public @FindBy(css = "button#SubmitCreate") WebElement button_CreateAnAccount;

	public Third_Page() throws IOException {
		super();
	}

	public Third_Page testVerifySuccessfullyNavigatedToURL(String url) throws IOException, InterruptedException {
		getDriver().get(url);
		System.out.println("Inside Page Class...");
		return new Third_Page();
	}

	public Third_Page clickOnSignInLink() throws IOException {
		link_SignIn.click();
		return new Third_Page();
	}

	public Third_Page enterEmailAddress(String email) throws IOException {
		scrollToElementByWebElementLocator(textfield_EmailAddress);
		textfield_EmailAddress.sendKeys(email);
		return new Third_Page();
	}

	public Third_Page clickOnCreateAnAccountButton() throws IOException {
		button_CreateAnAccount.click();
		return new Third_Page();
	}

	
}
