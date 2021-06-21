package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactPersonalInfoTest extends ContactPersonalInfo{
	
	/** To Check For Personal Information Of Contact 
	 * @throws IOException */
	@Test
	public void personalInfo() throws InterruptedException, IOException
	{
		ContactSecondBuyerTest info = new ContactSecondBuyerTest();
		info.secondBuyScreen();
		
		personalInformation();
	}

}
