package ItBootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Vesti {
	
	//public static final String VESTI = "//*[@id=\"masthead\"]/div[2]/div/div/div[4]/div/ul/li[2]/ul/li[1]/a";

	public static final String URL = "https://itbootcamp.rs/#";

	public static void submit(WebDriver driver) {
	driver.findElement(By.name("VESTI")).click();

	}	
	public static void clickVesti1(WebDriver driver) {
		driver.findElement(By.partialLinkText("Vesti")).click();
		
}
}