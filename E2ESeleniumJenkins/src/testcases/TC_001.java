package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.gecko.driver", "C:/Program Files/Gecko/geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		FirefoxDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
}
