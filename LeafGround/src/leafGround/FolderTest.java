package leafGround;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class FolderTest {

	@Test
	public static void forTestOnly() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		
		//To take screenshot
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		//To store source file in source
		File source=screenShot.getScreenshotAs(OutputType.FILE);
		//To store in destination
		File destination=new File("C:\\Users\\sivap\\Downloads\\Selenium\\chromedriv.png");
		
		try {
			FileHandler.copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}


}
