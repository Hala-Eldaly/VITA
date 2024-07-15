package Pom;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By; 

public class Login {

    private AndroidDriver<MobileElement> driver;

    public Login(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    private final By Username_Click = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.EditText[1]");
    private final By Username_Input = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[1]/android.widget.EditText[1]");
    private final By Password_Click = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[1]/android.widget.EditText[2]");
    private final By Password_Input = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[1]/android.widget.EditText[2]");
    private final By LOGIN_BUTTON =  MobileBy.AndroidUIAutomator("new UiSelector().description(\"Login\")");
    private final By UserNamenotfound = By.xpath("//android.view.View[@content-desc=\"UserName not found!\"]");
    private final By WrongPassword = By.xpath("//android.view.View[@content-desc=\"Wrong Password!\"]");
    private final By Passwordisrequired = By.xpath("//android.view.View[@content-desc=\"password should be 8 characters at least\"]");
    private final By usernameisrequired = By.xpath("//android.view.View[@content-desc=\"this field is required\"]");
    private final By Done  = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]");

    
    public void EnterUsername( String username ) {
    	WaitUtils.waitForElement(driver, Username_Click);
        driver.findElement(this.Username_Click).click();
      
        WaitUtils.waitForElement(driver, Username_Input);
        driver.findElement(this.Username_Input).sendKeys(username);
      
      }
    
    public void EnterPassword(String password ) {

    	WaitUtils.waitForElement(driver, Password_Click);
        driver.findElement(this.Password_Click).click();
        
        WaitUtils.waitForElement(driver, Password_Input);
        driver.findElement(this.Password_Input).sendKeys(password);
        
        }
    
 /*   public void hala () throws InterruptedException {
    	    driver.hideKeyboard();
    	    Thread.sleep(2000);
    		driver.findElement(this.LOGIN_BUTTON).click();
    	 
    	 
    }
    
  
    private void scrollDown(AndroidDriver<MobileElement> driver1) {
    	 int startX = driver.manage().window().getSize().width / 2;
         int startY = driver.manage().window().getSize().height / 2;
         int endY = driver.manage().window().getSize().height / 4;

         driver.performTouchAction(new io.appium.java_client.TouchAction<>(driver)
                 .press(PointOption.point(startX, startY))
                 .moveTo(PointOption.point(startX, endY))
                 .release()
         );		
	}  */

	public boolean UserNamenotfound() {
    	WaitUtils.waitForElement(driver, UserNamenotfound);
        return driver.findElement(UserNamenotfound).isDisplayed();
	}
    public boolean WrongPassword() {
    	WaitUtils.waitForElement(driver, WrongPassword);
        return driver.findElement(WrongPassword).isDisplayed();
    }
    public boolean Passwordisrequired() {
    	WaitUtils.waitForElement(driver, Passwordisrequired);
        return driver.findElement(Passwordisrequired).isDisplayed();
    }
    public boolean usernameisrequired() {
    	WaitUtils.waitForElement(driver, usernameisrequired);
    	return driver.findElement(usernameisrequired).isDisplayed();
    }

    public boolean verifyLoginSuccessfully() throws InterruptedException {
    	WaitUtils.waitForElement(driver, Done);
        return driver.findElement(Done).isDisplayed();  
    }

	public void EnterLogin() throws InterruptedException {
		 driver.hideKeyboard();
 	     Thread.sleep(2000);
 		 driver.findElement(this.LOGIN_BUTTON).click();
 	 
	}
	
	
	

}

  

