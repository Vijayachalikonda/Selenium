
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsertesting2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		//driver.findElement(By.name("q")).sendKeys("abcd");
		List<WebElement> listofInputElements = driver.findElements(By.xpath("//input"));
		
		int count = listofInputElements.size();
		System.out.println("Count of Imput Elements :" + count);
		
//				WebDriver driver = new FirefoxDriver();
				//driver.get("https://yahoo.com/");
				//driver.findElement(By.id("gh-search-input")).sendKeys("abcd");
		//try {
			System.out.println("wait time start.");
//			synchronized (driver)
//			{
//			//driver.wait(2000);
//			}
			System.out.println("wait time end.");
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		}
		//driver.close();
		//System.out.println("closed browser......");
		
		

	}
