package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactSearchCriteriaTest extends ContactSearchCriteria {
	
	/** To Check For Search Criteria Of Contact 
	 * @throws IOException */
	@Test
	public void searchScreen() throws InterruptedException, IOException
	{
		ContactPersonalInfoTest pInfo = new ContactPersonalInfoTest();
		pInfo.personalInfo();		
		searchCriteriaScreen();
	}

}
