package lynk.Manager;

import org.testng.annotations.Test;

public class ElectricalSignatureTest extends ElectricSignature{
	
	
	@Test
	public void electricSign() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(50000);
		clickOnMenuLink();
		clickOnScreenLink();
		Thread.sleep(10000);
		clickOnAvancement();
		clickOnResendEmail();
		
	}
	
	@Test
	public void getList() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(60000);
		clickOnMenuLink();
		clickOnScreenLink();
		Thread.sleep(50000);
		clickOnOutSide();
		Thread.sleep(2000);
		selectAction();
		getSizeOfContacts();
	}

}
