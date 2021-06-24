package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactOpportunityTest extends ContactOpportunities{
	
	/** To Check For Opportunity Of Contact 
	 * @throws IOException */
	@Test
	public void opportunityTest() throws InterruptedException, IOException
	{
		ContactSearchCriteriaTest cst = new ContactSearchCriteriaTest();
		cst.searchScreen();
		
		opportunityScreen();
		
	}

}
