package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactDocumentationTest extends ContactDocumentation{
	
	
	@Test
	public void documentationScreen() throws InterruptedException, IOException
	{
		ContactGeneralInfoTest info  = new ContactGeneralInfoTest();
		info.link();
		ContactSecondBuyerTest toaster= new ContactSecondBuyerTest();
		toaster.getToasterMessage();
		
		contactDocScreen();
	}

}
