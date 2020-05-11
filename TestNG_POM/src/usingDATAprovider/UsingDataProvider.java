package usingDATAprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class UsingDataProvider {

	String[][] data= {{"Admin","admin123"},{"Admin1","admin123"},{"Admin1","admin1"},{"Admin","admin1"}};
	
	@DataProvider(name="loginData")
     public String[][] logindata(){
	    return data;
       }
	                    
	
	@Test(dataProvider="loginData")
	public void main(String uname,String pword) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys(pword);
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	
		driver.quit();
	}
	
	
	
}