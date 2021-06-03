package ItBootcamp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestiiranjeBootCamp {

	public static final String OPEN_SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String SEARCH_XPATH = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://itbootcamp.rs/"); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.getTitle();
		driver.navigate().to("https://itbootcamp.rs/course/testiranje-softvera/");
		driver.navigate().refresh();
		driver.navigate().to("https://itbootcamp.rs/obaveze-polaznika/");
		driver.navigate().back();
		driver.navigate().forward();

		//driver.navigate().forward(); – sledeca stranica
		//driver.navigate().back(); – stranica unzad
		//driver.navigate().refresh(); – osvezi stranicu ucitaj ponovo
		//driver.navigate().to(“url”); – isto kao get.url ista funkcija

		//Ovako saznajemo koje nam je velicine browser kada se program pokrene
		//ispisujemo na konzoli kako bi smo mogli da postavimo te iste dimenzije dole
		//i vratimo na prvobitnu velicinu

		/*Dimension point = driver.manage().window().getSize();
		System.out.println(point);*/
		//Da ne bi smo stavljali dimenzije, pravimo ovako
		Dimension windowsize = driver.manage().window().getSize();


		//maksimizujemo browser
		driver.manage().window().maximize();

		//fullscreen prozora
		//driver.manage().window().fullscreen();

		try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

		//vracamo na prvobitnu velicinu (width, height)
		//driver.manage().window().setSize(new Dimension(1051, 815));
		driver.manage().window().setSize(windowsize);

		try {
		Thread.sleep(4000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}

		driver.manage().window().maximize();

		//driver.findElement(By.linkText("Search")).click();
		WebElement openSearch = driver.findElement(By.xpath(OPEN_SEARCH_XPATH));
		openSearch.click();

		//+ "\n" sluzi kao enter
		WebElement search = driver.findElement(By.xpath(SEARCH_XPATH));
		search.sendKeys("testiranje" + "\n");

		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
		FileUtils.copyFile(file, new File("C:\\Users\\njego\\Desktop\\ScreenShot\\Test.jpeg"));
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace(); // 

	}
	}
}
