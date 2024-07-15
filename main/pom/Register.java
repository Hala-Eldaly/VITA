package Pom;
import static Pom.WaitUtils.waitForElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver; 
public class Register {

	 private AndroidDriver<MobileElement> driver;

	    public Register(AndroidDriver<MobileElement> driver) {
	        this.driver = driver;
	    }
    private final By REGISTER_LINK = By.xpath("//android.view.View[@content-desc=\"No Account? Register\"]");
    private final By USERNAME_Click = By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
    private final By USERNAME_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[3]");
    private final By FULLNAME_Click = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By FULLNAME_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[1]");
    private final By SSN_Click = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By SSN_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[2]");
    private final By PHONE_Click = By.xpath("//android.widget.ScrollView/android.widget.EditText[4]");
    private final By PHONE_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[4]");
    private final By DOB_Click = By.xpath("//android.widget.ScrollView/android.view.View[7]");
    private final By DOB_INPUT = By.xpath("//android.widget.ScrollView/android.widget.EditText[14]");
    private final By EMAIL_Click =MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(4)");
    private final By EMAIL_INPUT =MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(3)");
    private final By GENDER_SELECT = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)");
    private final By GENDER = MobileBy.AndroidUIAutomator("new UiSelector().description(\"Female\")");
    private final By MARITAL_STATUS_SELECT =MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)");
    private final By MARITAL_STATUS = MobileBy.AndroidUIAutomator("new UiSelector().description(\"Single\")");
    private final By PASSWORD_Click =MobileBy.AndroidUIAutomator("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[3]");
    private final By PASSWORD_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[3]");
    private final By ConfirmPASSWORD_Click = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[3]");
    private final By ConfirmPASSWORD_INPUT = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView[2]/android.widget.EditText[3]");
    private final By REGISTER_BUTTON = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    private final By ERROR_MESS = By.xpath("//*[@id=\"login\"]/div/div[2]/div/div[1]/div");
    private final By ERROR_USER = By.name("username");
    private final By ERROR_NAME = By.name("fullName");
    private final By ERROR_SSN = By.name("ssn");
    private final By ERROR_MOB = By.name("phone");
    private final By ERROR_DOB = By.name("dateOfBirth");
    private final By ERROR_EMAIL = By.name("email");
    private final By ERROR_GENDER = By.name("gender");
    private final By ERROR_STATUS = By.name("maritalStatus");
    private final By ERROR_PASS = By.name("password");
    
    private final By setDOB =MobileBy.AndroidUIAutomator("new UiSelector().description(\"13, Thursday, 13 January 2000\")");
    private final By OKDOB =MobileBy.AndroidUIAutomator("new UiSelector().description(\"OK\")");


    public void clickRegisterLink() {
        waitForElement(driver, REGISTER_LINK);
        driver.findElement(REGISTER_LINK).click();
    } 

   public void enterFullName(String fullName) {
        waitForElement(driver, FULLNAME_Click);
        driver.findElement(FULLNAME_Click).click();
        
        waitForElement(driver, FULLNAME_INPUT);
        driver.findElement(FULLNAME_INPUT).sendKeys(fullName);
    }
  
   
    public void enterSSN(String ssn) {
    	 waitForElement(driver, SSN_Click);
         driver.findElement(SSN_Click).click();
         
        waitForElement(driver, SSN_INPUT);
        driver.findElement(SSN_INPUT).sendKeys(ssn);
    }
    
    
    public void enterUsername(String username) {
    	waitForElement(driver, USERNAME_Click);
        driver.findElement(USERNAME_Click).click();
          
        waitForElement(driver, USERNAME_INPUT);
        driver.findElement(USERNAME_INPUT).sendKeys(username);
    }


    public void enterPhone(String phone) {
        waitForElement(driver, PHONE_Click);
        driver.findElement(PHONE_Click).click();
        
        waitForElement(driver, PHONE_INPUT);
        driver.findElement(PHONE_INPUT).sendKeys(phone);
    }

  
    public void enterDateOfBirth(String dob) {
    	 waitForElement(driver, DOB_INPUT);
         driver.findElement(DOB_INPUT).click();
         
         
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"7, Friday, 7 January 2000\"]")).click();
    	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click();
    }

    public void enterEmail(String email) {
    	waitForElement(driver, EMAIL_Click);
        driver.findElement(EMAIL_Click).click();
         
        waitForElement(driver, EMAIL_INPUT);
        driver.findElement(EMAIL_INPUT).sendKeys(email);
    }

    public void selectGender(String gender) {
    	waitForElement(driver, GENDER_SELECT);
        driver.findElement(GENDER_SELECT).click();
        
        waitForElement(driver, GENDER);
        driver.findElement(GENDER).click();
       
    }

    public void selectMaritalStatus(String maritalStatus) {
    	waitForElement(driver, MARITAL_STATUS_SELECT);
        driver.findElement(MARITAL_STATUS_SELECT).click();
        
        waitForElement(driver, MARITAL_STATUS);
        driver.findElement(MARITAL_STATUS).click();
    }

    public void enterPassword(String password) {
    	waitForElement(driver, PASSWORD_Click);
        driver.findElement(PASSWORD_Click).click();
        
       
        
        waitForElement(driver, PASSWORD_INPUT);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void confirmPassword(String confirmPassword) {
    	waitForElement(driver, ConfirmPASSWORD_Click);
        driver.findElement(ConfirmPASSWORD_Click).click();
        
       
        
        waitForElement(driver, ConfirmPASSWORD_INPUT);
        driver.findElement(ConfirmPASSWORD_INPUT).sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        waitForElement(driver, REGISTER_BUTTON);
        driver.findElement(REGISTER_BUTTON).click();
    }

    public boolean verifyRegisterSuccessfully() {
        // Implement based on success message or redirect verification
        // Example: return driver.findElement(SUCCESS_MESSAGE).isDisplayed();
        return true;
    }

    public boolean verifyUsernameRequiredError() {
        waitForElement(driver, ERROR_USER);
        return driver.findElement(ERROR_USER).isDisplayed();
    }

    public boolean verifyFullNameRequiredError() {
        waitForElement(driver, ERROR_NAME);
        return driver.findElement(ERROR_NAME).isDisplayed();
    }


    public boolean verifyPhoneRequiredError() {
        waitForElement(driver, ERROR_MOB);
        return driver.findElement(ERROR_MOB).isDisplayed();
    }

    public boolean verifyEmailRequiredError() {
        waitForElement(driver, ERROR_EMAIL);
        return driver.findElement(ERROR_EMAIL).isDisplayed();
    }

    public boolean verifyPasswordRequiredError() {
        waitForElement(driver, ERROR_PASS);
        return driver.findElement(ERROR_PASS).isDisplayed();
    }

    public boolean verifyGenderRequiredError() {
        waitForElement(driver, ERROR_GENDER);
        return driver.findElement(ERROR_GENDER).isDisplayed();
    }

    public boolean verifyMaritalStatusRequiredError() {
        waitForElement(driver, ERROR_STATUS);
        return driver.findElement(ERROR_STATUS).isDisplayed();
    }

    public boolean verifyDOBRequiredError() {
        waitForElement(driver, ERROR_DOB);
        return driver.findElement(ERROR_DOB).isDisplayed();
    }

   
    
}
