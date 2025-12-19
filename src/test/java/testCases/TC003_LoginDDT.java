package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.myAccountPage;
import testBase.BaseClass;
import utilities.Dataproviders;

/*Data is valid -login success --test pass logout
 Data is valid --login failed -test fail

Data is invalid -login success test fail --logout
Data is invalid --login failed -test pass
*/
public class TC003_LoginDDT extends BaseClass {
	@Test(dataProvider = "LoginData", dataProviderClass = Dataproviders.class, groups="Datadriven")
	public void verify_loginDDT(String email, String password, String expected)
	{
	    logger.info("*************Starting TC003_LoginDDT**************");

	    try
	    {
	        HomePage hp = new HomePage(driver);
	        hp.Clickonmyacc();;
	        hp.ClickonLogin();;

	        LoginPage lp = new LoginPage(driver);
	        lp.setusername(email);
	        lp.setpassword(password);
	        lp.clickLoginbtn();;

	        myAccountPage macc = new myAccountPage(driver);

	        boolean actualStatus = macc.ismyaccountexists();   // true or false

	        if(expected.equals("Valid"))
	        {
	            if(actualStatus == true)
	            {
	                logger.info("Login is successful -> Valid test -> PASS");
	                macc.clickonlogout();
	                Assert.assertTrue(true);
	            }
	            else
	            {
	                logger.error("Login FAILED -> Valid test -> FAIL");
	                Assert.fail();
	            }
	        }
	        else if(expected.equals("Invalid"))
	        {
	            if(actualStatus == false)
	            {
	                logger.info("Invalid credentials -> Login failed -> PASS");
	                Assert.assertTrue(true);
	            }
	            else
	            {
	                logger.error("Invalid test but login succeeded -> FAIL");
	                macc.clickonlogout();
	                Assert.fail();
	            }
	        }
	    }
	    catch(Exception e)
	    {
	        Assert.fail("EXCEPTION OCCURRED: " + e.getMessage());
	    }

	    logger.info("*************Finished TC003_LoginDDT**************");
	}

	}
	
	
	


