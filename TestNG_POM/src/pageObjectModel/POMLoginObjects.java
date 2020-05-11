package pageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMLoginObjects {
	public static WebElement userName(WebDriver driver) {
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
}