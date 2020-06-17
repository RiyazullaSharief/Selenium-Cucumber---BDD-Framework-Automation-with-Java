package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	static WebDriver driver;
	String dirPath = System.getProperty("user.dir");
	
	
//    @Before(value = "@airasia, @travel, @automationpractice, @dev", order=1)
    @Before(value = "@dev", order=1)
    public void launching_browser() {
        System.out.println("this is running before every scenario. it is first before hook");
        System.setProperty("webdriver.chrome.driver", dirPath + "\\src\\test\\java\\resources\\drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    }

//    @Before(value = "@airasia, @travel, @automationpractice, @dev", order=1)
    @Before(value = "@dev", order=1)
    public void second_hook()
    {
    	System.out.println("This is running before every scenario. it is second before hook");
    }
    
    
//    @After(value = "@airasia, @travel, @automationpractice, @dev", order=1)
    @After(value = "@dev", order=1)
    public void after_second_hook()
    {
    	try {
    		if (driver != null) {
            	driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
    	}
    	
    	catch (Exception e) {
            System.out.println("Error catched: " + e.getMessage());
        }
    }
    
    

}