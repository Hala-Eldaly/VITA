package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Prescriptions {
	private AndroidDriver<MobileElement> driver;

    public Prescriptions(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    private final By openprescriptionP = By.className("//android.view.View[@content-desc=\"hala 08/07/24\"]");
    private final By PressDoctorNameP = By.xpath("//android.widget.ImageView[@content-desc=\"hala\"]");
    private final By openprescription = By.className("android.view.View");
    private final By PressDoctorName1 = By.xpath("//android.widget.ImageView[@content-desc=\"llleo\"]");
    private final By PressDoctorName2 =MobileBy.AccessibilityId("Doctor Name: \\nllleo");
    private final By Medicine = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[1]");
    private final By NoteM = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[2]");
    private final By Test = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[1]");
    private final By NoteT = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[2]");
    private final By XRay = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[1]");
    private final By NoteXR = By.xpath("//android.widget.ScrollView/android.view.View[1]/android.widget.EditText[2]");
    private final By Diagnosis = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By NoteD = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By Add = By.xpath("//android.widget.Button[@content-desc=\"done\"]");
    private final By VarifyMess = By.xpath("//android.view.View[@content-desc=\"Prescription uplaoded!\"]");
    private final By Next = By.xpath("//android.widget.Button[@content-desc=\"next\"]");
    private final By emptydata =MobileBy.AndroidUIAutomator("new UiSelector().description(\"data is empty\")");

  
    
    public void OpenPrescription() {
        WebDriverWait wait = new WebDriverWait(driver , 10);
        WebElement doctorNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(PressDoctorName1));
        
        doctorNameElement.click();
        
        WebElement openPrescriptionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(openprescription));
        
        openPrescriptionElement.click();
    }
    
    public void OpenPrescriptionP() {
        WebDriverWait wait = new WebDriverWait(driver , 20); 
        WebElement doctorNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(PressDoctorNameP));
        
        doctorNameElement.click();
        
        WebElement openPrescriptionElement = wait.until(ExpectedConditions.visibilityOfElementLocated(openprescription));
        
        openPrescriptionElement.click();
    }

	    
    public boolean VarifyOpenedPrescription() {
        WaitUtils.waitForElement(driver, PressDoctorName2);
        return driver.findElement(PressDoctorName2).isDisplayed();
    }

	
	
	public void Add_Medicine(String medicine , String note) {
		 WaitUtils.waitForElement(driver, Medicine);
	     driver.findElement(Medicine).click();
	     
		 WaitUtils.waitForElement(driver, Medicine);
	     driver.findElement(Medicine).sendKeys(medicine);
	     
	     WaitUtils.waitForElement(driver, NoteM);
	     driver.findElement(NoteM).click();
	       
	     WaitUtils.waitForElement(driver, NoteM);
	     driver.findElement(NoteM).sendKeys(note);
	     
		 driver.hideKeyboard();

	     
	     WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	     	    
	}
	
	public void Add_Test(String test , String note) {
		 WaitUtils.waitForElement(driver, Test);
	     driver.findElement(Test).click();
	     
		 WaitUtils.waitForElement(driver, Test);
	     driver.findElement(Test).sendKeys(test);
	     
	     WaitUtils.waitForElement(driver, NoteT);
	     driver.findElement(NoteT).click();
	       
	     WaitUtils.waitForElement(driver, NoteT);
	     driver.findElement(NoteT).sendKeys(note);
	     
		 driver.hideKeyboard();

	     
	     WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	     
	 	}
	
	public void Add_XRay(String xray , String note) {
		 WaitUtils.waitForElement(driver, XRay);
	     driver.findElement(XRay).click();
	     
		 WaitUtils.waitForElement(driver, XRay);
	     driver.findElement(XRay).sendKeys(xray);
	     
	     WaitUtils.waitForElement(driver, NoteXR);
	     driver.findElement(NoteXR).click();
	       
	     WaitUtils.waitForElement(driver, NoteXR);
	     driver.findElement(NoteXR).sendKeys(note);
	     
		 driver.hideKeyboard();

	     
	     WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	    
	}
	
	public void Add_Diagnosis(String diagnosis , String note) {
		 WaitUtils.waitForElement(driver, Diagnosis);
	     driver.findElement(Diagnosis).click();
	     
		 WaitUtils.waitForElement(driver, Diagnosis);
	     driver.findElement(Diagnosis).sendKeys(diagnosis);
	     
	     WaitUtils.waitForElement(driver, NoteD);
	     driver.findElement(NoteD).click();
	     
	     WaitUtils.waitForElement(driver, NoteD);
	     driver.findElement(NoteD).sendKeys(note);
	     
		 driver.hideKeyboard();
		 
	     WaitUtils.waitForElement(driver, Add);
	     driver.findElement(Add).click();	    
	}
	
	 public boolean VarifyAddedPrescription() {
	        WaitUtils.waitForElement(driver, VarifyMess);
	        return driver.findElement(VarifyMess).isDisplayed();
	    }
	 
	 public boolean EmptyPrescription() {
		 WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	     
	     WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	     
	     WaitUtils.waitForElement(driver, Next);
	     driver.findElement(Next).click();
	     
	     WaitUtils.waitForElement(driver, Add);
	     driver.findElement(Add).click();
		 
	     WaitUtils.waitForElement(driver, emptydata);
	     return driver.findElement(emptydata).isDisplayed();
	    }
	
	
	
	
	
   
}
