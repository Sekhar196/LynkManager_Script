package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramAllotementTest extends ProgramAllotement {
	
	/** To Check For Internal Seller 
	 * @throws IOException */
	@Test
	public void internalSeller() throws InterruptedException, IOException
	{
//		AdminLogin login = new AdminLogin();
//		login.loginToLynkmanager();
     	ProgramInformationGeneralTest detailsLink = new ProgramInformationGeneralTest();
     	detailsLink.programmesScreen();
//		Thread.sleep(35000);
//		detailsLink.clickOnProgram();
//		Thread.sleep(20000);
//		detailsLink.addProgramme();
//		detailsLink.programmesPage();
		
		Thread.sleep(5000);		
		ProgramLocalisation local = new ProgramLocalisation();
		local.LocalisationScreen();
		ProgramLots lot           = new ProgramLots();
		lot.combo();
		Thread.sleep(2000);
		ProgramPackage pack = new ProgramPackage();
		pack.packagePage();
		Thread.sleep(2000);
		ProgramMedia med          = new ProgramMedia();
		med.mediaScreen();
		Thread.sleep(15000);
		assignPrograme();
		sellerInYourCompany();
		sellDropdown();
		addButton();
		//saveButton();
		closeButton();
		ContactOpportunityTest contact = new ContactOpportunityTest();
		contact.opportunityTest();
	}
	
	/** To Check For Adding New Internal Seller 
	 * @throws IOException */
	@Test
	public void addNewInternalSeller() throws InterruptedException, IOException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		ProgramInformationsGénérales detailsLink = new ProgramInformationsGénérales();
		Thread.sleep(35000);
		detailsLink.programmesPage();
		Thread.sleep(35000);		
		ProgramLocalisation local = new ProgramLocalisation();
		local.LocalisationScreen();
		ProgramLots lot           = new ProgramLots();
		lot.combo();
		ProgramPackage pack = new ProgramPackage();
		pack.packagePage();
		ProgramMedia med          = new ProgramMedia();
		med.clickOnSave();
		assignPrograme();
		sellerInYourCompany();
		Thread.sleep(10000);
		sellDropdown();
		addNewSeller();
		addButton();
	}
	
	/** To Check For External Marketer 
	 * @throws IOException */
	@Test
	public void externalMarketer() throws InterruptedException, IOException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		ProgramInformationsGénérales detailsLink = new ProgramInformationsGénérales();
		Thread.sleep(35000);
		detailsLink.programmesPage();
		Thread.sleep(35000);		
		ProgramLocalisation local = new ProgramLocalisation();
		local.LocalisationScreen();
		ProgramLots lot           = new ProgramLots();
		lot.combo();
		ProgramPackage pack = new ProgramPackage();
		pack.packagePage();
		ProgramMedia med          = new ProgramMedia();
		med.clickOnSave();
		assignPrograme();
		externalMark();
		externalMarkDropdown();
		addButton();
	}
	
	/** To Check For Adding New External Marketer 
	 * @throws IOException */
	@Test
	public void addingNewExternalMarketer() throws InterruptedException, IOException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		ProgramInformationsGénérales detailsLink = new ProgramInformationsGénérales();
		Thread.sleep(35000);
		detailsLink.programmesPage();
		Thread.sleep(35000);		
		ProgramLocalisation local = new ProgramLocalisation();
		local.LocalisationScreen();
		ProgramLots lot           = new ProgramLots();
		lot.combo();
		ProgramPackage pack = new ProgramPackage();
		pack.packagePage();
		ProgramMedia med          = new ProgramMedia();
		med.clickOnSave();
		assignPrograme();
		externalMark();
		externalMarkDropdown();
		addNewExternalSeller();
		addButton();
	}

}
