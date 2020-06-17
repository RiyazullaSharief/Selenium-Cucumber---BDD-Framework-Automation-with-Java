package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AutomationPractice_Page;
import pageObjects.NewTours_Page;
import pageObjects.SearchFlights_Page;
import pageObjects.Third_Page;

public class DriverFactory {
	public static WebDriver driver;
	public static SearchFlights_Page searchFlightsPage;
	public static NewTours_Page newToursPage;
	public static AutomationPractice_Page automationPracticePage;
	public static Third_Page thirdPage;


	private ReadConfigFile config = new ReadConfigFile();

	@SuppressWarnings("deprecation")
	public WebDriver getDriver() {
		try {
			String browserName = config.getBrowser().toLowerCase();

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					WebDriverManager.firefoxdriver().setup();
					/*System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);*/
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					WebDriverManager.chromedriver().setup();
//					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;

            case "remote":
                    if (null == driver) {
                        URL url = new URL("http://128.199.54.189:4444/wd/hub");
                        System.out.println("! Using remote Webdirver: " + url);
                        ChromeOptions opts = new ChromeOptions();
                        driver = new RemoteWebDriver(url , opts);
                        driver.manage().window().maximize();
                    }
                break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			searchFlightsPage = PageFactory.initElements(driver, SearchFlights_Page.class); 
			newToursPage = PageFactory.initElements(driver, NewTours_Page.class);
			automationPracticePage = PageFactory.initElements(driver, AutomationPractice_Page.class);
			thirdPage = PageFactory.initElements(driver, Third_Page.class);
		}
		return driver;
	}
}
