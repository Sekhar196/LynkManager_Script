package lynk.Manager;

import org.testng.annotations.Test;

public class ContentScreenTest extends ContentsScreen{
	
	
	@Test
	public void contents() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(35000);
		clickOnContentScreenLink();
		Thread.sleep(17000);
		clickOnOutSide();
		contentScreen();
	}

}
