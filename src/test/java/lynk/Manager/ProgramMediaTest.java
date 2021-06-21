package lynk.Manager;

import java.io.IOException;

import org.testng.annotations.Test;

public class ProgramMediaTest extends ProgramMedia{
	
	/** To Check For Media Screen 
	 * @throws IOException */
	@Test
	public void mediaTypes() throws InterruptedException, IOException
	{
		ProgramLotsTest lot = new ProgramLotsTest();
		lot.testingForAppartements();
		Thread.sleep(2000);
		mediaScreen();
	}

}
