package lynk.Manager;

import org.testng.annotations.Test;

public class TeamScreenTest extends TeamScreen{
	
	/** To Check For Team Screen Test */
	@Test
	public void teamScreenTest() throws InterruptedException
	{
		clickOnTeamMenuLink();
		teamScreen();
	}
	
	/** To Check For External User */
	@Test
	public void externUser() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(70000);
		clickOnTeamMenuLink();
		Thread.sleep(70000);
		teamScreen();
		selectExternRole();
		selectAgency();
		clickOnSave();
	}
	
	/** To Check For Create New Agency */
	@Test
	public void createNewAgency() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(90000);
		clickOnTeamMenuLink();
		Thread.sleep(40000);
		teamScreen();
		selectExternRole();
		Thread.sleep(20000);
		selectNewAgency();
		clickOnSave();
	}
	
	/** To Check For AllotmentProgram */
	@Test
	public void allotmentProg() throws InterruptedException
	{
		teamScreenTest();
		Thread.sleep(5000);
		clickOnSelectProgram();
		Thread.sleep(10000);
		selectCheckBox();
		clickOnAllotmentSave();
	}
	
	/** To Check For Program Edit */
	@Test
	public void editUser() throws InterruptedException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(50000);
		clickOnTeamMenuLink();
		Thread.sleep(50000);
		clikOnOutSide();
		Thread.sleep(2000);
		clickOnEdit();
		Thread.sleep(2000);
		clickOnEditSave();
	}

}
