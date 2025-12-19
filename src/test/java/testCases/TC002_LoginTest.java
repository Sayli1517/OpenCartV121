package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups={"Sanity", "Master"})
	public void verifyLogin() {
		
		try {
		
		logger.info("*************Starting TC002_LoginTest**************");
		//home page
		HomePage hp= new HomePage(driver);
		
		hp.Clickonmyacc();
		hp.ClickonLogin();
		
		//login page
		LoginPage lp=new LoginPage(driver);
		lp.setusername(prop.getProperty("email"));
		lp.setpassword(prop.getProperty("password"));
		lp.clickLoginbtn();
		
		//myacc page
		
		myAccountPage ap= new myAccountPage(driver);
		boolean targetpage=ap.ismyaccountexists();
		
		//Assert.assertEquals(targetpage, true, "Loginfailed");
		
		Assert.assertTrue(targetpage);
		}
		catch(Exception e) {
			
			Assert.fail();
		}
		logger.info("*************Finished TC002_LoginTest**************");
	}

}
