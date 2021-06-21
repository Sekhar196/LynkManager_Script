package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactSecondBuyerTest extends ContactSecondBuyer{
	
	/** To Check For Second Buyer Of Contact 
	 * @throws IOException */
	@Test
	public void secondBuyScreen() throws InterruptedException, IOException
	{
		ContactGeneralInfoTest info = new ContactGeneralInfoTest();
		info.link();
//		Thread.sleep(15000);
		getToasterMessage();
		secondBuyerScreen();
		info.addName();
		info.addLastName();
		info.enterPhone();
		info.record();
	}

}
