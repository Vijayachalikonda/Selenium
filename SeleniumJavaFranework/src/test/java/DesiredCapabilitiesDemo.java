import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilitiesDemo {


	public static void main(String[] args) {
		
			
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("javascriptEnabled", true);
		caps.setCapability("browserVersion", 11);
		
		WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		
	}

	

}
