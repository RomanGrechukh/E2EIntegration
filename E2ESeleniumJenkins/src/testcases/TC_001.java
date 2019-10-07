package testcases;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();
	}
}
