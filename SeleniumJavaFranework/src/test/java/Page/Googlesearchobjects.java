package Page;

//import org.jsoup.internal.StringUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearchobjects {

	WebDriver driver = null;
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");

public Googlesearchobjects (WebDriver driver){
	this.driver = driver;
}

public void setTextBoxInsert(String text){
driver.findElement(textbox_search).sendKeys(text);
}

public void clickButtonBox(){
driver.findElement(button_search).sendKeys(Keys.RETURN);	
}
}