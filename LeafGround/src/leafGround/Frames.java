package leafGround;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.navigate().to("http://leafground.com/pages/frame.html");

		//First need to switchto frame
		driver.switchTo().frame(0);

		WebElement frame1=driver.findElement(By.id("Click"));
		frame1.click();
		String buttonText=frame1.getText();
		System.out.println(buttonText);

		//Return to main html
		driver.switchTo().defaultContent();

		//Switching to second frame using it's index
		driver.switchTo().frame(1);

		//Switching to the second frames frame
		driver.switchTo().frame(0);


		WebElement frame2But=driver.findElement(By.id("Click1"));
		frame2But.click();

		driver.switchTo().defaultContent();

		int totalFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println(totalFrames);

	}

}

