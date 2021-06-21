package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramFiltersTest extends ProgrammesHomeScreen{
	
	/** To Check For Filters */
	@Test
	public void filtering()
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		filterButton();
		status();
		zone();
		securite();
		chauffage();
		minPrix();
		maxPrix();
		search();
	}
	
	/** To Check For Reset */
	@Test
	public void resetTest() throws InterruptedException
	{
		filtering();
		Thread.sleep(10000);
		reset();
	}
	
	/** To Check For Program View 
	 * @throws IOException */
	@Test
	public void progView() throws InterruptedException, IOException
	{
		AdminLogin login = new AdminLogin();
		login.loginToLynkmanager();
		Thread.sleep(35000);
		ProgramInformationsGénérales info = new ProgramInformationsGénérales();
		info.clickOnProgram();
		programeView();
		Thread.sleep(35000);
		selectStatus();
	}

}
