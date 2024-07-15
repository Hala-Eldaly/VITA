package Patient;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Xrays;
import Setup.Basic;

public class XRays extends Basic {
	  String xrayName="bones" ;
		
	  @Test(priority = 1)
	    public void Varify_Opened_XRay() {
	    	new HomePage(driver).Openp();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressXRrays();
	    	new Xrays(driver).ChooseXRayP();
	        Assert.assertTrue(new Xrays(driver).verifyXRayP());

}
}

