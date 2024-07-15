package Setup;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Pom.Login;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import static  SetUp.Base.Capabilities;


    public class Basic {
  	  public static AndroidDriver<MobileElement> driver; 

    @BeforeTest
    public void setUp() throws MalformedURLException, InterruptedException {
    driver = Capabilities();
     //Login();
        }
        
    static String username ="llleo" ;
   	static String password ="12341234";
   	
    public static void Login() throws InterruptedException {
    	new Login(driver).EnterUsername(username);
        new Login(driver).EnterPassword(password);
        new Login(driver).EnterLogin();    

       }
    @AfterTest
    public void tearDown() {
    //if (driver != null) {
    //driver.quit();
    // }
    }
}