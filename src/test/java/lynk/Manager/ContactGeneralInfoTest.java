package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ContactGeneralInfoTest extends ContactGeneralInfo{
	
	/** To Check For General InformAtion Of Contact 
	 * @throws IOException */
	@Test
	public void link() throws InterruptedException, IOException
	{
		openContactScreen();
		contactsPage();
	}

}
