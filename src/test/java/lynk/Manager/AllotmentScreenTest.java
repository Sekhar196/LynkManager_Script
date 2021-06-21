package lynk.Manager;

import org.testng.annotations.Test;

public class AllotmentScreenTest extends AllotementScreen{
	
	
	@Test
	public void allotmentScreen() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(35000);
		clickOnAllotmentInMenu();
		clickOnAllotmentScreenLink();
		Thread.sleep(15000);
		clickOnOutSide();
		clickOnView();
		Thread.sleep(5000);
		getstatus("Reigns576 Roman233");
		clickOnClose();
//		Thread.sleep(5000);
//		selectProgram();
	}
	
	@Test
	public void clickOnReset() throws InterruptedException
	{
		allotmentScreen();
		clickOnOutSide();
		Thread.sleep(10000);
		clickOnProgDropDown();
		Thread.sleep(5000);
		selectReset();
	}

}
