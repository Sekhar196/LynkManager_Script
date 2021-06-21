package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class MessagingScreenTest extends MessagingScreen{
	
	
	@Test
	public void messaging() throws InterruptedException, IOException
	{
		
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(10000);
		clickOnMessagingScreen();
		Thread.sleep(25000);
		clickOnOutlookIcon();
//		messagingMethods();
		clickOnInbox();
		selectMessage();
		selectAction();
		
		
	}
	
	@Test
	public void createContactTest() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(40000);
		clickOnMessagingScreen();
		Thread.sleep(50000);
		createContact();
	}
	
	@Test
	public void createEvent() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(90000);
		clickOnMessagingScreen();
		Thread.sleep(50000);
		addEvent();
	}

}
