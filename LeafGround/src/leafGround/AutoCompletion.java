package leafGround;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		WebElement searchBox=driver.findElement(By.id("tags"));
		searchBox.sendKeys("r");
		
		
		Thread.sleep(4000);
		
		
		List<WebElement> courseList= driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(courseList.size());
		
		
		for (WebElement webElement : courseList) {
			
			if (webElement.getText().equals("Cucumber")){
				System.out.println("Selecting " + webElement.getText());
				webElement.click();
				
				break;
			}
		}
		
		
	}

}

