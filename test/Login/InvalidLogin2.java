package Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Login;
import Setup.TestBase;

public class InvalidLogin2 extends TestBase {
    String user = "llleo";
    String password1 = "12341235";

	@Test(priority = 1, description = "Wrong Password")
    public void testInvalidLogin2() throws InterruptedException {
        new Login(driver).EnterUsername(user);
        new Login(driver).EnterPassword(password1);
        new Login(driver).EnterLogin();        
        Assert.assertTrue(new Login(driver).WrongPassword());
    }
}
