package Login;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.Login;
import Setup.TestBase;

public class InvalidLogin3 extends TestBase {
    String emptyusername = "";
    String password = "12341234";

    @Test(priority = 1, description = "UserName Is Required")
    public void testInvalidLogin3() throws InterruptedException {
        new Login(driver).EnterUsername(emptyusername);
        new Login(driver).EnterPassword(password);
        new Login(driver).EnterLogin();        
        Assert.assertTrue(new Login(driver).usernameisrequired());
    }
}
