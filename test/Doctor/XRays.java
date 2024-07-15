package Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Xrays;
import Setup.Basic;

public class XRays extends Basic {
	  String xrayName="bones" ;
		
	  @Test(priority = 1)
	    public void Varify_Opened_XRay() throws InterruptedException {
	    	new HomePage(driver).OpenDr();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressXRrays();
	    	new Xrays(driver).ChooseXRayDr();
	        Assert.assertTrue(new Xrays(driver).verifyXRayDr());

}
}

