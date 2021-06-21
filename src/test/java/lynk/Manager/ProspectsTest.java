package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProspectsTest extends ProspectsScreen{
	
	/** To Check For Prospects Screen */
	@Test
	public void file() throws InterruptedException, IOException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		clickOnProspects();
		Thread.sleep(45000);
		clickOnAddOpp();
		ContactGeneralInfo info      = new ContactGeneralInfo();
//		info.contactScreen();
		info.contactsPage();
		Thread.sleep(2000);
		ContactOpportunities oppo    = new ContactOpportunities();
        oppo.opportunityScreen();
        Thread.sleep(3000);
       	oppo.clickOnProgram();
		oppo.clickOnLot();
		oppo.clickOnSave();
//		uploadFile();
		Thread.sleep(5000);
		oppo.clickOnClose();
		prospectsPage();		
	}
	
	/** To Check For Electric Signature */
	@Test
	public void electricSignature() throws InterruptedException, IOException
	{
		file();
		Thread.sleep(5000);
//		selectEtape();
//		clickOnEleSignToggle();
//		clickOnElectricSign();
//	    Thread.sleep(40000);	
//		clickOnAddSignDropDown();
//		searchAddNewSign();
//		addingSignaturie1();
//		Thread.sleep(10000);
//		addingSignaturie2();
//		Thread.sleep(20000);
//		clickOnOutSide();
		Thread.sleep(2000);
		selectSignturies();
		Thread.sleep(2000);
		uploadDocuments();
//		parametres();
		Thread.sleep(20000);
		emailTemplate();
		selectEmailTemplate();
		ClickOnfinaliser();
	}
    
	/** To Check For Gmail Login */
	@Test
	public void loginForGmail() throws InterruptedException
	{
		loginGmail();
	}
}
