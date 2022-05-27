package testClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogInTest extends BaseClass
{
	@Test
	public void verifyLogInFunctionalitywithValidCredential() throws Exception
	{
		Reporter.log("Entering userId", true);
		//lip.userID("LGD943");
		Assert.assertTrue(lip.userID("LGD943"));
		Reporter.log("Entering password", true);
		lip.password("shree@1234");
		//lip.login();
		Reporter.log("Clicking on login button", true);
		lip.login();
		lip.pin1("123456");
		lip.continueButton();
		Assert.assertEquals("Shilpa", lip.verifyLogInisSuccessful());
		
	}
//	@Test
//	public void verifyLogInFunctionalitywithInValidCredential()
//	{
//		
//		
//	}



}
