package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}

	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnlogin;
	
	
public void setusername(String uname) {
		
	   username.sendKeys(uname);
		
	}

public void setpassword(String pwd) {
	
	   username.sendKeys(pwd);
		
	}

public void clickLoginbtn() {
	
	btnlogin.click();
}
	
	
}
