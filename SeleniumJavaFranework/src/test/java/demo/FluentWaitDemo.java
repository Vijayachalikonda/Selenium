package demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		test1();
	}
	
	
	public static void test1(){

        String baseUrl = "http://demo.guru99.com/test/link.html";					
//        System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        
        driver. get(baseUrl);
//		driver.findElement(By.name("q")).sendKeys("Automation");
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
//        driver.get(baseUrl);	
        System.out.println("title of page is: " + driver.getTitle());
        driver.findElement(By.linkText("click here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
	}

	public static void test() throws InterruptedException{

		WebDriver driver = new ChromeDriver();
		driver. get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	//	driver.findElement(By.linkText("ABCD - Assuring Better Child Health & Development | Smart ..."));

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		@SuppressWarnings("unused")
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@SuppressWarnings("null")
			public WebElement apply(WebDriver driver) {
				WebElement linkElements = driver.findElement(By.linkText("www.techopedia.com"));
				
				WebElement linkElement = null;
				if(linkElement.isEnabled()){
					System.out.println("Element Found");
					
				}
			
			return linkElement;
		}
		});
		
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}

}
