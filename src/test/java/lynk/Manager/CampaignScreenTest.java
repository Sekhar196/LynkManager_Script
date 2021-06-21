package lynk.Manager;

import org.testng.annotations.Test;

public class CampaignScreenTest extends CampaignScreen{
	
	
	@Test
	public void campaignDetails() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(50000);
		clickOnmenuLink();
		clickOnScreenLink();
		campaignMethods();		
	}
	
	@Test
	public void createCampaign() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(50000);
		clickOnmenuLink();
		clickOnScreenLink();
		Thread.sleep(35000);
		clickOnOutSide();
		Thread.sleep(5000);
		clickOnCreateCampaign();
		enterCampaignName();
		enterSubject();
		enterContent();
		selectRecepients();
//		clickOnOutSideCreate();
		Thread.sleep(2000);
    	clickOnSave();
	}

}
