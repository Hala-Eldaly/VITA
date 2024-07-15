package Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Login;
import Setup.TestBase;

public class InvalidLogin4 extends TestBase {
    String user = "llleo";
    String emptypassword = "";
	@Test(priority = 1, description = "Password Is Required")
    public void testInvalidLogin4() throws InterruptedException {
        new Login(driver).EnterUsername(user);
        new Login(driver).EnterPassword(emptypassword);
        new Login(driver).EnterLogin();        
        Assert.assertTrue(new Login(driver).Passwordisrequired());
    }
}
