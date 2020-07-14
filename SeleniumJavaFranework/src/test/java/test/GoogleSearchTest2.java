package test;

//import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Googlesearch;;

public class GoogleSearchTest2 {
	private static WebDriver driver = null;
	

	public static void main(String[] args) {
		Googlesearch();
			
	}

public static void Googlesearch(){
	driver = new ChromeDriver();
			
	driver.get("https://google.com/");
	//driver.findElements(By.name("q")).sendKeys("VIJAYA");
	//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	
	Googlesearch.textbox_search(driver).sendKeys("VIJAYA");
	Googlesearch.button_search(driver).sendKeys(Keys.RETURN);
	driver.close();
	
	}
}