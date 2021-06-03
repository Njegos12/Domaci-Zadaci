package ItBootcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestStraniceVesti {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testButton() {
		driver.navigate().to(HomePage.URL);
		HomePage.clickVesti(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = Vesti.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
	}
}
