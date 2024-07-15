package Pom;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomePage {
   AndroidDriver<MobileElement> driver;

    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }
    private final By press_arrow = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[3]");
    private final By press_add_profile =MobileBy.AndroidUIAutomator("new UiSelector().description(\"add profile\")");
    private final By choose_Profile_Type  = By.xpath("//android.widget.Button[@content-desc=\"patient\"]");
    private final By Specialization = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By Prove_Number_Dr_Click  = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    private final By Prove_Number_Dr_Input  = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By organization_Username_Click = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By organization_Username_Input = By.xpath("//android.widget.ScrollView/android.widget.EditText[2]");
    private final By Prove_Number_Org_Click = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]");
    private final By Prove_Number_Org_Input = By.xpath("//android.widget.ScrollView/android.widget.EditText[1]");
    private final By add = By.xpath("//android.widget.Button[@content-desc=\"Add\"]");
    private final By click_search  = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]");
    private final By input_username = By.xpath("//android.widget.EditText");
    private final By choose  = By.xpath("//android.widget.Button[@content-desc=\"patient\"]");
    private final By choosed  = By.xpath("//android.view.View[@content-desc=\"doctor\"]");
    private final By press_add =MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.ImageView\")");
    private final By Enter_Profile = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]");
    private final By Enter_Options  = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]");
    private final By Enter_Connections = By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[4]");
    private final By varify1 = By.xpath("//android.view.View[@content-desc=\"Add Patient Profile Successfully!\"]");
    private final By varify2 = By.xpath("//android.view.View[@content-desc=\"Add Doctor Profile Successfully!\"]");
    private final By varify3 = By.xpath("//android.view.View[@content-desc=\"Add Pharmacy Profile Successfully!\"]");
    private final By varify4 = By.xpath("//android.view.View[@content-desc=\"Add XRay-Lab Profile Successfully!\"]");
    private final By varify5 = By.xpath("//android.view.View[@content-desc=\"Add Test-Lab Profile Successfully!\"]");
    private final By AddVarify = By.xpath("//android.view.View[@content-desc=\"Request Access Done\"]");
    private final By AddError = By.xpath("//android.view.View[@content-desc=\"No patient with this UserName!\"]");
    
    private final By patient = By.xpath("//android.widget.ImageView[@content-desc=\"Patient\"]");
    private final By doctor = By.xpath("//android.widget.ImageView[@content-desc=\"Doctor\"]");
    private final By tests_lab = By.xpath("//android.view.View[@content-desc=\"tests lab\"]");
    private final By xray_lab = By.xpath("//android.view.View[@content-desc=\"x-ray lab\"]");
    private final By pharmacy = By.xpath("//android.widget.ImageView[@content-desc=\"Hala_Pharmacy\"]");
    private final By LOGOUT_BUTTON =  MobileBy.AndroidUIAutomator("new UiSelector().description(\"Log out\")");
    
    private final By patient0 = By.xpath("//android.view.View[@content-desc=\"patient\"]");
    private final By doctor0 = By.xpath("//android.view.View[@content-desc=\"doctor\"]");
    private final By pharmacy0 = By.xpath("//android.view.View[@content-desc=\"pharmacy\"]");
    private final By xray_lab0 = By.xpath("//android.view.View[@content-desc=\"x-ray lab\"]");
    private final By tests_lab0 = By.xpath("//android.view.View[@content-desc=\"tests lab\"]");


    
    
    public void Enter_Profile () {
        WaitUtils.waitForElement(driver, Enter_Profile);
        driver.findElement(Enter_Profile).click();
    }
    
    public void Enter_Options () {
        WaitUtils.waitForElement(driver, Enter_Options);
        driver.findElement(Enter_Options).click();
    }
    
    public void Enter_Connections () {
        WaitUtils.waitForElement(driver, Enter_Connections);
        driver.findElement(Enter_Connections).click();
    }
    
    
    public void Add_Profile_Patient () {
   	  WaitUtils.waitForElement(driver, press_arrow);
      driver.findElement(this.press_arrow).click();
      
      WaitUtils.waitForElement(driver, press_add_profile);
      driver.findElement(this.press_add_profile).click();
            
      WaitUtils.waitForElement(driver, add);
      driver.findElement(this.add).click();
      
     
  }

    public void Add_Profile_Doctor( int Prove_Number  , String Specialization_name ) {
    	WaitUtils.waitForElement(driver, press_arrow);
        driver.findElement(this.press_arrow).click();
        
        WaitUtils.waitForElement(driver, press_add_profile);
        driver.findElement(this.press_add_profile).click();
        
        WaitUtils.waitForElement(driver, choose_Profile_Type);
        driver.findElement(this.choose_Profile_Type).click();
        
        WaitUtils.waitForElement(driver, doctor0);
        driver.findElement(this.doctor0).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Dr_Click);
        driver.findElement(this.Prove_Number_Dr_Click).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Dr_Input );
        driver.findElement(this.Prove_Number_Dr_Input ).sendKeys(String.valueOf(Prove_Number));
        
        WaitUtils.waitForElement(driver, Specialization);
        driver.findElement(this.Specialization).click();
        
        
        WaitUtils.waitForElement(driver, Specialization);
        driver.findElement(this.Specialization).sendKeys(Specialization_name);
        
		driver.hideKeyboard();

        
        WaitUtils.waitForElement(driver, add);
        driver.findElement(this.add).click();
        
       
    }

    public void Add_Profile_xray_lab ( int Prove_Number ,  String organization_Username1) {  	
    	WaitUtils.waitForElement(driver, press_arrow);
        driver.findElement(this.press_arrow).click();
        
        WaitUtils.waitForElement(driver, press_add_profile);
        driver.findElement(this.press_add_profile).click();
        
        WaitUtils.waitForElement(driver, choose_Profile_Type);
        driver.findElement(this.choose_Profile_Type).click();
        
        WaitUtils.waitForElement(driver, xray_lab0);
        driver.findElement(this.xray_lab0).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Click);
        driver.findElement(this.Prove_Number_Org_Click).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Input);
        driver.findElement(this.Prove_Number_Org_Input).sendKeys(String.valueOf(Prove_Number));
         
        WaitUtils.waitForElement(driver, organization_Username_Click);
        driver.findElement(this.organization_Username_Click).click();
        
        WaitUtils.waitForElement(driver, organization_Username_Input);
        driver.findElement(this.organization_Username_Input).sendKeys(organization_Username1);
		driver.hideKeyboard();

        
        WaitUtils.waitForElement(driver, add);
        driver.findElement(this.add).click();
               
    }
    
    public void Add_Profile_tests_lab(int prove_Number1, String organization_Username1) {
    	WaitUtils.waitForElement(driver, press_arrow);
        driver.findElement(this.press_arrow).click();
        
        WaitUtils.waitForElement(driver, press_add_profile);
        driver.findElement(this.press_add_profile).click();
        
        WaitUtils.waitForElement(driver, choose_Profile_Type);
        driver.findElement(this.choose_Profile_Type).click();
        
        WaitUtils.waitForElement(driver, tests_lab0);
        driver.findElement(this.tests_lab0).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Click);
        driver.findElement(this.Prove_Number_Org_Click).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Input);
        driver.findElement(this.Prove_Number_Org_Input).sendKeys(String.valueOf( prove_Number1 ));
         
        WaitUtils.waitForElement(driver, organization_Username_Click);
        driver.findElement(this.organization_Username_Click).click();
        
        WaitUtils.waitForElement(driver, organization_Username_Input);
        driver.findElement(this.organization_Username_Input).sendKeys(organization_Username1);
		driver.hideKeyboard();

        WaitUtils.waitForElement(driver, add);
        driver.findElement(this.add).click();
        
       
    }
    
    public void Add_Profile_Pharmacy ( int Prove_Number ,  String organization_Username1) {  	
    	WaitUtils.waitForElement(driver, press_arrow);
        driver.findElement(this.press_arrow).click();
        
        WaitUtils.waitForElement(driver, press_add_profile);
        driver.findElement(this.press_add_profile).click();
        
        WaitUtils.waitForElement(driver, choose_Profile_Type);
        driver.findElement(this.choose_Profile_Type).click();
        
        WaitUtils.waitForElement(driver, pharmacy0);
        driver.findElement(this.pharmacy0).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Click);
        driver.findElement(this.Prove_Number_Org_Click).click();
        
        WaitUtils.waitForElement(driver, Prove_Number_Org_Input);
        driver.findElement(this.Prove_Number_Org_Input).sendKeys(String.valueOf( Prove_Number ));
        
        WaitUtils.waitForElement(driver, organization_Username_Click);
        driver.findElement(this.organization_Username_Click).click();
        
        WaitUtils.waitForElement(driver, organization_Username_Input);
        driver.findElement(this.organization_Username_Input).sendKeys(organization_Username1);
		driver.hideKeyboard();
        
        WaitUtils.waitForElement(driver, add);
        driver.findElement(this.add).click();
        
       
    }
    
  
    public boolean Add_Profile_Patient_Varify_mess () {
       WaitUtils.waitForElement(driver, varify1);
       return driver.findElement(varify1).isDisplayed();
    }
        
        

   public boolean Add_Profile_Doctor_Varify_mess () {
        WaitUtils.waitForElement(driver, varify2);
        return driver.findElement(varify2).isDisplayed();
   }
            
   public boolean Add_Profile_Pharmacy_Varify_mess  () {  	
       WaitUtils.waitForElement(driver, varify3);
       return driver.findElement(varify3).isDisplayed();
   }  
   
   public boolean Add_Profile_XRyas_Lab_Varify_mess  () {  	
       WaitUtils.waitForElement(driver, varify4);
       return driver.findElement(varify4).isDisplayed();
   }  
   
   public boolean Add_Profile_Tests_Lab_Varify_mess  () {  	
       WaitUtils.waitForElement(driver, varify5);
       return driver.findElement(varify5).isDisplayed();
   }  
   
   public void Add ( String username) {
  	  WaitUtils.waitForElement(driver, click_search);
     driver.findElement(this.click_search).click();
     
     WaitUtils.waitForElement(driver, input_username);
     driver.findElement(this.input_username).sendKeys(username);
     
     WaitUtils.waitForElement(driver, choose);
     driver.findElement(choose).click();
     
     WaitUtils.waitForElement(driver, choosed);
     driver.findElement(this.choosed).click();
     
     WaitUtils.waitForElement(driver, press_add);
     driver.findElement(this.press_add).click();
     
 }
   
   public boolean Add_User_Varify_Mess  () {  	
       WaitUtils.waitForElement(driver, AddVarify);
       return driver.findElement(AddVarify).isDisplayed();
   }
   
   public boolean Add_User_Error_Mess  () {  	
       WaitUtils.waitForElement(driver, AddError);
       return driver.findElement(AddError).isDisplayed();
   }
   
   
   public void OpenDr () {
	    WaitUtils.waitForElement(driver, press_arrow);
	    driver.findElement(this.press_arrow).click();
	    
	    WaitUtils.waitForElement(driver, doctor);
	    driver.findElement(this.doctor).click();
	   
  }
   
   public void Openp () {
	    WaitUtils.waitForElement(driver, press_arrow);
	    driver.findElement(this.press_arrow).click();
	    
	    WaitUtils.waitForElement(driver, patient);
	    driver.findElement(this.patient).click();
	   
  }
   
   public void OpenTest () {
	    WaitUtils.waitForElement(driver, press_arrow);
	    driver.findElement(this.press_arrow).click();
	    
	    WaitUtils.waitForElement(driver, tests_lab);
	    driver.findElement(this.tests_lab).click();
	   
  }
   
   public void OpenXR () {
	    WaitUtils.waitForElement(driver, press_arrow);
	    driver.findElement(this.press_arrow).click();
	    
	    WaitUtils.waitForElement(driver, xray_lab);
	    driver.findElement(this.xray_lab).click();
	   
  }
   
   public void OpenPhar () {
	    WaitUtils.waitForElement(driver, press_arrow);
	    driver.findElement(this.press_arrow).click();
	    
	    WaitUtils.waitForElement(driver, pharmacy);
	    driver.findElement(this.pharmacy).click();
	   
  }
   
   public void Logout () {
	   WaitUtils.waitForElement(driver, press_arrow);
       driver.findElement(this.press_arrow).click();
	   
		 WaitUtils.waitForElement(driver, LOGOUT_BUTTON);
	     driver.findElement(this.LOGOUT_BUTTON).click();
		
 }   

     
       
    }
 

