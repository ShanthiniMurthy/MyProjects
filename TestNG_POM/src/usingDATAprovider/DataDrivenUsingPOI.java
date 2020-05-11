package usingDATAprovider;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDrivenUsingPOI {
	
	static List<String> UsernameList= new ArrayList<String>();
	static List<String> PasswordList= new ArrayList<String>();

	
	public void readExcel() throws IOException{
		
		FileInputStream excel =new FileInputStream("C:\\Users\\sivap\\Downloads\\Selenium\\Test.xlsx");
		
		Workbook book= new XSSFWorkbook(excel);
		
		Sheet sheet=book.getSheetAt(0);
		Iterator<Row> rowIterator=sheet.iterator();
		while(rowIterator.hasNext()) {
			Row rowValue=rowIterator.next();
			
			int i=2;
			Iterator<Cell> columnIterator=rowValue.iterator();
			while(columnIterator.hasNext()) {
				if(i%2==0) {
					UsernameList.add(columnIterator.next().getStringCellValue());
				}
				else {
					PasswordList.add(columnIterator.next().getStringCellValue());
				}
			i++;				
			}
				
		}		
		
	}
	public void login(String uname,String pword) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivap\\Downloads\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);
		WebElement pass=driver.findElement(By.id("txtPassword"));
		pass.sendKeys(pword);
		
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
	
		driver.quit();
	}
	
	public void execute() {
		for(int i=0;i<UsernameList.size();i++) {
			login(UsernameList.get(i),PasswordList.get(i));
		}
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		DataDrivenUsingPOI objPOI=new DataDrivenUsingPOI();
		objPOI.readExcel();
		System.out.println(UsernameList);
		System.out.println(PasswordList);
		objPOI.execute();
	
	}

}
