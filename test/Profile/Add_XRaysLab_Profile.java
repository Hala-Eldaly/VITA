package Profile;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Setup.Basic;

public class Add_XRaysLab_Profile extends Basic {
	String Username="NewXRay" ; int  Prove_Number= 10 ;

	 @Test(priority = 1)
	    public void Add_Pharmacy() throws InterruptedException {
	    	new HomePage(driver).Add_Profile_xray_lab(Prove_Number, Username);
	        Assert.assertTrue(new HomePage(driver).Add_Profile_XRyas_Lab_Varify_mess());
	        Thread.sleep(2000);

	    }

}
