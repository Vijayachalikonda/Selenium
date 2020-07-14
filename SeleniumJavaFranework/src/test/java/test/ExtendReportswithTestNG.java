package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtendReportswithTestNG {

	static WebDriver driver = null;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeSuite
	public void setUP(){

		htmlReporter =new ExtentHtmlReporter("extentreports.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@BeforeTest
	public void setup(){
		   
	        driver = new ChromeDriver();
	}
	@Test
	public void test1() throws Exception{
		
		ExtentTest test1 = extent.createTest("Google Search Test one", "Googe search functionality");
		driver.get("https://google.com/");
		test1.pass("Navigate to Goole.com");
		driver.findElement(By.name("q")).sendKeys("VIJAYA");
		test1.pass("Enter Value in textbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Press Enter button");
		
		// log(Status, details)
		test1.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test1.info("This step shows usage of info(details)");

		// log with snapshot
		test1.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test1.addScreenCaptureFromPath("screenshot.png");
		
		
	}
	
	@AfterTest
	public void teardownTest(){
		driver.close();
		driver.quit();
		System.out.print("Testing completed successfully");
	}
	@AfterSuite
	public void teardown(){
		extent.flush();
	}

}


