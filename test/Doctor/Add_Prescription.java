package Doctor;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Options;
import Pom.Prescriptions;
import Setup.Basic;

public class Add_Prescription  extends Basic  {
	
    String Medicine="Panadol" ,
    	   NotesM="3 times per day." ,
		   Test="CBC" ,    
		   NotesT="A complete blood count (CBC) , take care of the matter as soon as possible ."  ,
		   XRay="Abdominal X-ray" ,
		   NotesXR="take care of the matter as soon as possible ." ,
		   Diagnosis="Panadol" ,
		   NotesD="Primary Diagnosis: Hypertension\r\n"
		   		+ "\r\n"
		   		+ "ICD-10 Code: I10\r\n"
		   		+ "Secondary Diagnosis: Type 2 Diabetes Mellitus\r\n"
		   		+ "\r\n"
		   		+ "ICD-10 Code: E11.9" ;

		   	
	 @Test(priority = 1)
	    public void Add_Prescription() throws InterruptedException {
	    	new HomePage(driver).OpenDr();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).AccessPatient();
	    	new Options(driver).ChoosePatientToAccsee();
	    	new HomePage(driver).Enter_Options();
	    	new Options(driver).PressAddPrescriptions();
	    	new Prescriptions(driver).Add_Medicine(Medicine, NotesM);
	    	new Prescriptions(driver).Add_Test(Test, NotesT);
	    	new Prescriptions(driver).Add_XRay(XRay, NotesXR);
	    	new Prescriptions(driver).Add_Diagnosis(Diagnosis, NotesD);

	        //Assert.assertTrue(new Prescriptions(driver).VarifyAddedPrescription());

}
}