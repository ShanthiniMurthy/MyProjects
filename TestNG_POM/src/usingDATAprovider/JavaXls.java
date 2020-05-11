package usingDATAprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JavaXls {
	String[][] data=null;
	WebDriver driver;
	
	@BeforeSuite
	public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		 driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	@DataProvider(name="loginData")
    public String[][] logindata() throws BiffException, IOException{
		data=Exceldata();
	    return data;
      }
	
	public String[][] Exceldata() throws BiffException, IOException{
		FileInputStream excel=new FileInputStream("C:\\Users\\sivap\\Downloads\\Selenium\\Test.xls");
		Workbook book= Workbook.getWorkbook(excel);
		Sheet sheet=book.getSheet(0);
		int rowc=sheet.getRows();
		int colc=sheet.getColumns();
	    
		String testdata[][]=new String[rowc-1][colc];
		
		for(int i=1;i<rowc;i++) {
			for(int j=0;j<colc;j++) {
				testdata[i-1][j]=sheet.getCell(j, i).getContents();
		
		}
		
	}
		
		return testdata;
	}
		
			@Test(dataProvider="loginData")
	public void main(String uname,String pword) {
		
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys(pword);
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	
	
	}
	
			@AfterSuite
			public void closeBrowser() {
				driver.quit();
			}
		
 
	

}
