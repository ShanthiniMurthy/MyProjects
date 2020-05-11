package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjects {
	
	
	@FindBy(how=How.ID,using="txtUsername")
	public static WebElement username;

	@FindBy(id="txtPassword")
	public static WebElement password;

	@FindBy(id="btnLogin")
	public static WebElement LoginButton;
	
	@FindBy(id="menu_admin_viewAdminModule")
	public static WebElement AdminButton;
	
	@FindBy(id="btnAdd")
	public static WebElement AddButton;
	
	@FindBy(id="systemUser_userType")
	public static WebElement userRole;
	
	@FindBy(id="systemUser_employeeName_empName")
	public static WebElement emp_name;
	
	@FindBy(id="systemUser_userName")
	public static WebElement user_name;
	
	@FindBy(id="systemUser_status")
	public static WebElement status;
	
	@FindBy(id="systemUser_password")
	public static WebElement pass;
	
	@FindBy(id="systemUser_confirmPassword")
	public static WebElement confirmpass;
}
