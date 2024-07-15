package Patient;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Prescriptions;
import Setup.Basic;

public class Open_Prescription extends Basic {
	  String DrName="llleo";
		
	  @Test(priority = 1)
	    public void Varify_Opened_Prescription() {
		    new HomePage(driver).Openp();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressPrescriptions();
	    	new Prescriptions(driver).OpenPrescriptionP();
	       // Assert.assertTrue(new Prescriptions(driver).VarifyOpenedPrescription());

}
}
