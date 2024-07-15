package Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Prescriptions;
import Setup.Basic;
public class Add_EmptyPrescription extends Basic {
	
	 @Test(priority = 1)
	    public void Add_Prescription() throws InterruptedException {
	    	new HomePage(driver).OpenDr();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressAddPrescriptions();
	    	new Prescriptions(driver).EmptyPrescription() ;
	        //Assert.assertTrue(new Prescriptions(driver).VarifyAddedPrescription());
	

}
}
