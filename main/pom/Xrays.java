package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Xrays {
   
    private AndroidDriver<MobileElement> driver;

    public Xrays(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    private final By Date = By.xpath("username");
    private final By XRayName = By.xpath("//android.widget.ImageView[@content-desc=\"Eyes\"]");
    private final By XRayName1 = By.xpath("//android.widget.ImageView[@content-desc=\"bones\"]");
    private final By VarifyName = By.xpath("//android.view.View[@content-desc=\"Eyes\"]");
    private final By VarifyName1 = By.xpath("//android.view.View[@content-desc=\"bones\"]");
    
    
	public void ChooseXRayDr() {
        WaitUtils.waitForElement(driver, XRayName);
        driver.findElement(XRayName).click();
    }
    
	public void ChooseXRayP() {
        WaitUtils.waitForElement(driver, XRayName1);
        driver.findElement(XRayName1).click();
    }
    

	public boolean verifyXRayDr() {
		 WaitUtils.waitForElement(driver, VarifyName);
	        return driver.findElement(VarifyName).isDisplayed();
	}
	
	public boolean verifyXRayP() {
		 WaitUtils.waitForElement(driver, VarifyName1);
	        return driver.findElement(VarifyName1).isDisplayed();
	}
		 
		
}

