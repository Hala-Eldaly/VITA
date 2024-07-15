package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
public class Profile {

    private AndroidDriver<MobileElement> driver;

    public Profile(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    
    private final By FULLNAME_Click = By.xpath("//android.widget.EditText[@text=\"Hala Eldaly\"]");
    private final By FULLNAME_INPUT = By.xpath("//android.widget.EditText");
    private final By SSN_Click = By.xpath("//android.widget.EditText[@text=\"8888888340\"]");
    private final By SSN_INPUT = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By PHONE_Click = By.xpath("//android.widget.EditText[@text=\"01096114553\"]");
    private final By PHONE_INPUT = By.xpath("//android.widget.ScrollView/android.widget.EditText[3]");
    private final By MARITAL_STATUS_SELECT = By.xpath("//android.widget.Button[@content-desc=\"Single\"]");
    private final By CurrentPASSWORD_Click = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private final By CurrentPASSWORD_INPUT = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\")"); 
    private final By PASSWORD_Click = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)"); 
    private final By PASSWORD_INPUT = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(1)");
    private final By ConfirmPASSWORD_Click = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private final By ConfirmPASSWORD_INPUT = MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(2)");
    private final By Save_BUTTON =  MobileBy.AndroidUIAutomator("new UiSelector().description(\"Save\")");
    private final By VarifyMess = By.xpath("//android.view.View[@content-desc=\"data updated!\"]");



    public void changeName(String fullName) throws InterruptedException {
         
        WaitUtils.waitForElement(driver, FULLNAME_INPUT);
        driver.findElement(FULLNAME_INPUT).click();
        
        WaitUtils.waitForElement(driver, FULLNAME_Click);
        driver.findElement(FULLNAME_Click).clear();
        
        WaitUtils.waitForElement(driver, FULLNAME_INPUT);
        driver.findElement(FULLNAME_INPUT).click();
        
        WaitUtils.waitForElement(driver, FULLNAME_INPUT);
        driver.findElement(FULLNAME_INPUT).sendKeys(fullName);
        
		driver.hideKeyboard();

    }
    
   /* public void pressSave() throws InterruptedException {
    	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))").click(); //scroll down to the element and click

    	Thread.sleep(10000); //wait of 10 seconds
    } */
    
    public void pressSave() throws InterruptedException {
      	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().description(\"Save\"));")).click();
        Thread.sleep(30000) ;
    }


    public void changeSSN(String ssn) {
    	 WaitUtils.waitForElement(driver, SSN_Click);
         driver.findElement(SSN_Click).click();
         
         WaitUtils.waitForElement(driver, SSN_Click);
         driver.findElement(SSN_Click).clear();
         
         WaitUtils.waitForElement(driver, SSN_INPUT);
         driver.findElement(SSN_INPUT).click();
         
         WaitUtils.waitForElement(driver, SSN_INPUT);
         driver.findElement(SSN_INPUT).sendKeys(ssn);
         
         WaitUtils.waitForElement(driver, Save_BUTTON);
         driver.findElement(Save_BUTTON).click();
    }

  
    public void changePhone(String phone) {
    	 WaitUtils.waitForElement(driver, PHONE_Click);
         driver.findElement(PHONE_Click).click();
         
         WaitUtils.waitForElement(driver, PHONE_Click);
         driver.findElement(PHONE_Click).clear();
         
         WaitUtils.waitForElement(driver, PHONE_INPUT);
         driver.findElement(PHONE_INPUT).click();
         
         WaitUtils.waitForElement(driver, SSN_INPUT);
         driver.findElement(SSN_INPUT).sendKeys(phone);
         
         WaitUtils.waitForElement(driver, Save_BUTTON);
         driver.findElement(Save_BUTTON).click();
    }


    public void selectMaritalStatus(String newStatus) {
     	 WaitUtils.waitForElement(driver, PHONE_Click);
         MobileElement dropdownElement = driver.findElement(MARITAL_STATUS_SELECT);
        
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(newStatus);
        
        WaitUtils.waitForElement(driver, Save_BUTTON);
        driver.findElement(Save_BUTTON).click();
    }

    public void changePassword(String oldpassword , String newpassword) {
    	 WaitUtils.waitForElement(driver, CurrentPASSWORD_Click);
         driver.findElement(CurrentPASSWORD_Click).click();
         WaitUtils.waitForElement(driver, CurrentPASSWORD_Click);
         driver.findElement(CurrentPASSWORD_Click).click();
         WaitUtils.waitForElement(driver, CurrentPASSWORD_INPUT);
         driver.findElement(CurrentPASSWORD_INPUT).sendKeys(oldpassword);
         
         WaitUtils.waitForElement(driver, PASSWORD_Click);
         driver.findElement(PASSWORD_Click).click();
         WaitUtils.waitForElement(driver, PASSWORD_Click);
         driver.findElement(PASSWORD_Click).click();
         WaitUtils.waitForElement(driver, PASSWORD_INPUT);
         driver.findElement(PASSWORD_INPUT).sendKeys(oldpassword);
         
         WaitUtils.waitForElement(driver, ConfirmPASSWORD_Click);
         driver.findElement(ConfirmPASSWORD_Click).click();
         WaitUtils.waitForElement(driver, ConfirmPASSWORD_Click);
         driver.findElement(ConfirmPASSWORD_Click).click();
         WaitUtils.waitForElement(driver, ConfirmPASSWORD_INPUT);
         driver.findElement(ConfirmPASSWORD_INPUT).sendKeys(oldpassword);
         
         WaitUtils.waitForElement(driver, Save_BUTTON);
         driver.findElement(Save_BUTTON).click();
        
       
    }
    
   
    public boolean Data_Updated_Varify_Mess() {
        WaitUtils.waitForElement(driver, VarifyMess);
        return driver.findElement(VarifyMess).isDisplayed();
    }

	
	
}

