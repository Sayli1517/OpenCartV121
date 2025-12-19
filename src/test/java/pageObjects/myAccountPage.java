package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myAccountPage extends BasePage {

	public myAccountPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy (xpath="(//a[contains(text(),'My Account')])[1]")
	WebElement MyAccHeading;
	
	@FindBy (xpath="//a[contains(text(),'Logout')]")
	WebElement lnkLogout;
	
	
	
	
	
	
	
	public boolean ismyaccountexists() {
		
		try {
		return (MyAccHeading.isDisplayed());
		
		}catch(Exception e){
			
			return false;
		}
		
	}
	
	public void clickonlogout() {
		
		lnkLogout.click();		
	}

}
