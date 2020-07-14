package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaiteDemo {
	static WebDriver driver = null;
	
	public static void main(String[] args) {
		seleniumWaits();
	}
	
	public static void seleniumWaits(){
	
	WebDriver driver = new ChromeDriver();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver. get("https://google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcedf")));
		driver.findElement(By.name("abcd")).sendKeys("Automation");
		driver.close();
		driver.quit();
		
	
}
}
