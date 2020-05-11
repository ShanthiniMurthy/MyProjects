package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageFactory.PageObjects;

public class EmpPage {
	
@Test	
public void Login() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	
	PageFactory .initElements(driver, PageObjects.class);
	
	PageObjects.username.sendKeys("Admin");
	PageObjects.password.sendKeys("admin123");
	PageObjects.LoginButton.click();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
	
	PageObjects.AdminButton.click();
	PageObjects.AddButton.click();
	
	Select select=new Select(PageObjects.userRole);
	select.selectByVisibleText("Admin");
	
	PageObjects.emp_name.sendKeys("jasmine Morgan");
	PageObjects.user_name.sendKeys("Shanthini");
	
	Select select1=new Select(PageObjects.status);
	select1.selectByIndex(0);
	
	PageObjects.pass.sendKeys("saan0111");
	PageObjects.confirmpass.sendKeys("saan0111");
	
}


}
