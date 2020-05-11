package testNG;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class TestSuite {

	    WebDriver driver;
	    long startTime;
	    //Aim to open browser
	    // Open Google.com, Bing.com, Yahoo.com
	    
	    @BeforeSuite
	    public void launchBrowser() {
	        startTime=System.currentTimeMillis();
	        System.setProperty("webdriver.gecko.driver", "G:\\selenium\\geckodriver.exe");
	         driver=new FirefoxDriver();
	        }
	    @Test
	    public void OpenGoogle() {
	            
	        driver.get("https://www.google.com/");
	    }
	    @Test
	    public void OpenBing() {
	            
	        driver.get("https://www.bing.com/");
	        }
	    @Test
	    public void OpenYahoo() {
	            
	        driver.get("https://www.yahoo.com/");        
	    }
	    @AfterSuite
	    public void closeBrowser() {
	        driver.quit();
	        long endTime=System.currentTimeMillis();
	        System.out.println("Total time ="+ (endTime-startTime));
	    }
	    
	    
	}

