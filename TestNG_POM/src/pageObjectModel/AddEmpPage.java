package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AddEmpPage {
	@Test
	public void EmployeePage() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	
	EmpPageObjects.Name(driver).sendKeys("Admin");
	EmpPageObjects.passWord(driver).sendKeys("admin123");
	EmpPageObjects.LoginButton(driver).click();
	
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
	
	EmpPageObjects.Admin(driver).click();
	EmpPageObjects.Add(driver).click();
	Select select=new Select(EmpPageObjects.UserRole(driver));
	select.selectByVisibleText("Admin");
	
	EmpPageObjects.EmpName(driver).sendKeys("jasmine Morgan");
	EmpPageObjects.UserName(driver).sendKeys("Shanthini");
	Select stat=new Select(EmpPageObjects.Status(driver));
	stat.selectByIndex(0);
	EmpPageObjects.Passwrd(driver).sendKeys("saan01");
	EmpPageObjects.CnfmPasswrd(driver).sendKeys("saan01");
	EmpPageObjects.Save(driver).click();
	}

}
