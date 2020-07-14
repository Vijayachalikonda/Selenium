package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Test
public class TestNGMultiBrowserDemo {
	WebDriver driver;
	
	@BeforeTest
	@Parameters("browserName")
	public void setup(@Optional String browserName){
		System.out.println("Browser Name is:"+browserName);

		if(browserName.equalsIgnoreCase("chrome")){
			
//			String projectPath= System.getProperty("user. dir");
//			(projectPath+"/geckodriver/driver\Chromedriver\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("ie")){
			driver = new InternetExplorerDriver();
		}

	}


	@Test
	public void test1() {
		driver.get("https://google.com");
		try {
		Thread.sleep(2000);
		
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception:" + e);
		}

	}
}