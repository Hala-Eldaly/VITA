package Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Login;
import Setup.TestBase;

public class ValidLogin extends TestBase {
    String user = "llleo";
    String password = "12341234";

    @Test(priority = 1, description = "Valid Login")
    public void testValidLogin() throws InterruptedException {
        new Login(driver).EnterUsername(user);
        new Login(driver).EnterPassword(password);
        new Login(driver).EnterLogin();
        Assert.assertTrue(new Login(driver).verifyLoginSuccessfully());
    }
}
