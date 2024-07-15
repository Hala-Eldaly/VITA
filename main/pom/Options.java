package Pom;
import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Options {

	
    private AndroidDriver<MobileElement> driver;

    public Options(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
	    private final By Tests = By.xpath("//android.widget.ImageView[@content-desc=\"Tests\"]");
	    private final By XRays = By.xpath("//android.widget.ImageView[@content-desc=\"X-rays\"]");
	    private final By Prescriptions = By.xpath("//android.widget.ImageView[@content-desc=\"Prescriptions\"]");
	    private final By AddPrescriptions = By.xpath("//android.widget.ImageView[@content-desc=\"Add Prescription\"]");
	    private final By ClosePatient = By.xpath("//android.widget.ImageView[@content-desc=\"Close Patient\"]");
	    private final By GeneralInfo = By.xpath("//android.widget.ImageView[@content-desc=\"General Info\"]");
	    private final By AccessPatient = By.xpath("//android.widget.ImageView[@content-desc=\"Access Patient\"]");
	    private final By PressPatient = MobileBy.AccessibilityId("kareem\nkareem");
	    private final By UploadPost = By.xpath("//*[@id=\"root\"]/div[2]/div/a[2]");
	    private final By UploadXRay = By.xpath("//android.widget.ImageView[@content-desc=\"Upload X-Ray\"]");
	    private final By UploadCsvTest = By.xpath("//android.widget.ImageView[@content-desc=\"Upload Test\"]");

	    

	    public void PressTests() {
	        WaitUtils.waitForElement(driver, Tests);
	        driver.findElement(Tests).click();
	    }
	    
	    public void PressXRrays() {
	        WaitUtils.waitForElement(driver, XRays);
	        driver.findElement(XRays).click();
	    }
	    
	    public void PressPrescriptions() {
	        WaitUtils.waitForElement(driver, Prescriptions);
	        driver.findElement(Prescriptions).click();
	    }
	    
	    public void PressAddPrescriptions() {
	        WaitUtils.waitForElement(driver, AddPrescriptions);
	        driver.findElement(AddPrescriptions).click();
	    }
	    
	    public void PressClosePatient() {
	        WaitUtils.waitForElement(driver, ClosePatient);
	        driver.findElement(ClosePatient).click();
	    }
	    
	    public void PressGeneralInfo() {
	        WaitUtils.waitForElement(driver, GeneralInfo);
	        driver.findElement(GeneralInfo).click();
	    }
	   

		public void AccessPatient() {
			 WaitUtils.waitForElement(driver, AccessPatient);
		        driver.findElement(AccessPatient).click();
		    }	
		
		  
	    public void ChoosePatientToAccsee() throws InterruptedException {
	    	Thread.sleep(3000);
	        WaitUtils.waitForElement(driver, PressPatient);
	        driver.findElement(PressPatient).click();
	    }
	    
	    public boolean VarifyCloose() {
	        WaitUtils.waitForElement(driver, AccessPatient);
	        return driver.findElement(AccessPatient).isDisplayed();
	    }
	    
	    public void UploadPost() {
	        WaitUtils.waitForElement(driver, UploadPost);
	        driver.findElement(UploadPost).click();
	    }
	    
	    public void UploadXRay() {
	        WaitUtils.waitForElement(driver, UploadXRay);
	        driver.findElement(UploadXRay).click();
	    }
	    
	    public void UploadCsvTest() {
	        WaitUtils.waitForElement(driver, UploadCsvTest);
	        driver.findElement(UploadCsvTest).click();
	    }

	    
	    
	    
		}


	   

 