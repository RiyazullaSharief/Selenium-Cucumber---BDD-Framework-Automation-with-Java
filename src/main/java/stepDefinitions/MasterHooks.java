package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

    @Before("@airasia, @travel, @automationpractice")
    public void setup() {
        driver = getDriver();
    }

    @After("@airasia, @travel, @automationpractice")
    public void tearDown(Scenario scenario) throws InterruptedException {

        try {
            if (driver != null) {
                if (scenario.isFailed()) {
                    scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
                }
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
            if (driver != null) {
            	driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Error catched: " + e.getMessage());
        }
    }

}