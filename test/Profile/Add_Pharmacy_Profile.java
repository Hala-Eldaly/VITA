package Profile;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Setup.Basic;

public class Add_Pharmacy_Profile extends Basic {
	String Username="NewP" ; int  Prove_Number= 10 ;

	 @Test(priority = 1)
	    public void Add_Pharmacy() throws InterruptedException {
	    	new HomePage(driver).Add_Profile_Pharmacy(Prove_Number, Username);
	        Assert.assertTrue(new HomePage(driver).Add_Profile_Pharmacy_Varify_mess());
	        Thread.sleep(2000);

	    }

}
