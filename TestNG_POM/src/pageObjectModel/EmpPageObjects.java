package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmpPageObjects {
	public static WebElement Name(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("txtUsername"));
		}
		public static WebElement passWord(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("txtPassword"));


		}
		public static WebElement LoginButton(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.id("btnLogin"));
		}
		public static WebElement Admin(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		}
		public static WebElement Add(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.name("btnAdd"));
		}
		public static WebElement UserRole(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]"));
		}
		public static WebElement EmpName(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]"));
		}
		public static WebElement UserName(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]"));
		}
		public static WebElement Status(WebDriver driver) {

		return driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]"));

		}
		public static WebElement Passwrd(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]"));
		}
		public static WebElement CnfmPasswrd(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]"));
		}
		public static WebElement Save(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.name("btnSave"));
		}

}
