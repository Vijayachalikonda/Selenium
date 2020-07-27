package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws Exception {
		test();

	}
	
	public static void test() throws Exception{
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://tinyupload.com/");
		
		driver.findElement(By.name("uploaded_file")).click();
		Runtime.getRuntime().exec("D:/FileUploadScript.exe");
		Thread.sleep(30000);
		driver.close();
	}

}
