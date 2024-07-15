package Profile;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pom.HomePage;
import Setup.Basic;

public class Add_Doctor_Profile extends Basic {
	String  Specialization_name="Heart" ;  int Prove_Number= 10 ;

	 @Test(priority = 1)
	    public void Add_Pharmacy() throws InterruptedException {
	    	new HomePage(driver).Add_Profile_Doctor(Prove_Number, Specialization_name);
	    	
	        Assert.assertTrue(new HomePage(driver).Add_Profile_Doctor_Varify_mess());
	        Thread.sleep(2000);

	    }

}
