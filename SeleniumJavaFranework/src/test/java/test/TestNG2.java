package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.WebElement;

public class TestNG2 {
	static WebDriver driver = null;
	//static webElement element = null;
	
	@BeforeTest
	public void setUPtest(){
		driver = new ChromeDriver();	
		System.out.println("Before test");
	}
	@Test
public void Googlesearchtest2(){
				
		System.out.println(" In Test"); 
	driver.get("https://google.com/");
	driver.findElement(By.name("q")).sendKeys("VIJAYA");
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	//Googlesearch.textbox_search(driver).sendKeys("VIJAYA");
	//Googlesearch.button_search(driver).sendKeys(Keys.RETURN);
	}
	
	@Test
public void Googlesearchtest3(){
				
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
	System.out.println("Browser is Closed");
	
	}
}