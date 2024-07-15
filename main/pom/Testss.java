package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Testss {

    private AndroidDriver<MobileElement> driver;

    public Testss(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
	    private final By Category = By.xpath("//android.widget.Button[@content-desc=\"category\"]");
	    private final By Gender = By.xpath("//android.view.View[@content-desc=\"Spine\"]");
	  
	    
	    public void ChooseCategory() {
	        WaitUtils.waitForElement(driver, Category);
	        driver.findElement(Category).click();
	        
	        WaitUtils.waitForElement(driver, Gender);
	        driver.findElement(Gender).click();
	    }
	    
	    private final By VarifyMess = By.xpath("//android.view.View[@content-desc=\"boold date: 2024-07-05 123 units double tap to set as normal\"]");

	    public boolean VarifyTest() {
	        WaitUtils.waitForElement(driver, VarifyMess);
	        return driver.findElement(VarifyMess).isDisplayed();
	    }

	    
	  
}