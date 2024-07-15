package Setup;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import static  SetUp.Base.Capabilities;


public class TestBase {
	  public static AndroidDriver<MobileElement> driver; 
    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
        driver = Capabilities();
    }

    @AfterTest
    public void tearDown() {
         if (driver != null) {
          driver.quit();
        }
    }
}