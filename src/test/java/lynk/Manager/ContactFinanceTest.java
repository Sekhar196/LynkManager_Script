package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactFinanceTest extends ContactFinance{
	
	/** To Check For Finance Screen 
	 * @throws IOException */
	@Test
	public void financeTest() throws InterruptedException, IOException
	{
		ContactGeneralInfoTest search = new ContactGeneralInfoTest();
		search.link();
		ContactSecondBuyerTest toaster= new ContactSecondBuyerTest();
		toaster.getToasterMessage();
		
		financeScreen();
	}
	
	/** To Check For Delete 
	 * @throws IOException */
	@Test
	public void deleteTest() throws InterruptedException, IOException
	{
		ContactSearchCriteriaTest search = new ContactSearchCriteriaTest();
		search.searchScreen();
		financeScreen();
		clickOnDelete();
	}

}
