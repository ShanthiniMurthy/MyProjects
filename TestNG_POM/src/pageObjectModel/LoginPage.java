package pageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import pageObjectModel.POMLoginObjects;

public class LoginPage {
	@Test
	public void Login() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");




	POMLoginObjects.userName(driver).sendKeys("Admin");
	POMLoginObjects.passWord(driver).sendKeys("admin123");
	POMLoginObjects.LoginButton(driver).click();
	driver.close();

	}
}

