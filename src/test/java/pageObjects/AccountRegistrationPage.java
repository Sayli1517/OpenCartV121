package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
        super(driver); 
    }
	
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement txtfirstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@name='telephone']")
	WebElement txttelephone;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='confirm']")
	WebElement txtconfpassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement policyclick;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnContinue;
	
	@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement msgConfirmation;
	
	
public void setfirstname(String fname) {
		
	txtfirstname.sendKeys(fname);;
		
	}
	
public void setLastname(String lname) {
		
	txtLastname.sendKeys(lname);;
		
	}

public void setemail(String email) {
	
	txtemail.sendKeys(email);;
		
	}

public void settelephone(String telephone) {
	
	txttelephone.sendKeys(telephone);
}


public void setpassword(String password) {
	
	txtpassword.sendKeys(password);;
		
	}

public void setconfirmpwd(String confirmP) {
	
	txtconfpassword.sendKeys(confirmP);
}


public void clickPrivacypolicy() {
	policyclick.click();
	
		
	}

public void Clickbtncontinue(){
	btnContinue.click();
	
		
	}


public String getConfirmationmsg(){
	
	try {
		
		return  (msgConfirmation.getText());
	}
	catch
		
		(Exception e){
			
			return(e.getMessage());
		}
	}
		
	}

