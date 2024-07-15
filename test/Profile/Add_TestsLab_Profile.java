package Profile;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Setup.Basic;

public class Add_TestsLab_Profile extends Basic {
	String Username="NewTest" ; int  Prove_Number= 10 ;

	 @Test(priority = 3)
	    public void Add_Pharmacy() throws InterruptedException {
	    	new HomePage(driver).Add_Profile_tests_lab(Prove_Number, Username) ;
	        Assert.assertTrue(new HomePage(driver).Add_Profile_Tests_Lab_Varify_mess());
	        Thread.sleep(2000);

	    }

}
