package Pom;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

	public class Connections {
		private AndroidDriver<MobileElement> driver;

	    public Connections(AndroidDriver<MobileElement> driver) {
	        this.driver = driver;
	    }
	    private final By confirm = By.xpath("//android.view.View[@content-desc=\"ea ea\"]/android.widget.ImageView[1]");
	    private final By egnore = By.xpath("//android.view.View[@content-desc=\"ea ea\"]/android.widget.ImageView[2]");
	    private final By AcceptRequest = By.xpath("	//android.view.View[@content-desc=\"request accepted!\"]");
	    private final By RemoveRequest = By.xpath("//android.view.View[@content-desc=\"connection removed!\"]");

	    public void Confirm_User () {
	        WaitUtils.waitForElement(driver, confirm);
	        driver.findElement(confirm).click();
	    }
	    
	    public void Egnore_User () {
	    	WaitUtils.waitForElement(driver, egnore);
		    driver.findElement(egnore).click();
	    }
	    
	    public boolean VarifyAcceptRequest  () {  	
	        WaitUtils.waitForElement(driver, AcceptRequest);
	        return driver.findElement(AcceptRequest).getText().contains("No patient with this UserName!");
	    }
	    
	    public boolean VarifyRemoveRequest  () {  	
	        WaitUtils.waitForElement(driver, RemoveRequest);
	        return driver.findElement(RemoveRequest).getText().contains("No patient with this UserName!");
	    }
	   
}
	//android.view.View[@content-desc="request accepted!"]
