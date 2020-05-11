package leafGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/selectable.html");
		WebElement select1=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
		select1.click();
		 
		Thread.sleep(2000);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
		
		Actions action=new Actions(driver);
		//This method performs left click, hold the click to hold the source element, moves to the location of the target element and then releases the mouse clic
		action.dragAndDrop(source, target).build().perform();

	}

}
