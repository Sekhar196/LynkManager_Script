package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(lynk.Manager.Listeners.class)
public class ProgramInformationGeneralTest extends ProgramInformationsGénérales {

	
	/** To check Program General Information Screen */
	@Test
	public void programmesScreen() throws InterruptedException, IOException
	{
		clickOnProgram();
		addProgramme();
	    programmesPage();
//	    driver.close();
	}
	
	@Test
	public void createOptionForLotTest() throws InterruptedException, IOException
	{
    	clickOnProgram();
		optionCreatingForLot();
	}

	@Test
	public void createDenonciationTest() throws InterruptedException, IOException
	{
    	clickOnProgram();
		createDenonciation();
		ContactGeneralInfo CGI = new ContactGeneralInfo();
		CGI.contactsPage();
	}
	

}
