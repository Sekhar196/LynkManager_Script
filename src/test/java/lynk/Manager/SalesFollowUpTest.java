package lynk.Manager;

import org.testng.annotations.Test;

public class SalesFollowUpTest extends SalesFollowUpScreen{
	
	
	@Test
	public void salesFollowUpScreenTest() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(60000);
		salesFollowUpScreen();
	}

}
