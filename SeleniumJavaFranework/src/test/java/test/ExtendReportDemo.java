package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtendReportDemo {
	static WebDriver driver = null;

	public static void main(String[] args) {
		
			
		ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("extentreports.html");
		   ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        ExtentTest test1 = extent.createTest("Google Search Test one", "Googe search functionality");
	        test1.log(Status.INFO, "Starting Test Case");
	        driver = new ChromeDriver();
	        test1.pass("Calling Google.com");
	        
	        driver.get("https://google.com");
	        driver.findElement(By.name("q")).sendKeys("VIJAYA");
	        
	        test1.pass("Enter VIJAYA in search box");
	        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	        
	        test1.pass("Click Submit button");
	        driver.close();
	        
	        test1.pass("Close Browser");
	        test1.info("Test Completed Successfully");
	        
	        extent.flush();
	}

}
