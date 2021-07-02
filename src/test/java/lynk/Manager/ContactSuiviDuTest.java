package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactSuiviDuTest extends ContactSuiviDu{
	
	
	@Test
	public void suiviDuContactScreen() throws InterruptedException, IOException
	{
		ContactGeneralInfoTest info  = new ContactGeneralInfoTest();
		info.link();
		ContactSecondBuyerTest toaster= new ContactSecondBuyerTest();
		toaster.getToasterMessage();
		
		suiviDuContact();
	}

}
