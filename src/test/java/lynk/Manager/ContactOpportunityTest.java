package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactOpportunityTest extends ContactOpportunities{
	
	/** To Check For Opportunity Of Contact 
	 * @throws IOException */
	@Test
	public void opportunityTest() throws InterruptedException, IOException
	{
		ContactGeneralInfoTest info  = new ContactGeneralInfoTest();
		info.link();
		ContactSecondBuyerTest toaster= new ContactSecondBuyerTest();
		toaster.getToasterMessage();
		
		opportunityScreen();
		
	}

}
