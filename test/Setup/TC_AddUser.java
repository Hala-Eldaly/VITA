package Setup;
import org.testng.annotations.Test;

import Pom.HomePage;

import org.testng.Assert;
	public class TC_AddUser extends Basic {
	    String username="hala" ;

	    
	    @Test(priority = 1)
	    public void Add_User() throws InterruptedException {    	
	    	new HomePage(driver).Add(username);
	        Assert.assertTrue(new HomePage(driver).Add_User_Varify_Mess());
	       Thread.sleep(2000);
	    }
}
