package Pharmacy;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Prescriptions;
import Setup.Basic;

public class CheckPrescriptions extends Basic {
	  String DrName="llleo" , Pharmacy_Username = "Hala_Pharmacy" ;
		
	  @Test(priority = 1)
	    public void Varify_Opened_Prescription() throws InterruptedException {
	    	new HomePage(driver).OpenPhar();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressPrescriptions();
	    	new Prescriptions(driver).OpenPrescription();

	       // Assert.assertTrue(new Prescriptions(driver).VarifyOpenedPrescription());

}
}
