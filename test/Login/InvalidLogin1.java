package Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Login;
import Setup.TestBase;

public class InvalidLogin1 extends TestBase {
    String user1 = "ss@@s";
    String password = "12341234";

	@Test(priority = 1, description = "UserName Not Found")
    public void testInvalidLogin1() throws InterruptedException {
        new Login(driver).EnterUsername(user1);
        new Login(driver).EnterPassword(password);
        new Login(driver).EnterLogin();       
        Assert.assertTrue(new Login(driver).UserNamenotfound());
    }
}
