package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
	
	//contructor

	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
//Locators
	
	//
	
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement linkMyAccount;
	
	@FindBy(xpath="(//a[contains(text(),'Register')])[1]")
	WebElement linkRegister;
	
	@FindBy(xpath="(//a[contains(text(),'Login')])[1]")
	WebElement linkLogin;
	
	//Action Methods
	

	
	public void Clickonmyacc() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(linkMyAccount));
		
		linkMyAccount.click();
		
	}
	
public void ClickonRegister() {
		
		linkRegister.click();
		
	}

public void ClickonLogin() {
	
	linkLogin.click();
	
}
}
