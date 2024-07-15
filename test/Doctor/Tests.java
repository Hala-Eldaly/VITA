package Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Prescriptions;
import Pom.Testss;
import Setup.Basic;

public class Tests extends Basic {
	  String gender="spine" ;
		
	  @Test(priority = 1)
	    public void Varify_Opened_Test() throws InterruptedException {
	    	new HomePage(driver).OpenDr();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressTests();
	    	new Testss(driver).ChooseCategory();
	       // Assert.assertTrue(new Testss(driver).VarifyTest());

}
}

