package Register;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Register;
import Setup.TestBase;

public class RegisterWithRequiredDOB extends TestBase{
	  @Test(priority = 1)
	    public void registerWithInvalidDOB()  {
	        Register registerPage = new Register(driver);
	        registerPage.clickRegisterLink();
	        registerPage.enterUsername("x_9");
	        registerPage.enterFullName("kkk");
	        registerPage.enterSSN("11100076573048");
	        registerPage.enterPhone("01586700650");
	      //registerPage.enterDateOfBirth("71120");
	        registerPage.enterEmail("abd0@gmail.com");
	        registerPage.selectGender("Female");
	        registerPage.selectMaritalStatus("Single");
	        registerPage.enterPassword("12345678");
	        registerPage.confirmPassword("12345678");
	        registerPage.clickRegisterButton();
	        
	        Assert.assertTrue(registerPage.verifyDOBRequiredError());

	    }

}
