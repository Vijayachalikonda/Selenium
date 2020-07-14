package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	WebDriver driver= null;
	
	@BeforeTest
	public void setUpTest(){
		 driver = new ChromeDriver();
		
	}

	@Test(dataProvider = "test1data")
	public void test1(String Username, String Password) throws InterruptedException{
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getdata(){
		String projectPath = System.getProperty("user.dir");
		String excelPath = (projectPath+"/excel/data.xlsx");
		Object data[][] = testdata (excelPath, "Sheet1");
		return data;
	}
	
	public Object[][] testdata(String excelPath, String sheetName){

		Excelutility excel = new Excelutility(excelPath, sheetName);


		int rowCount = excel.getRowCount();

		int colCount = excel.getcolCount();

		Object data [][] = new Object [rowCount-1][colCount];

		for(int i=1; i<rowCount; i++){
			for(int j=0; j<colCount; j++){

				String CellData = excel.getCellDataString(i, j);
//				System.out.println(CellData+ " | ");
				data[i-1][j]= CellData;


			}

		}
		return data;

	}
}



