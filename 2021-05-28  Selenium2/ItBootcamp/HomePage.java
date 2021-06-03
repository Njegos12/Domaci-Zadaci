package ItBootcamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static final String URL = "https://itbootcamp.rs/"; 

	public static void clickVesti(WebDriver driver) {
		driver.findElement(By.linkText("VESTI")).click();
	}
	
	


		
	
}
