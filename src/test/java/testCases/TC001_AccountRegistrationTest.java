package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.java.Before;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	

	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration() {
		
		logger.info("*************Starting TC001_AccountRegistrationTest**************");
		try {
		HomePage hp= new HomePage(driver);
		//hp.Clickonfrnt();
		logger.info("*************Clicked On My Account Link**************");
		
		hp.Clickonmyacc();
		
		logger.info("*************Clicked On Register Link**************");
		
		hp.ClickonRegister();
		
		AccountRegistrationPage ar=new AccountRegistrationPage(driver);
		
		logger.info("**********Providing customer details**************");
		
		
		ar.setfirstname(randomString().toUpperCase());
		ar.setLastname(randomString().toUpperCase());
		ar.setemail(randomString()+"@gmail.com");
		ar.settelephone(randomNumber());
		//because directly if we will give it will pass different for password and confirm password so store in string and pass it
		String Password=randomAlphaNumeric();
		ar.setpassword(Password);
		ar.setconfirmpwd(Password);
		ar.clickPrivacypolicy();
		ar.Clickbtncontinue();
		
		
		logger.info("**********Validating expected Message*************");
		
		String Confirmation =ar.getConfirmationmsg();
		
		Assert.assertEquals(Confirmation,"Your Account Has Been Created!");
		}catch(Exception e)
		{
			logger.error("Test Failed.....");
	        logger.debug("Debug logs...");
	        Assert.fail();
		}
		
		logger.info("*********Finished TC001_AccountRegistrationTest********");
		
	}
	
}
		
	
	
	
	
	


