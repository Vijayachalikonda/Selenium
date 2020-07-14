package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Googlesearchobjects;


public class GoogleSearchTest3 {

	static WebDriver driver = null;
	public static void main(String[] args) {
		Googlesearchobjects();
	}
	
	public static void Googlesearchobjects(){
		driver = new ChromeDriver();
		Googlesearchobjects searchpageObj = new Googlesearchobjects(driver);
		driver.get("https://google.com/");
		searchpageObj.setTextBoxInsert("V I J A Y A");
		searchpageObj.clickButtonBox();
		driver.close();
	}
}
