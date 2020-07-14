package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class TestNGListenerDemo {
	@Test
	public void test1(){
		System.out.println("I am inside test1");
	}
	@Test
	public void test2(){
		System.out.println("I am inside test2");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("abcd")).sendKeys(Keys.RETURN);
		driver.close();
	}
	@Test
	public void test3(){
		System.out.println("I am inside test3");
	}
}
