package Profile;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Setup.Basic;

public class Add_Patient_Profile extends Basic {
  
	 @Test(priority = 1)
	    public void Add_Profile_Patient() throws InterruptedException {
	    	new HomePage(driver).Add_Profile_Patient();
	        Assert.assertTrue(new HomePage(driver).Add_Profile_Patient_Varify_mess());
	       Thread.sleep(2000);
	    }
}
