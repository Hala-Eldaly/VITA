package Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Setup.Basic;

public class Close_Patient extends Basic {
	  String DrName="hala";
		
	  @Test(priority = 1)
	    public void Close_Patient() throws InterruptedException {
	    	new HomePage(driver).OpenDr();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressClosePatient();
	    	new HomePage(driver).Enter_Options();
	        Assert.assertTrue(new Options(driver).VarifyCloose());

}
}
