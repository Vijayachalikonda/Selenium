package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.testng.internal.PropertiesFile;
import Config.propertiefile;

public class TestNG {
	WebDriver driver = null;
	public static String browserName="null";

	@BeforeTest
	public void setUPtest(){
		//String projectpath = System.getProperty("user. dir");
		propertiefile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}


		System.out.println("Before test");
	}
	
	
	@Test
	public void Googlesearchtest(){
	
		System.out.println(" In Test"); 
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("VIJAYA");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		//Googlesearch.textbox_search(driver).sendKeys("VIJAYA");
		//Googlesearch.button_search(driver).sendKeys(Keys.RETURN);
	}

	@AfterTest
	public void closebrowser(){
		driver.close();
		//driver.quit();
		System.out.println("Browser is Closed");

	}
}